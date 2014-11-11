/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Dots_Animation extends JApplet {
Random color_hue = new Random();
int r1,g1,b1,r2,g2,b2,r3,g3,b3,r4,g4,b4,r5,g5,b5;   
int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
int h1=60,h2=120,h3=180,h4=240,h5=300;
    @Override
    public void paint(Graphics g)
    {
        
    Graphics2D g2d = (Graphics2D) g;
    if(h1>=300){
    Random rx1 = new Random(),ry1 = new Random();
    x1=rx1.nextInt(200)-20;y1=ry1.nextInt(600);
    h1=30;
    r1 = color_hue.nextInt(255); 
    g1 = color_hue.nextInt(255); 
    b1 = color_hue.nextInt(255);
    }
    g2d.setColor(new Color(r1,g1,b1));
    g2d.fill(new Ellipse2D.Double(x1,y1,h1,h1));
    
    if(h2>=300){
    Random rx2 = new Random(),ry2 = new Random();
    x2=rx2.nextInt(200)+160;y2=ry2.nextInt(600);
    h2=30;
    r2 = color_hue.nextInt(255); 
    g2 = color_hue.nextInt(255); 
    b2 = color_hue.nextInt(255);
    }
    g2d.setColor(new Color(r2,g2,b2));
    g2d.fill(new Ellipse2D.Double(x2,y2,h2,h2));
    
    if(h3>=300){
    Random rx3 = new Random(),ry3 = new Random();
    x3=rx3.nextInt(200)+320;y3=ry3.nextInt(600);
    h3=30;
    r2 = color_hue.nextInt(255); 
    g3 = color_hue.nextInt(255); 
    b3 = color_hue.nextInt(255);
    }
    g2d.setColor(new Color(r3,g3,b3));
    g2d.fill(new Ellipse2D.Double(x3,y3,h3,h3));
    
    if(h4>=300){
    Random rx4 = new Random(),ry4 = new Random();
    x4=rx4.nextInt(200)+480;y4=ry4.nextInt(600);
    h4=30;
    r4 = color_hue.nextInt(255); 
    g4 = color_hue.nextInt(255); 
    b4 = color_hue.nextInt(255);
    }
    g2d.setColor(new Color(r4,g4,b4));
    g2d.fill(new Ellipse2D.Double(x4,y4,h4,h4));
    
    
    if(h5>=300){
    Random rx5 = new Random(),ry5 = new Random();
    x5=rx5.nextInt(200)+640;y5=ry5.nextInt(600);
    h5=30;
    r5 = color_hue.nextInt(255); 
    g5 = color_hue.nextInt(255); 
    b5 = color_hue.nextInt(255);
    }
    g2d.setColor(new Color(r5,g5,b5));
    g2d.fill(new Ellipse2D.Double(x5,y5,h5,h5));
    
    
    }
    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
        Timer t = new Timer(30,new ActionListener(){
       public void actionPerformed(ActionEvent e){
            h1+=10; x1-=5;y1-=5;
            h2+=10; x2-=5;y2-=5;
            h3+=10; x3-=5;y3-=5;
            h4+=10; x4-=5;y4-=5;
            h5+=10; x5-=5;y5-=5;
           
            
            repaint();
         
       }});   
        t.start();
        
       setSize(800,600); // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
