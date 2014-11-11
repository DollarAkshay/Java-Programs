package tanks;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TanksApplet extends JFrame implements KeyListener, Runnable
{
    int maj, min, rev, pbc, ebc, score;
    Thread t;
    boolean gamewon, gamestart, gamelost;
    Image player, enemy, win, lose, prestart, background, playerBomb, enemyBomb;
    BufferedImage buffer;
    String title, xPos, health, points;
    Player p1 = new Player(208, 552, 64, 48, 3);
    Enemy[]npc = new Enemy[1000];
    PlayerBomb[] pbomb = new PlayerBomb[1000];
    EnemyBomb[]ebomb = new EnemyBomb[1000];
    int level;

    public TanksApplet(){
        try {
            init();
        } catch (IOException e) {
            System.out.println("ffffaaaaiillll");
            e.printStackTrace();
        }
    }

    public void init() throws IOException {
        title = "Saturn Engine: Test";
        maj = 0;
        min = 2;
        rev = 0;
        pbc = -1;
        ebc = -1;
        score = 0;
        level = 0;
        buffer = new BufferedImage(500,640, BufferedImage.TYPE_INT_RGB);
        generateEnemies();
        player = ImageIO.read(new File("src/tanks/player.png"));
        enemy = ImageIO.read(new File("src/tanks/enemy.png"));
        win = ImageIO.read(new File("src/tanks/win.png"));
        lose = ImageIO.read(new File("src/tanks/lose.png"));
        prestart = ImageIO.read(new File("src/tanks/prestart.png"));
        background = ImageIO.read(new File("src/tanks/bg.png"));
        playerBomb = ImageIO.read(new File("src/tanks/pbomb.png"));
        enemyBomb = ImageIO.read(new File("src/tanks/ebomb.png"));
        addKeyListener(this);
        t = new Thread(this);
        t.start();
        setSize(500,640);
        setVisible(true);
    }

    public void reset(){
        gamestart = false;
        gamewon = false;
        gamelost = false;
        pbc = -1;
        ebc = -1;
        score = 0;
        p1.health = 3;
        level = 0;
        generateEnemies();
    }
    public void generateEnemies(){
        for(int i = 0; i < (25 * (level+1)); i++){
            int x = (int)(Math.random()*1500);
            int y = (int)(Math.random()*320);
            npc[i] = new Enemy(x, y, 48, 32);
            npc[i].hit = false;
        }
    }
    
    public void enemyFire(){
        int rng = (int)(Math.random()*20);
        int pickEnemy = (int)(Math.random()*(25*(level+1)));
        if(gamestart && !gamewon && !gamelost && rng == 1 || rng == 20){
            if(!npc[pickEnemy].hit){
                ebc++;
                ebomb[ebc] = new EnemyBomb(npc[pickEnemy].xPos, npc[pickEnemy].yPos, 8, 12);
            }
        }
    }

    @Override
    public void paint(Graphics g){
        g = getContentPane().getGraphics();
        Graphics backg = buffer.createGraphics();
        backg.setColor(Color.black);
        backg.fillRect(0,0,480,640);
        collisionDetection();
        enemyFire();
        xPos = "X = " + p1.xPos;
        health = "Lives Remaining: " + p1.health;
        points = "Score: " + score;
        backg.drawImage(background, 0, 0, this);
        backg.setColor(Color.white);
        backg.drawString(title + " " + maj + "." + min + "." + rev, 2, 12);
        backg.drawString(xPos, 2, 24);
        backg.drawString(health, 2, 36);
        backg.drawString(points, 2, 48);
        if(!gamestart){
            backg.drawImage(prestart, 10, 120, this);
        }
        checkGameEnd();
        if(gamelost){
           backg.drawImage(lose, 10, 120, this);
        }
        backg.drawImage(player, p1.xPos, p1.yPos, this);
        for(int i = 0; i <= pbc; i++){
            pbomb[i].moveUp();
            backg.drawImage(playerBomb, pbomb[i].xPos, pbomb[i].yPos, this);
        }
        for(int i = 0; i < 25*(level+1); i++){
            if(!npc[i].hit){
                npc[i].moveLeft();
                backg.drawImage(enemy, npc[i].xPos, npc[i].yPos, this);
            }
        }
        for(int i = 0; i <= ebc; i++){
            ebomb[i].moveDown();
            backg.drawImage(enemyBomb, ebomb[i].xPos, ebomb[i].yPos, this);
        }
        if(score == 25*(level+1)){
            backg.drawImage(win, 10, 120, this);
            gamewon = true;
        }
        g.drawImage(buffer, 0,0,this);
    }
    
    public void checkGameEnd(){
        if(!gamewon && !gamelost){
            if(p1.health <= 0)
                gamelost = true;
            
        }
    }
    
    public void playerShoot(){
        if(!gamelost && !gamewon && gamestart){
            pbc++;
            pbomb[pbc] = new PlayerBomb(p1.xPos + 28, p1.yPos - 4, 8, 16);
        }
    }
    
    public void levelUp(){
        if(gamewon){
            level++;
            score = 0;
            gamewon = false;
            pbc = -1;
            ebc = -1;
            p1.health = 3;
            generateEnemies();
        }        
    }
    
    public void collisionDetection(){
        for(int i = 0; i <= pbc; i++){
            for(int j = 0; j < 25*(level+1); j++){
                if(npc[j].xPos-pbomb[i].width <= pbomb[i].xPos && npc[j].xPos+npc[j].width >= pbomb[i].xPos+pbomb[i].width && npc[j].yPos <= pbomb[i].yPos && npc[j].yPos+npc[j].height >= pbomb[i].yPos && !npc[j].hit){
                    npc[j].hit = true;
                    pbomb[i].xPos = 1500;
                    score++;
                }
            }
        }
        for(int i = 0; i <= ebc; i++){
            if(p1.xPos <= ebomb[i].xPos - ebomb[i].width
                    && p1.xPos + p1.width >= ebomb[i].xPos
                    && p1.yPos <= ebomb[i].yPos + ebomb[i].height
                    && p1.yPos + p1.height >= ebomb[i].yPos){
                p1.health--;
                ebomb[i].xPos = 1500;
            }
        }
    }

    public void run() {
        while(true){
            try{
                Thread.sleep(10);
                repaint();
            }
            catch(InterruptedException e){
            }
        }
    }



    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_LEFT)
            p1.moveLeft();
        if(keyCode == KeyEvent.VK_RIGHT)
            p1.moveRight();
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_SPACE){
            playerShoot();
        }
        if(keyCode == KeyEvent.VK_R)
            reset();
        if(keyCode == KeyEvent.VK_ENTER && !gamestart){
            gamestart = true;
        }
        if(keyCode == KeyEvent.VK_ENTER && gamewon){
            levelUp();
        }
    }

    public static void main(String[] args) {
        TanksApplet ta = new TanksApplet();
    }
}