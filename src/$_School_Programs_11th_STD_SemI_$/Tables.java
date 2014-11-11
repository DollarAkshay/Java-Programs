/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tables.java
 *
 * Created on Sep 10, 2011, 6:07:35 PM
 */
package $_School_Programs_11th_STD_SemI_$;

/**
 *
 * @author $Akshay$
 */
public class Tables extends javax.swing.JFrame {

    /** Creates new form Tables */
    public Tables() {
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

        range = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tables = new javax.swing.JTable();
        num = new javax.swing.JTextField();
        range1 = new javax.swing.JRadioButton();
        range2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "x", "1", "=", "0"},
                {"0", "x", "2", "=", "0"},
                {"0", "x", "3", "=", "0"},
                {"0", "x", "4", "=", "0"},
                {"0", "x", "5", "=", "0"},
                {"0", "x", "6", "=", "0"},
                {"0", "x", "7", "=", "0"},
                {"0", "x", "8", "=", "0"},
                {"0", "x", "9", "=", "0"},
                {"0", "x", "10", "=", "0"}
            },
            new String [] {
                "Primary Number", "X", "Secondary Number", "=", "Product"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tables);

        num.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num.setText("0");
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        num.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                numInputMethodTextChanged(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numKeyReleased(evt);
            }
        });

        range.add(range1);
        range1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        range1.setText("0-10");
        range1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                range1ActionPerformed(evt);
            }
        });

        range.add(range2);
        range2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        range2.setText("11-20");
        range2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                range2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(range1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(range2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(range1)
                        .addGap(8, 8, 8)
                        .addComponent(range2)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed

}//GEN-LAST:event_numActionPerformed

private void numInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_numInputMethodTextChanged

}//GEN-LAST:event_numInputMethodTextChanged

private void numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyPressed

}//GEN-LAST:event_numKeyPressed

private void numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyReleased
int n = Integer.parseInt(num.getText());
int i,j;
if(range1.isSelected()==true){
for(j=0;j<=4;j=j+2)
{
for(i=0;i<=9;i++)
{
    if(j==1)
tables.setValueAt(n,i,j);
    else if (j==2)
tables.setValueAt(i+1,i,j);
    else if (j==4)
tables.setValueAt(n*(i+1),i,j);
        }
}
}

if(range2.isSelected()==true)
{
for(j=0;j<=4;j=j+2)
{
for(i=0;i<=9;i++)
{
    if(j==1)
tables.setValueAt(n,i,j);
    else if (j==2)
tables.setValueAt(i+11,i,j);
    else if (j==4)
tables.setValueAt(n*(i+11),i,j);
        }
}
}

}//GEN-LAST:event_numKeyReleased

private void range1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_range1ActionPerformed
int n = Integer.parseInt(num.getText());
int i,j;
for(j=0;j<=4;j=j+2)
{
for(i=0;i<=9;i++)
{
    if(j==1)
tables.setValueAt(n,i,j);
    else if (j==2)
tables.setValueAt(i+1,i,j);
    else if (j==4)
tables.setValueAt(n*(i+1),i,j);
        }
}
    
}//GEN-LAST:event_range1ActionPerformed

private void range2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_range2ActionPerformed
int n = Integer.parseInt(num.getText());
int i,j;
for(j=0;j<=4;j=j+2)
{
for(i=0;i<=9;i++)
{
    if(j==1)
tables.setValueAt(n,i,j);
    else if (j==2)
tables.setValueAt(i+11,i,j);
    else if (j==4)
tables.setValueAt(n*(i+11),i,j);
        }
}
}//GEN-LAST:event_range2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tables().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField num;
    private javax.swing.ButtonGroup range;
    private javax.swing.JRadioButton range1;
    private javax.swing.JRadioButton range2;
    private javax.swing.JTable tables;
    // End of variables declaration//GEN-END:variables
}
