/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Lets_make_Bhindi.java
 *
 * Created on Nov 9, 2011, 6:31:00 PM
 */
package Simple_Programs;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Lets_make_Bhindi extends javax.swing.JFrame {

    /** Creates new form Lets_make_Bhindi */
    public Lets_make_Bhindi() {
        initComponents();
        Timer t = new Timer(10,
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
           if(drop==true)
           {
           if((dropping==null)||(dropping.getY()>=500)&&(veg.getX()+(veg.getWidth()/4)>=470)&&(veg.getX()+(veg.getWidth()/2)<=570))
           dropping=veg;
           if(dropping.getY()<=500)
           dropping.setLocation(dropping.getX(),dropping.getY()+2);
           }
       
           }
        });
        t.start();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plant = new javax.swing.JLabel();
        bhindi4 = new javax.swing.JLabel();
        bhindi3 = new javax.swing.JLabel();
        bhindi2 = new javax.swing.JLabel();
        bhindi1 = new javax.swing.JLabel();
        bhindi = new javax.swing.JLabel();
        spot = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/plant.png"))); // NOI18N
        plant.setFocusable(false);
        getContentPane().add(plant, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 420, 420));

        bhindi4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/bhindi_90.png"))); // NOI18N
        bhindi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                focus(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sfgh(evt);
            }
        });
        bhindi4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                picking(evt);
            }
        });
        getContentPane().add(bhindi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 40, 90));

        bhindi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/bhindi_135.png"))); // NOI18N
        bhindi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                focus(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sfgh(evt);
            }
        });
        bhindi3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                picking(evt);
            }
        });
        getContentPane().add(bhindi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 90, 90));

        bhindi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/bhindi_45.png"))); // NOI18N
        bhindi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                focus(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sfgh(evt);
            }
        });
        bhindi2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                picking(evt);
            }
        });
        getContentPane().add(bhindi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 90, 90));

        bhindi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/bhindi_45.png"))); // NOI18N
        bhindi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                focus(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sfgh(evt);
            }
        });
        bhindi1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                picking(evt);
            }
        });
        getContentPane().add(bhindi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 90));

        bhindi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/bhindi_90.png"))); // NOI18N
        bhindi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                focus(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sfgh(evt);
            }
        });
        bhindi.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                picking(evt);
            }
        });
        getContentPane().add(bhindi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        spot.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spot.setText("<html>Place <br>Here</html>");
        spot.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        spot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                spotMouseEntered(evt);
            }
        });
        getContentPane().add(spot, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 100, 100));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/basketball_ring.jpg"))); // NOI18N
        bg.setFocusable(false);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int dx=0,dy=0;
int i,x,y;
Component veg,dropping;
boolean drop;


    private void picking(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picking
veg=evt.getComponent();
if((veg.getY()!=500)||(veg.getY()!=500)){

if(i==0){
x=veg.getX();
y=veg.getY();
dx = getMousePosition().x-x;
dy = getMousePosition().y-y;
}
veg.setLocation(getMousePosition().x-dx,getMousePosition().y-dy);
i++;


}
    }//GEN-LAST:event_picking

    private void focus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_focus
veg.requestFocus();

        
    }//GEN-LAST:event_focus

    private void sfgh(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sfgh
i=0;    
   if(!((veg.getX()+(veg.getWidth()/4)>=470)&&(veg.getX()+(veg.getWidth()/2)<=570)&&(veg.getY()+(veg.getHeight()/2)>=100)&&(veg.getY()+(veg.getHeight()/2)<=200)))
            veg.setLocation(x,y);
    }//GEN-LAST:event_sfgh

    private void spotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spotMouseEntered
if((veg.getX()+(veg.getWidth()/4)>=470)&&(veg.getX()+(veg.getWidth()/2)<=570)&&(veg.getY()+(veg.getHeight()/2)>=100)&&(veg.getY()+(veg.getHeight()/2)<=200))
    drop=true;

    }//GEN-LAST:event_spotMouseEntered

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
            java.util.logging.Logger.getLogger(Lets_make_Bhindi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lets_make_Bhindi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lets_make_Bhindi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lets_make_Bhindi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Lets_make_Bhindi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bhindi;
    private javax.swing.JLabel bhindi1;
    private javax.swing.JLabel bhindi2;
    private javax.swing.JLabel bhindi3;
    private javax.swing.JLabel bhindi4;
    private javax.swing.JLabel plant;
    private javax.swing.JLabel spot;
    // End of variables declaration//GEN-END:variables
}
