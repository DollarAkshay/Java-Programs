/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LCM_and_HCF.java
 *
 * Created on May 25, 2012, 1:15:46 PM
 */

package $_School_Programs_12th_STD_SemI_$;

/**
 *
 * @author student
 */
public class LCM_and_HCF extends javax.swing.JFrame {

    /** Creates new form LCM_and_HCF */
    public LCM_and_HCF() {
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

        Title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        HCF = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        num3 = new javax.swing.JTextField();
        num4 = new javax.swing.JTextField();
        LCM = new javax.swing.JButton();
        reshcf = new javax.swing.JLabel();
        reslcm = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 204, 0));
        Title.setText("HCF and LCM");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Number 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Number 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 30));

        num1.setText("0");
        num1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 96, 30));

        num2.setText("0");
        num2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 96, 30));

        HCF.setBackground(new java.awt.Color(255, 255, 0));
        HCF.setText("HCF");
        HCF.setBorder(null);
        HCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HCFActionPerformed(evt);
            }
        });
        getContentPane().add(HCF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 10, 250));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Number 1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 70, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Number 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 70, 30));

        num3.setText("0");
        num3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 96, 30));

        num4.setText("0");
        num4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 96, 30));

        LCM.setBackground(new java.awt.Color(255, 255, 0));
        LCM.setText("LCM");
        LCM.setBorder(null);
        LCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LCMActionPerformed(evt);
            }
        });
        getContentPane().add(LCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 100, 40));

        reshcf.setForeground(new java.awt.Color(51, 204, 0));
        reshcf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        getContentPane().add(reshcf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 80, 30));

        reslcm.setForeground(new java.awt.Color(51, 204, 0));
        reslcm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        getContentPane().add(reslcm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 80, 30));

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Background.setOpaque(true);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HCFActionPerformed
int n1 = Integer.parseInt(num1.getText());
int n2 = Integer.parseInt(num2.getText());
int res = 1;
int max;
if(n1>n2)
    max=n1;
else
    max=n2;

for(int i=max;i>0;i--)
{
if(((n1%i)==0)&&((n2 %i)==0)){
res =i;
break;}
}
reshcf.setText(""+res);

    }//GEN-LAST:event_HCFActionPerformed

    private void LCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LCMActionPerformed
   int n1 = Integer.parseInt(num3.getText());
int n2 = Integer.parseInt(num4.getText());
int res = 1;
int max;
if(n1>n2)
    max=n1;
else
    max=n2;

for(int i=1;i<(n1*n2);i++)
{
if(((i%n1)==0)&&((i%n2)==0)){
res =i;
break;}
}
reslcm.setText(""+res);

    }//GEN-LAST:event_LCMActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LCM_and_HCF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton HCF;
    private javax.swing.JButton LCM;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField num3;
    private javax.swing.JTextField num4;
    private javax.swing.JLabel reshcf;
    private javax.swing.JLabel reslcm;
    // End of variables declaration//GEN-END:variables

}
