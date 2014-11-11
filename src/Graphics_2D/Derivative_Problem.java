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
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Derivative_Problem extends JApplet{
    int x=0;
    @Override
    public void paint(Graphics g)
{

Graphics2D g2d = (Graphics2D)g;
g2d.setColor(Color.WHITE);
g2d.fillRect(0, 0,400,400);
g2d.setColor(Color.BLACK);
g2d.drawLine(50,100,50,160);
g2d.drawLine(50+x,140,50+x,160);
g2d.setColor(Color.GREEN.darker());
g2d.drawLine(50,100,50+x,140);
g2d.drawLine(50,160,50+x,160);
g2d.drawString(""+x,300,25);
g2d.setColor(Color.RED.brighter());
g2d.drawLine(50+x,141,50+(x*3/2),160);
g2d.drawLine(50+x,160,50+(x*3/2),160);
g2d.drawString(""+(x/2),300,50);
}
    @Override
    
     public void init() {
        setSize(500,500);
        Timer tmr = new Timer(250,new ActionListener(){
        public void actionPerformed(ActionEvent e){
       x++;
       repaint();
        }});
         tmr.start();  
    }
    // TODO overwrite start(), stop() and destroy() methods
}
