/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
@SuppressWarnings("serial")
public class Rotating_Dots extends JApplet implements MouseMotionListener,MouseListener{
int dr = 0,temp;
int curx=250,cury=150;
int dx,dy;
int angle;
boolean drag = false;
boolean drag_allowed (int x ,int y)
{
if( (x>curx-dr/2)&&(x<curx+100+dr)&&(y>cury-dr/2)&&(y<cury+100+dr) )
   return true;
else
   return false; 
}

boolean increasing = true;


public void paint(Graphics g)
{
Graphics2D g2d = (Graphics2D)g;

g2d.setBackground(Color.BLACK);
g2d.clearRect(0, 0, this.getWidth(),this.getHeight());
g2d.setColor(Color.white);
g2d.fillOval(curx-dr/2 , cury-dr/2 ,100+dr,100+dr);
g2d.rotate(Math.toRadians(angle),curx+50,+cury+50);
g2d.setColor(Color.red);
g2d.fillOval(290+curx-250,120+cury-150,20,20);
g2d.setColor(Color.yellow);
g2d.fillOval(360+curx-250,190+cury-150,20,20);
g2d.setColor(Color.green);
g2d.fillOval(290+curx-250,260+cury-150,20,20);
g2d.setColor(Color.blue.brighter());
g2d.fillOval(220+curx-250,190+cury-150,20,20);
}

    @Override
    public void init() {
        addMouseMotionListener(this);
        addMouseListener(this);
        setSize(600,400);
        Timer tmr  = new Timer(40,new ActionListener(){
        public void actionPerformed(ActionEvent e){
            angle+=4;
            if((dr<20)&&(increasing==true))
            dr+=1;
            else
            dr-=1;
            if(dr==20)
            increasing=false;
            else if(dr==0)
            increasing = true;   
            repaint();
            }});
        tmr.start();
       
        
       
    }
    // TODO overwrite start(), stop() and destroy() methods

    public void mouseDragged(MouseEvent e) {
        
        if(drag==true){
            curx=getMousePosition().x-dx;
            cury =getMousePosition().y-dy;
        }
        
    }

    public void mouseMoved(MouseEvent e) {
    
    }

    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mousePressed(MouseEvent e) {
     drag = drag_allowed(getMousePosition().x,getMousePosition().y);
     dx=getMousePosition().x-curx;
     dy=getMousePosition().y-cury;
            
    }

    public void mouseReleased(MouseEvent e) {
            drag=false;

    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param x the x to set
     */
  
}
