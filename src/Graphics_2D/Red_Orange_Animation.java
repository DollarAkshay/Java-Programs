/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Red_Orange_Animation extends JApplet {
  boolean start=false;  
float i=0,t;
double theta;
int x=0,y=0;
public void paint(Graphics g)
{
Graphics2D g2 = (Graphics2D) g;
Graphics2D g1 = (Graphics2D) g;
GradientPaint redtowhite = new GradientPaint(2,250,Color.yellow,19,250,Color.red,true);
g1.setPaint(Color.BLACK);
g2.setPaint(redtowhite);
g2.rotate(theta,400,300);
g2.fill (new Rectangle.Double(400,300,20,500));
g1.fill (new Ellipse2D.Double(375,275,50,50));

}
    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
      setSize(800,600);
     Timer tmr = new Timer(25,new ActionListener(){
        public void actionPerformed(ActionEvent e){
       theta+=0.017;
       repaint();
       i+=10;
       
        }
       }
               );
         tmr.start();
        // TODO start asynchronous download of heavy resources
    
    // TODO overwrite start(), stop() and destroy() methods


    }
}