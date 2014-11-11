/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Color_Changing_Dot extends JApplet {
int color=5;
int i=0;
public void paint(Graphics g)
{

Graphics2D g2d = (Graphics2D)g;
g2d.setColor(new Color(color,color,color));
g2d.fill(new Ellipse2D.Double(25,25,150,150));

}
    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
           setSize(200,200);
     Timer tmr = new Timer(20,new ActionListener(){
        public void actionPerformed(ActionEvent e){
          if((color==255)||(color==0))
           i++;
          if((i%2)==0)
          color+=5;
          else
          color-=5;
          
       repaint();
        }});
         tmr.start();  
    }
    // TODO overwrite start(), stop() and destroy() methods
}
