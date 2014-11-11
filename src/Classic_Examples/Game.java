package Classic_Examples;

/* Welcome to the third video in the Java Applet Games tutorial series.
	in this video we will cover smooth movement.
	this will be useless at this point, but we will be using timers because loops
	frankly suck in applets, they stop everything else from happening except
	whats inside the loop, here is how to make a timer.
	The timer is set with a period of 10 milliseconds and a delay of 100 millisecs
	this means that every 100 miliseconds if the right key is pressed it will move
	one pixel to the right, same with the other directions. as we removed the
	repaint we need to include it again, so i'll put it inside the timer.
	As you can see 100ms is very slow and the repaint method being called
	so often resorts in a lot of flickering. lets make it a bit faster just for
	testing purposes.
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Game extends Applet implements KeyListener{

	public int x,y;
	public boolean right, left, down, up;
	public void init(){
		addKeyListener(this);
		setSize(200,200);
		setBackground(Color.BLACK);
		Timer t = new Timer();
		t.schedule(new TimerTask(){public void run(){
		if (right == true){
		x++;
		}
		if (left == true){
		x--;
		}
		if (up == true){
		y--;
		}
		if (down == true){
		y++;
		}
		repaint();
		}},10,10);
	}
        
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.drawOval(x,y,5,5);
	}
	public void keyTyped(KeyEvent e){}
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == 37){
		left = true;
		}
		if (e.getKeyCode() == 39){
		right = true;
		}
		if (e.getKeyCode() == 38){
		up = true;
		}
		if (e.getKeyCode() == 40){
		down = true;
		}
	}
	public void keyReleased(KeyEvent e){
	if (e.getKeyCode() == 37){
		left = false;
		}
		if (e.getKeyCode() == 39){
		right = false;
		}
		if (e.getKeyCode() == 38){
		up = false;
		}
		if (e.getKeyCode() == 40){
		down = false;
		}
	}
        
}