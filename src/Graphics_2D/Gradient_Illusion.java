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
 * @author student
 */
public class Gradient_Illusion extends JApplet {
GradientPaint Grad_Oval;
    int x=0;
    int row=0,evenrow=0;
    @Override
public void paint(Graphics g)
{

Graphics2D g2d = (Graphics2D)g;
GradientPaint Grad1 = new GradientPaint(0,x,Color.BLACK,0,30+x,Color.WHITE,true);

g2d.setPaint(Grad1);
g2d.fillRect(0,0,500,600);
while(row<2){
Grad_Oval = new GradientPaint(100,100+30*row,Color.BLACK,100,130+30*row,Color.WHITE,true);
g2d.setPaint(Grad_Oval);
g2d.fill(new Ellipse2D.Double(100+50*evenrow,100+30*row,25,30));
g2d.fill(new Ellipse2D.Double(200+50*evenrow,100+30*row,25,30));
g2d.fill(new Ellipse2D.Double(300+50*evenrow,100+30*row,25,30));
g2d.fill(new Ellipse2D.Double(400+50*evenrow,100+30*row,25,30));
row++;
evenrow=row%2;
}
row=0;


}
    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
     setSize(500,600);
     Timer tmr = new Timer(50,new ActionListener(){
        public void actionPerformed(ActionEvent e){
       x+=10;

       repaint();
        }});
         tmr.start();
    }



}
