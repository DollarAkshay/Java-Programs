package $_School_Programs_11th_STD_SemI_$;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.Icon;
import javax.swing.ImageIcon;
/*
 * TypeC_pg296.java
 *
 * Created on Jul 19, 2011, 1:32:35 PM
 */

/**
 *
 * @author student
 */
public class TypeC_pg296 extends javax.swing.JFrame {

    /** Creates new form TypeC_pg296 */
    public TypeC_pg296() {
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

        disp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        mumb = new javax.swing.JButton();
        darj = new javax.swing.JButton();
        shimla = new javax.swing.JButton();
        sri = new javax.swing.JButton();
        bang = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        disp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 250));

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 116, 270, 260));

        mumb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mumb.setForeground(new java.awt.Color(102, 153, 0));
        mumb.setText("Mumbai");
        mumb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mumbActionPerformed(evt);
            }
        });
        getContentPane().add(mumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, 40));

        darj.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        darj.setForeground(new java.awt.Color(102, 153, 0));
        darj.setText("Dargeling");
        darj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darjActionPerformed(evt);
            }
        });
        getContentPane().add(darj, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 140, 40));

        shimla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        shimla.setForeground(new java.awt.Color(102, 153, 0));
        shimla.setText("Shimla");
        shimla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shimlaActionPerformed(evt);
            }
        });
        getContentPane().add(shimla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, 40));

        sri.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sri.setForeground(new java.awt.Color(102, 153, 0));
        sri.setText("Srinagar");
        sri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sriActionPerformed(evt);
            }
        });
        getContentPane().add(sri, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 140, 40));

        bang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bang.setForeground(new java.awt.Color(102, 153, 0));
        bang.setText("Bangalore");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });
        getContentPane().add(bang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 40));

        pic.setText("jLabel2");
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 70, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void darjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darjActionPerformed
ta.setText("DARJLING\n ---------- \n Hilstation perfect for a holiday \n Rs.5000 per day ");
disp.setIcon(new ImageIcon("http://himachaltourism.gov.in/HimachalIT/image.axd?picture=/Thumbnails/shimlainsnow_thumb_550_368.jpg"));


// TODO add your handling code here:
}//GEN-LAST:event_darjActionPerformed

    private void sriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sriActionPerformed
ta.setText("SRINAGAR\n ---------- \n Situated in J&K it has really cold wether. \n Rs.7500 per day ");
        // TODO add your handling code here:
}//GEN-LAST:event_sriActionPerformed

    private void mumbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mumbActionPerformed
ta.setText("MUMBAI\n ---------- \n Busy city with hardworking people \n Rs.15000 per day ");

        // TODO add your handling code here:
    }//GEN-LAST:event_mumbActionPerformed

    private void shimlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shimlaActionPerformed
ta.setText("SHIMLA\n ---------- \n Awesome place with awesome wether \n Rs.5000 per day ");
        // TODO add your handling code here:
    }//GEN-LAST:event_shimlaActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
ta.setText("BANGALORE\n ---------- \n Awesome place with awesome people \n Rs.25000 per day  Tour package");
        // TODO add your handling code here:
    }//GEN-LAST:event_bangActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypeC_pg296().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bang;
    private javax.swing.JButton darj;
    private javax.swing.JLabel disp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mumb;
    private javax.swing.JLabel pic;
    private javax.swing.JButton shimla;
    private javax.swing.JButton sri;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables

}
