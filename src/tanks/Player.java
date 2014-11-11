/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks;

/**
 *
 * @author Edward
 */
public class Player {
    int xPos, yPos, width, height, health;
    public Player(int xPos, int yPos, int width, int height, int health){
        this.xPos = xPos;
        this.yPos = yPos;
        this.height = height;
        this.width = width;
        this.health = health;
    }
    public void moveLeft(){
        if(xPos > 0)
            xPos -= 4;
    }
    public void moveRight(){
        if(xPos <= 480 - width)
            xPos += 4;
    }

}
