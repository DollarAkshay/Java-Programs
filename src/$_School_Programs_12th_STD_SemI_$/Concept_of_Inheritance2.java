/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Concept_of_Inheritance2.java
 *
 * Created on Jun 20, 2012, 1:54:33 PM
 */

package $_School_Programs_12th_STD_SemI_$;
import $_School_Programs_12th_STD_SemI_$.Concept_of_Inheritance1;

/**
 *
 * @author student
 */
public class Concept_of_Inheritance2 extends javax.swing.JFrame {

    /** Creates new form Concept_of_Inheritance2 */
    public Concept_of_Inheritance2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Display = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Display.setText("Display Degre");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 50));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setText("Graduate Class");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Concept_of_Inheritance2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Display;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
