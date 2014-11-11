/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics_2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JApplet;
import javax.swing.JButton;

/**
 *
 * @author $Akshay$
 */

@SuppressWarnings("serial")
public class Equation_Graph extends JApplet implements ComponentListener,MouseWheelListener{
    
double I= -300;
float x1,y1;
float x2,y2;
float x3,y3;
double yscale=1,xscale=1;
double pi = Math.PI;
double inp=0.0001;
JButton b1;

@Override
public void paint(Graphics g)
{

Graphics2D g2d = (Graphics2D)g;
g2d.setBackground(Color.WHITE);
g2d.clearRect(0, 0,rootPane.getWidth(),rootPane.getHeight());

int dx=(getWidth()/2)%50;
int dy=((getHeight()-50)/2)%50;
//Vertical Lines
for(int i=dx-50;i<=getWidth();i+=10){
if(((i-dx)%50)==0)
g2d.setColor(new Color(180,180,180));
else
g2d.setColor(new Color(220,220,220));   
g2d.drawLine(i,0,i,getHeight()-50);
}

//Horizontal Lines
for(int i=dy-50;i<=getHeight()-50;i+=10){
if(((i-dy)%50)==0)
g2d.setColor(new Color(180,180,180));
else
g2d.setColor(new Color(220,220,220));   
g2d.drawLine(0,i,getWidth(),i);
}

//Quadrants
g2d.setColor(new Color(0,0,0));
g2d.setStroke(new BasicStroke(2F));
g2d.drawLine(getWidth()/2,0,getWidth()/2,getHeight()-50);
g2d.drawLine(0,(getHeight()-50)/2,getWidth(),(getHeight()-50)/2);
//End of Graph Drawing

//Start of Equation Drawing
g2d.translate(getWidth()/2,(getHeight()-50)/2);

final float fact=1f;
g2d.setStroke(new BasicStroke(2F));
double init = -getWidth()/2/fact/xscale;
double condi = getWidth()/2/fact/xscale;
for(I=init;I<=condi;I+=inp/xscale)
{
    
 
x1=(float)(I*fact);
//&&&&&&&&& Equation Here &&&&&&&&&&&&&&
int temp = Math.round(x1);
y1=(float) Math.sin(pi/2*x1/10 + x1*x1*x1*x1*x1/100000)*100;
x1*=xscale;
y1*=yscale;

  
x2=(float)(I*fact);
//&&&&&&&&& Equation Here &&&&&&&&&&&&&&
y2=(float) ((1*x2*20 + (3-1)*(1*38)*(1*38))/(1*x2*20 + 7000))*300;
x2*=xscale;
y2*=yscale;


x3=(float)(I*fact);
//&&&&&&&&& Equation Here &&&&&&&&&&&&&&
y3=(float) Math.hypot(y1,y2);
x3*=xscale;
y3*=yscale;


g2d.setColor(new Color(250,50,50)); 
g2d.drawLine((int)x1,(int)-y1,(int)x1,(int)-y1); 
g2d.setColor(new Color(0,200,50)); 
//g2d.drawLine((int)x2,(int)-y2,(int)x2,(int)-y2);
g2d.setColor(new Color(0,150,250));    
//g2d.drawLine((int)x3,(int)-y3,(int)x3,(int)-y3); 
}

//End of Graphics Method
}
@Override
public void init(){
setSize(600,600); 
setLayout(null);
b1 = new JButton("X");
b1.setBounds(10,getHeight()-40,50 ,30);
add(b1);
b1.setVisible(true);
addComponentListener(this);
addMouseWheelListener(this);
 // TODO start asynchronous download of heavy resources
}
// TODO overwrite start(), stop() and destroy() methods
@Override
public void componentResized(ComponentEvent e) {
b1.setBounds(10,getHeight()-40,50 ,30);
}

@Override
public void componentMoved(ComponentEvent e) {

}

    @Override
    public void componentShown(ComponentEvent e) {
       
    }

    @Override
    public void componentHidden(ComponentEvent e) {
      
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
    float increase=-e.getWheelRotation();
    increase/=50;
    xscale+=increase;
    yscale+=increase;
    repaint();
    }

    

    
}
/*Great Equations

 * y=(float)Math.sin(6*x)*x;fact=300;I+=0.0005;
 * 
 */
