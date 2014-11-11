/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Particle_System extends JApplet implements MouseListener,MouseMotionListener {

int n = 10000;   
int x[] = new int[n];
int y[] = new int[n];
double vx[] = new double[n];
double vy[] = new double[n];
int particle = 0;
boolean run=true;
int xcentre =-1;
int ycentre =-1;
Timer t = new Timer (100,new ActionListener(){
public void actionPerformed(ActionEvent e){
repaint();
}});
    
public void paint(Graphics g){
Graphics2D g2d = (Graphics2D) g;
g2d.setBackground(Color.BLACK);
g2d.setColor(Color.YELLOW);
g2d.clearRect(0, 0, getWidth(),getHeight());
for(int i = 0;i<x.length;i++)
{
if((x[i]!=-1)&&(y[i]!=-1)&&(run==true)){
if((xcentre!=-1)&&(xcentre!=-1)){
double theta;
if(x[i]!=xcentre)
theta= Math.atan((ycentre-y[i])/(xcentre-x[i]));
else 
theta = 0;
theta=Math.abs(theta);
double dist=Math.pow((xcentre-x[i])*(xcentre-x[i])+(ycentre-y[i])*(ycentre-y[i]),0.5);
dist=dist/500;
double ax = (double) (Math.cos(theta))*Math.pow(dist,2)*10;
double ay = (double) (Math.sin(theta))*Math.pow(dist,2)*10;
if(x[i]>xcentre)
vx[i]-=ax;
else
vx[i]+=ax;
if(y[i]>ycentre)
vy[i]-=ay;
else
vy[i]+=ay;
}
x[i]+=vx[i];
y[i]+=vy[i];
}
if((x[i]!=-1)&&(y[i]!=-1))
g2d.drawRect((int)x[i],(int)y[i],0,0);
}
g2d.setColor(Color.WHITE);
g2d.drawOval(xcentre-2,ycentre-2,4,4 );
}
    
public void init() {
setSize(800,600);
addMouseListener( this );
addMouseMotionListener( this );
for(int i = 0;i<x.length;i++)
{
x[i]=-1;
y[i]=-1;
vx[i]=0;
vy[i]=0;
}
t.start();
}  


 private AlphaComposite makeComposite(float alpha) {
  int type = AlphaComposite.SRC_OVER;
  return(AlphaComposite.getInstance(type, alpha));
 }
 
@Override
    public void mouseDragged(MouseEvent e) {
    
    Random r = new Random();
    int no =0;
    int randomness = 20;
    while(no<100){
    int dist = r.nextInt(randomness)-randomness/2;
     x[particle]=getMousePosition().x+dist;
     dist = r.nextInt(randomness)-randomness/2;
     y[particle]=getMousePosition().y+dist;
     int u =1;
     vx[particle]=r.nextInt(u*2+1)-(u/2)-1;
     vy[particle]=r.nextInt(u*2+1)-(u/2)-1;
     if(vy[particle]==0)
     vy[particle]-=1;
     particle ++;
     no++;
     if(particle>=x.length)
     particle=0;
     
    }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      
    }

    @Override
    public void mouseClicked(MouseEvent e) {
 
    }

    
    public void mousePressed(MouseEvent e) {
       if(e.getButton()==MouseEvent.BUTTON3){
      xcentre=getMousePosition().x;
      ycentre=getMousePosition().y;
      }
     if(e.getButton()==MouseEvent.BUTTON2){
      for(int i = 0;i<x.length;i++)
{
x[i]=-1;
y[i]=-1;
vx[i]=0;
vy[i]=0;
}
xcentre =-1;
ycentre =-1;
      }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
     
    }

   
    
    }
