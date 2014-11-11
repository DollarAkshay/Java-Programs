/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tanks;

/**
 *
 * @author Edward
 */
public class EnemyBomb {
    int xPos, yPos, width, height;
    public EnemyBomb(int xPos, int yPos, int width, int height){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }
    public void moveDown(){
        yPos+=10;
    }
}
