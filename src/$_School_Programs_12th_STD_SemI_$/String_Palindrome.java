/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * String_Palindrome.java
 *
 * Created on Jun 1, 2012, 12:52:46 AM
 */
package $_School_Programs_12th_STD_SemI_$;

/**
 *
 * @author $Akshay$
 */
public class String_Palindrome extends javax.swing.JFrame {

    /** Creates new form String_Palindrome */
    public String_Palindrome() {
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

        n = new javax.swing.JTextField();
        tt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        p = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n.setText("string");
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 200, 40));

        tt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, 40));

        jButton1.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        jButton1.setText("Reverse and Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 240, 50));

        p.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 24)); // NOI18N
        p.setForeground(new java.awt.Color(255, 124, 255));
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 310, 60));

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 124, 255));
        jLabel3.setText("String Reversing");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 124, 255));
        jLabel1.setText("Reverse String :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 40));

        jLabel4.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 124, 255));
        jLabel4.setText("Enter a String :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 40));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String s = n.getText();
String r = "";
for(int i = s.length()-1;i>=0;i--)
{
r += s.charAt(i);
}
tt.setText(""+r);
if(s.equals(r)) {
            p.setText("Palindrome");
        }
else {
            p.setText("Not Palindrome");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(String_Palindrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(String_Palindrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(String_Palindrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(String_Palindrome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new String_Palindrome().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField n;
    private javax.swing.JLabel p;
    private javax.swing.JTextField tt;
    // End of variables declaration//GEN-END:variables
}
