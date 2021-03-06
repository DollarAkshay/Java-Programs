/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ray_Optics.java
 *
 * Created on Jul 14, 2012, 3:18:45 PM
 */
package Simple_Programs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author aki
 */
public class Ray_Optics extends javax.swing.JFrame {

    /** Creates new form Ray_Optics */
    public Ray_Optics() {
        initComponents();
        screen.setViewportView(drawpanel);
       drawpanel.repaint();
       drawpanel.setAutoscrolls(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empty = new javax.swing.JLabel();
        screen = new javax.swing.JScrollPane();
        focal_length = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        focus = new javax.swing.JSlider();
        scr_dx = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 300));

        screen.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        screen.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 300));

        focal_length.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        getContentPane().add(focal_length, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 118, 45));

        generate.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        generate.setText("<html>\n  Generate \nRay Diagram</html>");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        getContentPane().add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 401, 150, 60));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Enter Focal Length");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 45));

        focus.setMaximum(150);
        focus.setMinimum(10);
        focus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                focusMouseDragged(evt);
            }
        });
        getContentPane().add(focus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        scr_dx.setMaximum(290);
        scr_dx.setMinimum(-290);
        scr_dx.setValue(0);
        scr_dx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                scr_dxMouseDragged(evt);
            }
        });
        getContentPane().add(scr_dx, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabel2.setText("©$Dollar Akshay$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int f=50;
int sdx=0;
    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
f = Integer.parseInt(focal_length.getText());
repaint();
    }//GEN-LAST:event_generateActionPerformed

    private void focusMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_focusMouseDragged
 f = focus.getValue();
repaint();     
ta.setText("Focus :"+f+"Object :"+sdx);
// TODO add your handling code here:
    }//GEN-LAST:event_focusMouseDragged

    private void scr_dxMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scr_dxMouseDragged
sdx=scr_dx.getValue();
    repaint();
ta.setText("Focus :"+f+"\nObject :"+sdx);
    }//GEN-LAST:event_scr_dxMouseDragged
 public final class InnerClassDrawingPanel extends javax.swing.JPanel {    
        @Override
        protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        super.paintComponent(g2d);
        g2d.setBackground(Color.WHITE);
        g2d.clearRect(0, 0,600,300);
        g2d.translate(300,150);
        g2d.setStroke(new java.awt.BasicStroke(2));
        g2d.drawLine(-300,0,400,0);
        g2d.drawArc(-4*f,-2*f,4*f,4*f,-30,60);
        g2d.setColor(new Color(255,0,0));
        g2d.fillOval(-5-f,-5,10,10);
        g2d.setColor(new Color(0,255,0));
        g2d.fillOval(-5-f*2,-5,10,10);
        g2d.setColor(new Color(0,155,255));
        g2d.drawLine(-50+sdx,0,-50+sdx,f);
        
        drawpanel.setAutoscrolls(true);
        
        }}
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
            java.util.logging.Logger.getLogger(Ray_Optics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ray_Optics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ray_Optics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ray_Optics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ray_Optics().setVisible(true);
            }
        });
    }
    private InnerClassDrawingPanel drawpanel = new InnerClassDrawingPanel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empty;
    private javax.swing.JTextField focal_length;
    private javax.swing.JSlider focus;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider scr_dx;
    private javax.swing.JScrollPane screen;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
