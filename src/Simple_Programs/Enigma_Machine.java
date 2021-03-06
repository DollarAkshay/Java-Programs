/*
 * To change this template',' choose Tools | Templates
 * and open the template in the editor.
 */
package Simple_Programs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Enigma_Machine extends javax.swing.JFrame {

    /**
     * Creates new form Enigma_Machine
     */
    public Enigma_Machine() {
        initComponents();
      screen.add(graphics).setBounds(0,0,520,520);
      graphics.repaint();
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        pos = new javax.swing.JSpinner();
        Copyrights = new javax.swing.JLabel();
        screen = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Animation = new javax.swing.JRadioButton();
        encode = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        decode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 140));

        pos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                posStateChanged(evt);
            }
        });
        getContentPane().add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 180, 30));

        Copyrights.setText("©$Dollar Akshay$");
        getContentPane().add(Copyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 110, 20));

        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        screen.setOpaque(false);
        screen.setLayout(null);
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 520, 520));

        Title.setBackground(new java.awt.Color(0, 0, 0));
        Title.setFont(new java.awt.Font("Tekton Pro", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Enigma Machine");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Title.setOpaque(true);
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        Animation.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        Animation.setForeground(new java.awt.Color(0, 102, 255));
        Animation.setSelected(true);
        Animation.setText("Show Animation");
        getContentPane().add(Animation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 180, 30));

        encode.setBackground(new java.awt.Color(0, 204, 0));
        encode.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        encode.setText("Encode");
        encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeActionPerformed(evt);
            }
        });
        getContentPane().add(encode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 40));

        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, 130));

        decode.setBackground(new java.awt.Color(255, 0, 0));
        decode.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        decode.setText("Decode");
        decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeActionPerformed(evt);
            }
        });
        getContentPane().add(decode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
char[] original = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};    
char[] coded = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};    

void rotateArray(int move){
for(int i=0;i<original.length;i++)
{
if(i+move<coded.length)
coded[i+move]=original[i];
else
coded[i+move-coded.length]=original[i];  
}
}


BufferedImage rotator=null,base=null;


Timer t;
int p;
int times=0;
double theta=0;
InnerClassDrawingPanel graphics = new InnerClassDrawingPanel(); ;
    private void posStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_posStateChanged
p = Integer.parseInt(pos.getValue().toString());
if(p<0)
p=35+(p%36);
else
p=p%36;
rotateArray(p);
// ~~~~~~~~~~~ End of Functionality ~~~~~~~~~~~

theta=Math.PI*p/18;
graphics.repaint();
    }//GEN-LAST:event_posStateChanged

    private void encodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeActionPerformed
pos.setValue(0);
output.setText("");
String orig="";
String text = ta.getText().toUpperCase();
for(int i=0;i<36;i++)
{
orig=orig+original[i];
}
for(int j=0;j<text.length();j++){
int index = orig.indexOf(text.charAt(j));
if(index>=0){
output.append(""+coded[index]);
pos.setValue(Integer.parseInt(pos.getValue().toString())+1);
}
else
{
output.append(""+text.charAt(j));
}
}
pos.setValue(0);
        
    }//GEN-LAST:event_encodeActionPerformed

    private void decodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeActionPerformed
pos.setValue(0);
output.setText("");
String orig="";
for(int i=0;i<36;i++)
{
orig=orig+original[i];
}
String code = ta.getText().toUpperCase();
int length=0;
for(int i=0;i<code.length();i++){
if(orig.indexOf(code.charAt(i)) >=0)
 length++;
}
pos.setValue(length-1);


for(int j=code.length()-1;j>=0;j--){
String cd="";
for(int i=0;i<36;i++)
{
cd=cd+coded[i];
}
int index = cd.indexOf(code.charAt(j));
if(index>=0){
output.setText(""+original[index]+output.getText());
pos.setValue(Integer.parseInt(pos.getValue().toString())-1);
}
else
{
output.setText(code.charAt(j)+output.getText());
}
}
pos.setValue(0);
    }//GEN-LAST:event_decodeActionPerformed
public final class InnerClassDrawingPanel extends JPanel {    
protected void paintComponent(Graphics g) {
Graphics2D g2d = (Graphics2D)g;
super.paintComponent(g2d);
g2d.setBackground(new Color(255,255,255));
try {
base = ImageIO.read(new File(getClass().getResource("/other_Program_Images/enigma_Machine_bottom.png").toURI()));
rotator = ImageIO.read(new File(getClass().getResource("/other_Program_Images/enigma_Machine_top.png").toURI()));
} 
catch (IOException ex){
Logger.getLogger(Enigma_Machine.class.getName()).log(Level.SEVERE, null, ex);
}
catch (URISyntaxException ex) {
Logger.getLogger(Enigma_Machine.class.getName()).log(Level.SEVERE, null, ex);
}
g2d.drawImage(base, null,10,10);
g2d.rotate(theta,260,260);
g2d.drawImage(rotator,null,60,60);
}
}
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
            java.util.logging.Logger.getLogger(Find_and_Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Find_and_Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Find_and_Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Find_and_Replace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enigma_Machine().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Animation;
    private javax.swing.JLabel Copyrights;
    private javax.swing.JLabel Title;
    private javax.swing.JButton decode;
    private javax.swing.JButton encode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea output;
    private javax.swing.JSpinner pos;
    private javax.swing.JPanel screen;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
