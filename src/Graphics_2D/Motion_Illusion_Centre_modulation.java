/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphics_2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author student
 */
public class Motion_Illusion_Centre_modulation extends JApplet {

    int color=130;
int i=0;
    @Override
public void paint(Graphics g)
{

Graphics2D g2d = (Graphics2D)g;
g2d.setColor(Color.lightGray);
g2d.fill(new Rectangle.Double(0,0,400,400));
g2d.setColor(new Color(color,color,color));
g2d.fill(new Rectangle.Double(25,25,150,150));
BasicStroke a = new BasicStroke(1);
g2d.setStroke(a);
g2d.setColor(Color.WHITE);
g2d.drawLine(24,25,24,175);//LEFT
g2d.drawLine(175,26,175,175);//RIGHT
g2d.setColor(new Color(125,125,125));
g2d.drawLine(25,24,174,24);//TOP
g2d.drawLine(24,175,174,175);//BOTTOM


}
    @Override
    public void init() {
        setSize(400,400);
        
     Timer tmr = new Timer(30,new ActionListener(){
        public void actionPerformed(ActionEvent e){
          if((color==255)||(color==125))
           i++;
          if((i%2)==0)
          color+=5;
          else
          color-=5;

       repaint();
        }});
         tmr.start();
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

}
