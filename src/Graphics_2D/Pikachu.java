/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphics_2D;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author student
 */
public class Pikachu extends JApplet {
double theta=Math.PI/80;
int triangle_x[]={297,327,312};
int triangle_y[]={320,320,330};
double x;
Component comp;
private BufferedImage createImage(String imageFile,
                                               Component c) {
    Image image = c.getToolkit().getImage(imageFile);

    BufferedImage bufferedImage = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
   Graphics2D g2d = bufferedImage.createGraphics();
    g2d.drawImage(image, 0, 0, c);

    return bufferedImage;
  }

public void paint(Graphics g)
{

Graphics2D g2 = (Graphics2D) g;
Graphics2D g1 = (Graphics2D) g;

g2.setColor(Color.BLACK);
//Ears
g2.drawArc(120, 115, 100, 200, 000, 100);
g2.drawArc(160, 020, 100, 200, 180, 100);
g2.drawArc(400, 100, 100, 200,  90, 100);
g2.drawArc(350, 020, 100, 200, 270, 100);

//Face
g2.drawArc(160, 185, 300, 300, 000, 360);
//Face Fill
g2.setColor(Color.YELLOW);
g2.fill(new Ellipse2D.Double(161, 186, 298, 298));
//Red Dots
g2.setColor(Color.RED);
g2.fill(new Ellipse2D.Double(410,350,30,45));
g2.fill(new Ellipse2D.Double(180,350,30,45));
//Eyes
GradientPaint FirstEyeGradient = new GradientPaint(220,250,Color.GRAY,260,290,Color.BLACK,true);
g2.setPaint(FirstEyeGradient);
g2.fill(new Ellipse2D.Double(220,250,40,40));
GradientPaint SecondEyeGradient = new GradientPaint(360,250,Color.GRAY,400,290,Color.BLACK,true);
g2.setPaint(SecondEyeGradient);
g2.fill(new Ellipse2D.Double(360,250,40,40));
//Pupil
g2.setColor(Color.WHITE);
g2.fill(new Ellipse2D.Double(232,268,18,18));
g2.fill(new Ellipse2D.Double(372,268,18,18));
//Nose
g2.setColor(Color.BLACK);
g2.fillPolygon(triangle_x, triangle_y, 3);




}
    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
    setSize(800,600);
        Timer tmr = new Timer(25,new ActionListener(){
        public void actionPerformed(ActionEvent e){
        x+=0.001;
        
repaint();
        }});
         tmr.start();
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

}
