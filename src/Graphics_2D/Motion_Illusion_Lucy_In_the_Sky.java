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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author student
 */
@SuppressWarnings("serial")
public class Motion_Illusion_Lucy_In_the_Sky extends JApplet implements KeyListener{
int color=130;
int i=0;
Timer tmr;
boolean shade=true;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
int[] x={250,306,366,383,351,383,366,305,249,194,133,116,148,116,133,194};
int[] y={153,121,137,199,255,309,371,388,356,388,372,309,254,199,137,121};
int[] p1x={194,250,306,250};
int[] p1y={121, 89,121,153};
int[] p2x={306,321,383,366};
int[] p2y={121,183,199,137};
int[] p3x={383,351,383,415};
int[] p3y={199,255,310,255};
int[] p4x={383,366,305,321};
int[] p4y={310,371,388,327};
int[] p5x={305,249,194,249};
int[] p5y={388,356,388,420};
int[] p6x={194,133,116,178};
int[] p6y={388,372,309,326};
int[] p7x={116,148,116,84};
int[] p7y={309,254,199,254};
int[] p8x={116,133,194,178};
int[] p8y={199,137,121,183};
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
public void paint(Graphics g)
{
Graphics2D g2d = (Graphics2D)g;
g2d.setColor(Color.LIGHT_GRAY);
g2d.fillRect(0, 0, getWidth(), getHeight());
if(shade==true){
g2d.setColor(new Color(color,color,color));//Changing Color

g2d.fillPolygon(p1x,p1y,4);//Rhombus 1
g2d.fillPolygon(p2x,p2y,4);//Rhombus 2
g2d.fillPolygon(p3x,p3y,4);//Rhombus 3
g2d.fillPolygon(p4x,p4y,4);//Rhombus 4
g2d.fillPolygon(p5x,p5y,4);//Rhombus 5
g2d.fillPolygon(p6x,p6y,4);//Rhombus 6
g2d.fillPolygon(p7x,p7y,4);//Rhombus 7
g2d.fillPolygon(p8x,p8y,4);//Rhombus 8
}

//Shape Outline
g2d.setColor(new Color(100,100,100));
g2d.drawPolygon(x, y,16);
g2d.rotate((Math.PI/4),250,255);
g2d.setColor(Color.WHITE);
g2d.drawPolygon(x, y,16);



}
    @Override
    public void init() {
        addKeyListener(this);
        setSize(500,500);
       tmr = new Timer(25,new ActionListener(){
        public void actionPerformed(ActionEvent e){
          if((color==255)||(color==105))
           i++;
          if((i%2)==0)
          color+=5;
          else
          color-=5;
          repaint();
        }});
         tmr.start();
        // TODO start asynchronous download of heavy resources
    }

    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== 39)
        {
            shade=true;
            repaint();
        }
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            shade=false;
            repaint();
        }
    }

    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



    // TODO overwrite start(), stop() and destroy() methods

}
