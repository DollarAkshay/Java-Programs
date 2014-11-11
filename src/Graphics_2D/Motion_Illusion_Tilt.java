/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphics_2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
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
public class Motion_Illusion_Tilt extends JApplet {

    int color=65;
int i=0;
    @Override
public void paint(Graphics g)
{

Graphics2D g2d = (Graphics2D)g;
g2d.setColor(Color.lightGray);
g2d.fill(new Rectangle.Double(0,0,400,400));//Backgroung
g2d.setColor(new Color(color,color,color));
g2d.fill(new Rectangle.Double(175,50,50,300));
BasicStroke a = new BasicStroke(2);
g2d.setStroke(a);
GradientPaint Line_Grad = new GradientPaint(0,50,Color.DARK_GRAY,0,350,Color.WHITE);
g2d.setPaint(Line_Grad);
g2d.drawLine(174,51,174,349);//LEFT
Line_Grad = new GradientPaint(0,50,Color.WHITE,0,350,Color.DARK_GRAY);
g2d.setPaint(Line_Grad);
g2d.drawLine(225,51,225,349);//RIGHT


}
    @Override
    public void init() {
        setSize(400,400);
        
     Timer tmr = new Timer(30,new ActionListener(){
        public void actionPerformed(ActionEvent e){
          if((color==255)||(color==55))
           i++;
          if((i%2)==0)
          color+=10;
          else
          color-=10;

       repaint();
        }});
         tmr.start();
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

}
