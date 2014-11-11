/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Show_Selection.java
 *
 * Created on May 31, 2012, 7:19:54 PM
 */
package Simple_Programs;

/**
 *
 * @author $Akshay$
 */
@SuppressWarnings("serial")
public class Show_Selection extends javax.swing.JFrame{
    
    /** Creates new form Show_Selection */
    public Show_Selection() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        City = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        City1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        LOGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GGGG");
        setName("frame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jList1.setBackground(new java.awt.Color(36, 0, 122));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(227, 197, 0));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "    10:30 AM", "    12:30 PM", "    02:00 PM", "    04:30 PM", "    06:00 PM", "    07:30 PM", "    10:00 PM" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 100, 160));

        City.setFont(new java.awt.Font("PMingLiU", 1, 18)); // NOI18N
        City.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahmedabad", "Bangalore", "Chennai", "Cochin", "Delhi", "Kolkata", "Mumbai", "Pune" }));
        getContentPane().add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 142, 30));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 197, 0));
        jLabel1.setText("Select your City");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(227, 197, 0));
        jLabel2.setText("Select Show Tmings");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        City1.setFont(new java.awt.Font("PMingLiU", 1, 18)); // NOI18N
        City1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7" }));
        getContentPane().add(City1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 142, 30));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(227, 197, 0));
        jLabel4.setText("Select your Movie");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(13, 58, 148));
        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(227, 197, 0));
        jButton1.setText("Select Seats");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        getContentPane().add(tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 330, 40));

        jButton2.setText("Plan B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        LOGO.setBackground(new java.awt.Color(36, 0, 122));
        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other_Program_Images/pvr_logo.jpg"))); // NOI18N
        LOGO.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LOGO.setOpaque(true);
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 506, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

new Seat_Selection().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String p = new Seat_Selection().seats;
tf.setText(""+p);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Show_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Show_Selection().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox City;
    private javax.swing.JComboBox City1;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
