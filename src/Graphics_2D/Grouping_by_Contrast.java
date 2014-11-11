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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */

public class Grouping_by_Contrast extends JApplet implements KeyListener{
    private static final long serialVersionUID = 1L;
float r=50,g=80,b=40;
int ri=0,gi=0,bi=0;
boolean bg=false;
    @Override
public void paint(Graphics gr)
{
Graphics2D g2d = (Graphics2D)gr;
if(bg==true){
GradientPaint Grad1 = new GradientPaint(160,0,Color.BLACK,180,0,Color.YELLOW);
g2d.setPaint(Grad1);
}
else
{
g2d.setPaint(Color.WHITE);
}
g2d.fillRect(0,0,600,400);

g2d.setColor(new Color((int)r,(int)g,(int)b));
g2d.fill(new Ellipse2D.Double(50,100,50,50));
g2d.fill(new Ellipse2D.Double(250,100,50,50));  

} 
    
    @Override
    public void init() 
    {
        addKeyListener(this);
        setSize(350,200);
        Timer tmr = new Timer(100,new ActionListener(){
        public void actionPerformed(ActionEvent e){
          //RED~RED~RED~RED~RED~RED~
          if((r==200)||(r==20))
           ri++;
          if((ri%2)==0)
          r+=15;
          else
          r-=15;
          //GREEN~GREEN~GREEN~GREEN~
          if((g==230)||(g==50))
           gi++;
          if((gi%2)==0)
          g+=15;
          else
          g-=15;
          //BLUE~BLUE~BLUE~BLUE~BLUE~
          if((b==190)||(b==10))
           bi++;
          if((bi%2)==0)
          b+=15;
          else
          b-=15;
          
       repaint();
        }});
         tmr.start();  
    }

    public void keyTyped(KeyEvent e) {
        
    }

    public void keyPressed(KeyEvent e) {
     if(bg==true){
           bg=false;
           repaint();
           }
           else
           {
           bg=true;
           repaint();
           } 
       
    }

    public void keyReleased(KeyEvent e) {
        
    }
    
    }
 

