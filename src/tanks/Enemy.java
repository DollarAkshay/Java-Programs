/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks;

/**
 *
 * @author Edward
 */
public class Enemy {
    int xPos, yPos, width, height, speed;
    boolean hit;
    public Enemy(int xPos, int yPos, int width, int height){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        speed = (int)((Math.random()*5)+1);
    }
    public void moveLeft(){
        xPos -= speed;
        if(xPos < -width){
            xPos = 1500;
            speed = (int)((Math.random()*5)+1);
            yPos = (int)((Math.random()*320));
        }
    }
}
