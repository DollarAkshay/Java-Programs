/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Smooth_key_movement.java
 *
 * Created on Nov 6, 2011, 9:09:44 PM
 */
package Simple_Games;

import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author $Akshay$
 */
public class Smooth_key_movement extends javax.swing.JFrame {

    /** Creates new form Smooth_key_movement */
    public Smooth_key_movement() {
        initComponents();
        Timer move = new Timer(20,new ActionListener(){
            public void actionPerformed(ActionEvent e){
               if(right==true)
                   if(o.getX()<=380)
                   x+=n;
               if(left==true)
                   if(o.getX()>=0)
                   x-=n;
               if(down==true)
                   if(o.getY()<=380)
                   y+=n;
               if(up==true)
                    if(o.getY()>=0)
                  y-=n;
  
               o.setLocation(x,y);
            
               
            }});
        move.start();

             
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        space = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        o = new javax.swing.JTextField();
        s = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        space.setBackground(new java.awt.Color(0, 0, 0));
        space.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spaceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spaceKeyReleased(evt);
            }
        });
        space.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jLabel1.setFocusable(false);
        space.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        o.setBackground(new java.awt.Color(0, 0, 0));
        o.setEditable(false);
        o.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        o.setForeground(new java.awt.Color(0, 153, 51));
        o.setText("2");
        o.setToolTipText("");
        o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        space.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 20, 20));

        s.setValue(n);
        s.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sStateChanged(evt);
            }
        });
        space.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        getContentPane().add(space, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int n=2;
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed



    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
 
    }//GEN-LAST:event_formKeyReleased

    private void spaceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spaceKeyPressed

		if (evt.getKeyCode() == 37){
		left = true;
		}
		if (evt.getKeyCode() == 39){
		right = true;
		}
		if (evt.getKeyCode() == 38){
		up = true;
		}
		if (evt.getKeyCode() == 40){
		down = true;
		}

    }//GEN-LAST:event_spaceKeyPressed

    private void spaceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spaceKeyReleased
		if (evt.getKeyCode() == 37){
		left = false;
		}
		if (evt.getKeyCode() == 39){
		right = false;
		}
		if (evt.getKeyCode() == 38){
		up = false;
		}
		if (evt.getKeyCode() == 40){
		down = false;
		}
    }//GEN-LAST:event_spaceKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
space.requestFocus();

    }//GEN-LAST:event_formWindowOpened

    private void sStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sStateChanged
 n= Integer.parseInt(s.getValue().toString());
 o.setText(""+n);
        space.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_sStateChanged
public boolean right, left, down, up;
public int x=100,y=100;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Smooth_key_movement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Smooth_key_movement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Smooth_key_movement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Smooth_key_movement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Smooth_key_movement().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField o;
    private javax.swing.JSpinner s;
    private javax.swing.JPanel space;
    // End of variables declaration//GEN-END:variables
}
