/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Data_Connectivity.java
 *
 * Created on Jan 31, 2013, 5:26:53 PM
 */
package $_School_Programs_12th_STD_SemI_$;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class Data_Connectivity extends javax.swing.JFrame {

    /** Creates new form Data_Connectivity */
    public Data_Connectivity() {
        initComponents();
    }
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public void display(JTable tab)
    {
        DefaultTableModel dtm = (DefaultTableModel) tab.getModel();
        try
        {
            Class.forName("java.sql.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","student");
            stmt = con.createStatement();
            
            String q = "SELECT * FROM loanac;";
            dtm.setRowCount(0);
            rs = stmt.executeQuery(q);
            while(rs.next())
            {
                dtm.addRow(new Object[]
                {
                    rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)
                });
            }
            tab.setModel(dtm);
            
            con.close();
            rs.close();
            stmt.close();
            
        }
        
        catch(Exception x)
        {
            JOptionPane.showMessageDialog(null,x.getMessage());
        }
    }

    public void nav(JTable tab)
    {
        int r = tab.getSelectedRow();
        a.setText(tab.getValueAt(r, 0).toString());
        b.setText(tab.getValueAt(r, 1).toString());
        c.setText(tab.getValueAt(r, 2).toString());
        d.setText(tab.getValueAt(r, 3).toString());
        e.setText(tab.getValueAt(r, 4).toString());
        f.setText(tab.getValueAt(r, 5).toString());
        g.setText(tab.getValueAt(r, 6).toString());
        h.setText(tab.getValueAt(r, 7).toString());
    }
    
    public void absnav(int i)
    {
        try
        {
            Class.forName("java.sql.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","student");
            stmt = con.createStatement();
            
            String q = "SELECT * FROM loanac;";
            
            rs = stmt.executeQuery(q);
            
            while(rs.absolute(i))
            {
                a.setText(rs.getString(1));
                b.setText(rs.getString(2));
                c.setText(rs.getString(3));
                d.setText(rs.getString(4));
                e.setText(rs.getString(5));
                f.setText(rs.getString(6));
                g.setText(rs.getString(7));
                h.setText(rs.getString(8));
            }
        }
        
        catch(Exception x)
        {
            JOptionPane.showMessageDialog(null,x.getMessage());
        }
    }
    
    public void absnavproto(String type) //type may be previous,next,first or last
    {
        try
        {
            String te = a.getText();
            Class.forName("java.sql.Driver");
           con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","student");
            stmt = con.createStatement();
            
            String q = "SELECT * FROM loanac;";
            
            rs = stmt.executeQuery(q);
            while(rs.next())
            {
                a.setText(rs.getString(1));
                b.setText(rs.getString(2));
                c.setText(rs.getString(3));
                d.setText(rs.getString(4));
                e.setText(rs.getString(5));
                f.setText(rs.getString(6));
                g.setText(rs.getString(7));
                h.setText(rs.getString(8));
                
                if(te.equals(a.getText()) && type.equals("previous"))
                {
                    while(rs.previous())
                    {
                        a.setText(rs.getString(1));
                        b.setText(rs.getString(2));
                        c.setText(rs.getString(3));
                        d.setText(rs.getString(4));
                        e.setText(rs.getString(5));
                        f.setText(rs.getString(6));
                        g.setText(rs.getString(7));
                        h.setText(rs.getString(8));
                        break;
                    }
                    break;
                }
                
                if(te.equals(a.getText()) && type.equals("next"))
                {
                    while(rs.next())
                    {
                        a.setText(rs.getString(1));
                        b.setText(rs.getString(2));
                        c.setText(rs.getString(3));
                        d.setText(rs.getString(4));
                        e.setText(rs.getString(5));
                        f.setText(rs.getString(6));
                        g.setText(rs.getString(7));
                        h.setText(rs.getString(8));
                        break;
                    }
                    break;
                }
                
                if(type.equals("first"))
                {
                    while(rs.first())
                    {
                        a.setText(rs.getString(1));
                        b.setText(rs.getString(2));
                        c.setText(rs.getString(3));
                        d.setText(rs.getString(4));
                        e.setText(rs.getString(5));
                        f.setText(rs.getString(6));
                        g.setText(rs.getString(7));
                        h.setText(rs.getString(8));
                        break;
                    }
                    break;
                }
                
                if(te.equals(a.getText()) && type.equals("last"))
                {
                    while(rs.last())
                    {
                        a.setText(rs.getString(1));
                        b.setText(rs.getString(2));
                        c.setText(rs.getString(3));
                        d.setText(rs.getString(4));
                        e.setText(rs.getString(5));
                        f.setText(rs.getString(6));
                        g.setText(rs.getString(7));
                        h.setText(rs.getString(8));
                        break;
                    }
                    break;
                }
            }
            
            con.close();
            rs.close();
            stmt.close();
            
        }
        
        catch(Exception x)
        {
            
        }
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
        tab = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        h = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        nex = new javax.swing.JButton();
        pre = new javax.swing.JButton();
        hl = new javax.swing.JLabel();
        gl = new javax.swing.JLabel();
        fl = new javax.swing.JLabel();
        el = new javax.swing.JLabel();
        dl = new javax.swing.JLabel();
        cl = new javax.swing.JLabel();
        bl = new javax.swing.JLabel();
        al = new javax.swing.JLabel();
        de = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        re = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "empno", "ename", "job", "mgr", "hiredate", "sal", "comm", "deptno"
            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        tab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tabFocusLost(evt);
            }
        });
        tab.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Navigation"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, -1));
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, -1));
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 150, -1));
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, -1));
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, -1));
        jPanel1.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, -1));
        jPanel1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 150, -1));
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 30, 150, -1));

        nex.setText("Next");
        nex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexActionPerformed(evt);
            }
        });
        jPanel1.add(nex, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 110, -1));

        pre.setText("Previous");
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });
        jPanel1.add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        hl.setText("deptno");
        jPanel1.add(hl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 20));

        gl.setText("comm");
        jPanel1.add(gl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 20));

        fl.setText("sal");
        jPanel1.add(fl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 20));

        el.setText("hiredate");
        jPanel1.add(el, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 20));

        dl.setText("mgr");
        jPanel1.add(dl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 20));

        cl.setText("job");
        jPanel1.add(cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, 20));

        bl.setText("ename");
        jPanel1.add(bl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 20));

        al.setText("empno");
        jPanel1.add(al, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 20));

        de.setText("Delete");
        de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deActionPerformed(evt);
            }
        });

        jButton4.setText("First");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Last");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton3");

        re.setText("Refresh");
        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(de, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(re, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(de, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int i = 0;
private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed
 display(tab);
}//GEN-LAST:event_reActionPerformed

private void tabPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_tabPropertyChange

private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked

}//GEN-LAST:event_tabMouseClicked

private void tabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabFocusGained
// TODO add your handling code here:
    
}//GEN-LAST:event_tabFocusGained

private void tabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabFocusLost

}//GEN-LAST:event_tabFocusLost

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    absnavproto("first");
}//GEN-LAST:event_jButton4ActionPerformed

private void nexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexActionPerformed
// TODO add your handling code here:
    absnavproto("next");
}//GEN-LAST:event_nexActionPerformed

private void preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preActionPerformed
// TODO add your handling code here:
    absnavproto("previous");
}//GEN-LAST:event_preActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    absnavproto("last");
}//GEN-LAST:event_jButton5ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
    display(tab);
}//GEN-LAST:event_formWindowOpened

    private void deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Connectivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Connectivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Connectivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Connectivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Data_Connectivity().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JLabel al;
    private javax.swing.JTextField b;
    private javax.swing.JLabel bl;
    private javax.swing.JTextField c;
    private javax.swing.JLabel cl;
    private javax.swing.JTextField d;
    private javax.swing.JButton de;
    private javax.swing.JLabel dl;
    private javax.swing.JTextField e;
    private javax.swing.JLabel el;
    private javax.swing.JTextField f;
    private javax.swing.JLabel fl;
    private javax.swing.JTextField g;
    private javax.swing.JLabel gl;
    private javax.swing.JTextField h;
    private javax.swing.JLabel hl;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nex;
    private javax.swing.JButton pre;
    private javax.swing.JButton re;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
