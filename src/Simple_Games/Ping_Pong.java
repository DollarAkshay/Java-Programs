/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ping_Pong.java
 *
 * Created on Jan 11, 2012, 11:35:00 AM
 */

package Simple_Games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author student
 */
public class Ping_Pong extends javax.swing.JFrame {

    /** Creates new form Ping_Pong */
    public Ping_Pong() {
        initComponents();
Timer tmr = new Timer(20,new ActionListener(){
public void actionPerformed(ActionEvent e){
// ~~~~~~ Ball equations ~~~~~~~~~~

// ~~~~~~~~~ Y Equations ~~~~~~~~~~~
if(moving_down==false) {
by-=yspeed;
}
else {
by+=yspeed;
}
if(by<=0){
by=0;
moving_down=true;
}
else if ((bx>=px-10)&&(bx<=px+90)&&(by>=py-20)&&(by<=350))
{
yspeed+=0.1;
moving_down=false;
by=py-20;

xspeed=-(px-bx+40)/8;
if(xspeed==0)
{
Random r = new Random();
int l_r = r.nextInt(2);
if(l_r==0)
xspeed=-1;
else
xspeed=+1;
}
}
else if(by>=540) {
JOptionPane.showMessageDialog(null,"You Loose");
px=230;py=370;
bx=270;by=350;
right=false;left=false;
moving_down=false;
yspeed=5;
xspeed=0;
}

// ~~~~~~~~~ X Equations ~~~~~~~~~~~
bx+=xspeed;
if(bx>=580){
bx=580;
xspeed=-xspeed;
}
if(bx<=0){
bx=0;
xspeed=-xspeed;
}
// ~~~~ Pad Equations ~~~~~~~~~~
if((px<500)&&(right==true)) {
px+=5;
}
if((px>0)&&(left==true)) {
px-=5;
}
pad.setLocation(px,py);
pong.setLocation(bx,by);
}});
        tmr.start();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Game_Screen = new javax.swing.JPanel();
        pad = new javax.swing.JLabel();
        pong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Game_Screen.setBackground(new java.awt.Color(0, 0, 0));
        Game_Screen.setFocusable(false);
        Game_Screen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/pad.png"))); // NOI18N
        pad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                padFocusLost(evt);
            }
        });
        pad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                padKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                padKeyReleased(evt);
            }
        });
        Game_Screen.add(pad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 100, 20));

        pong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/pong.png"))); // NOI18N
        Game_Screen.add(pong, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game_Screen, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game_Screen, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean right=false,left=false;
int px=230,py=370;
int bx=270,by=350;
float yspeed=1,xspeed=0;
boolean moving_down=false;
    private void padKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_padKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
    right=true;
if(evt.getKeyCode()==KeyEvent.VK_LEFT)
    left=true;
    }//GEN-LAST:event_padKeyPressed

    private void padKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_padKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
    right=false;
if(evt.getKeyCode()==KeyEvent.VK_LEFT)
    left=false;
    }//GEN-LAST:event_padKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
pad.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void padFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_padFocusLost
pad.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_padFocusLost

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ping_Pong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Game_Screen;
    private javax.swing.JLabel pad;
    private javax.swing.JLabel pong;
    // End of variables declaration//GEN-END:variables

}
