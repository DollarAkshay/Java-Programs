/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author $Akshay$
 */
@SuppressWarnings("serial")
public class Mouse_Pointing_Arrow extends JApplet implements MouseMotionListener{
 int mx,my;
 int i;
 boolean display_angle = false;
 int px[]={240,240,300};
 int py[]={160,240,200};
    @Override
    public void paint(Graphics g)
{
    i++;
double angle =(Math.atan2(-(my-200),(mx-200)));
if(angle<0)
angle+=(Math.PI*2);
Graphics2D g2d = (Graphics2D)g;
if(display_angle == true)
g2d.drawString(""+angle,350, 10);
g2d.clearRect(0, 0, 500, 400);
g2d.setColor(Color.GREEN.darker());
g2d.rotate(-angle,200,200);
g2d.fillRect(150,175,100,50);
g2d.fillPolygon(px,py,3);



}
    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    @Override
    public void init() {
       setSize(450,400);
       addMouseMotionListener(this);
       // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods

    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseMoved(MouseEvent e) {
      mx=getMousePosition().x;
      my=getMousePosition().y;
      repaint();
    }
}
