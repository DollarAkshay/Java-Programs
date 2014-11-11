/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;

/**
 *
 * @author $Akshay$
 */
@SuppressWarnings("serial")
public class Angle_of_Line extends JApplet implements MouseMotionListener{

    int mx,my;
    @Override
    public void paint(Graphics g)
{
double angle =Math.toDegrees(Math.atan2(-(my-200),(mx-200)));
if(angle<0)
angle+=360;
Graphics2D g2d = (Graphics2D)g;
g2d.setColor(Color.BLACK);
g2d.fillRect(0,0,500,400);
g2d.setColor(Color.YELLOW);
g2d.drawLine(200, 200,mx,my);
g2d.drawString(""+angle,350, 10);


}
    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    @Override
    public void init() {
        setSize(400,400);
       addMouseMotionListener(this);
        
    }
    // TODO overwrite start(), stop() and destroy() methods

    public void mouseDragged(MouseEvent e) {

      
    }

    public void mouseMoved(MouseEvent e) {
      mx=getMousePosition().x;
      my=getMousePosition().y;
      repaint();
    }
}
