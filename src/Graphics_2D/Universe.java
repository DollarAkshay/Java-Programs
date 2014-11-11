/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JApplet;

/**
 *
 * @author $Akshay$
 */
public class Universe extends JApplet implements MouseMotionListener,MouseListener,KeyListener{
int rx=0,ry=0;
int dx,dy;
int pressx,pressy;
boolean rotatex=true,rotatey=true;
  public void paint(Graphics g)
{
Graphics2D g2d = (Graphics2D)g;

g2d.clearRect(0, 0,getWidth(),getHeight());
g2d.translate(getWidth()/2,getHeight()/2);
g2d.drawOval(-100, -100, 200, 200);
g2d.setColor(Color.red);
g2d.drawLine(0,0,(int)(100*Math.cos(Math.toRadians(rx-dx))),(int)(100*Math.sin(Math.toRadians(rx-dx))*Math.sin(Math.toRadians(ry-dy))));
g2d.setColor(Color.green);
g2d.drawLine(0,0,(int)(100*Math.cos(Math.toRadians(rx-dx+90))),(int)(100*Math.sin(Math.toRadians(rx-dx+90))*Math.sin(Math.toRadians(ry-dy))));
g2d.setColor(Color.blue);
g2d.drawLine(0,0,(int)-(100*Math.sin(Math.toRadians(rx-dx))*Math.sin(Math.toRadians(ry-dy))),(int)(100*Math.cos(Math.toRadians(ry-dy))));
float Vx = (float) (  Math.pow(  100*Math.cos(Math.toRadians(rx-dx))*100*Math.cos(Math.toRadians(rx-dx)) +   100*Math.sin(Math.toRadians(rx-dx))*Math.sin(Math.toRadians(ry-dy))*100*Math.sin(Math.toRadians(rx-dx))*Math.sin(Math.toRadians(ry-dy)) ,0.5)               );
float Vy = (float) (  Math.pow(  100*Math.cos(Math.toRadians(rx-dx+90))*100*Math.cos(Math.toRadians(rx-dx+90)) +   100*Math.sin(Math.toRadians(rx-dx+90))*Math.sin(Math.toRadians(ry-dy))*100*Math.sin(Math.toRadians(rx-dx+90))*Math.sin(Math.toRadians(ry-dy)) ,0.5)               );
g2d.drawString("RX="+(rx-dx)+"\tRY="+(ry-dy),-280,-270);
g2d.drawString("X="+Vx,-290,250);
g2d.drawString("Y="+Vy,-290,270);
}


public void init() {
setSize(600,600);
setFocusable(true);
requestFocusInWindow();
addMouseMotionListener(this);
addMouseListener(this);
addKeyListener(this);
}

  @Override
  public void mouseDragged(MouseEvent e) {
   
    if(rotatex==true)
    dx=pressx-getMousePosition().x;
    if(rotatey==true)
    dy=pressy-getMousePosition().y;
    repaint();
   
  }

  @Override
  public void mouseMoved(MouseEvent e) {
   
  }

  @Override
  public void mouseClicked(MouseEvent e) {
   
  }

  @Override
  public void mousePressed(MouseEvent e) {
   pressx=getMousePosition().x;
   pressy=getMousePosition().y;
    
    
  }

  @Override
  public void mouseReleased(MouseEvent e) {
  rx=rx-dx;
  ry=ry-dy;
  dx=0;dy=0;
  }

  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {
  
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()==KeyEvent.VK_X)
      rotatey=false;
    if(e.getKeyCode()==KeyEvent.VK_Y)
      rotatex=false;
     if(e.getKeyCode()==KeyEvent.VK_R){
      rx=0;ry=0; 
     }
    if(e.getKeyCode()==KeyEvent.VK_RIGHT)
      rx-=5;
    if(e.getKeyCode()==KeyEvent.VK_LEFT)
      rx+=5;
    if(e.getKeyCode()==KeyEvent.VK_UP)
      ry-=5;
    if(e.getKeyCode()==KeyEvent.VK_DOWN)
      ry+=5;
    repaint();
   
  }

  @Override
  public void keyReleased(KeyEvent e) {
      if(e.getKeyCode()==KeyEvent.VK_X)
      rotatey=true;
    if(e.getKeyCode()==KeyEvent.VK_Y)
      rotatex=true;
  }


}
