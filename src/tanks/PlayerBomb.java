/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks;

/**
 *
 * @author Edward
 */
public class PlayerBomb {
    int xPos, yPos, width, height;
    public PlayerBomb(int xPos, int yPos, int width, int height)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }
    public void moveUp(){
        yPos-=10;
    }
}
