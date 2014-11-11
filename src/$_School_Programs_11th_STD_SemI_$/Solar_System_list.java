/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Solar_System_list.java
 *
 * Created on Aug 25, 2011, 1:46:40 PM
 */

package $_School_Programs_11th_STD_SemI_$;

import javax.swing.ImageIcon;

/**
 *
 * @author student
 */
public class Solar_System_list extends javax.swing.JFrame {

    /** Creates new form Solar_System_list */
    public Solar_System_list() {
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
        planets = new javax.swing.JList();
        info = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        planets.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        planets.setForeground(new java.awt.Color(255, 0, 0));
        planets.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Mercury", "Venus", "Earth", "Mars", "Asteroids", "Jupiter", "Saturn", "Uranus", "Neptune" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        planets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planetsMouseClicked(evt);
            }
        });
        planets.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                planetsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(planets);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        info.setViewportView(jTextArea1);

        jButton1.setText("Visibliity");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        image.setBackground(new java.awt.Color(0, 0, 0));
        image.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(image, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
info.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void planetsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_planetsValueChanged
int p = planets.getSelectedIndex();
switch(p)
{
           case 0:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\mercury.jpg"));
        break;
            case 1:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\venus.gif"));
        break;
            case 2:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\earth.jpg"));
        break;
            case 3:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\mars.gif"));
        break;
            case 4:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\asteroids.jpg"));
        break;
            case 5:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\jupiter.jpg"));
        break;
            case 6:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\saturn.jpg"));
        break;
            case 7:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\uranus.jpg"));
        break;    case 8:
        image.setIcon(new ImageIcon("C:\\Users\\student\\Pictures\\Planets\\neptune.jpg"));
        break;

}
        // TODO add your handling code here:
    }//GEN-LAST:event_planetsValueChanged

    private void planetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planetsMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_planetsMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solar_System_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JScrollPane info;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList planets;
    // End of variables declaration//GEN-END:variables

}
