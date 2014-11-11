/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classic_Examples;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author $Akshay$
 */
public class Synchronised_Threads {

static int count=0;

synchronized static void increment()
{
count++;
}


public static void main(String args[]){
//~~~~~~~~~~ First Thread ~~~~~~~~~~~~
Thread t1=new Thread(new Runnable(){
@Override
public void run() {
for(int i=0;i<10000;i++)
increment();
}
});
//~~~~~~~~~~ Second Thread ~~~~~~~~~~~~  
Thread t2=new Thread(new Runnable(){
@Override
public void run() {
for(int i=0;i<10000;i++)
increment();
}
});

t1.start();
t2.start();
try {
t1.join();
t2.join();
}
catch (InterruptedException ex){
JOptionPane.showMessageDialog(null,ex.getMessage());
}


System.out.println("Count = "+count);
}
}
