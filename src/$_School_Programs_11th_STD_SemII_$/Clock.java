/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Clock.java
 *
 * Created on Oct 13, 2011, 2:24:30 PM
 */

package $_School_Programs_11th_STD_SemII_$;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author student
 */
public class Clock extends javax.swing.JFrame {

    /** Creates new form Clock */
    public Clock() {
        initComponents();
        Timer t = new Timer(1,
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
           clock();
           }
        });
        t.start();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sec = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        hr = new javax.swing.JLabel();
        colon = new javax.swing.JLabel();
        colon1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sec.setFont(new java.awt.Font("Georgia", 0, 100)); // NOI18N
        sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sec.setText("00");
        getContentPane().add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        min.setFont(new java.awt.Font("Georgia", 0, 100)); // NOI18N
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("00");
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        hr.setFont(new java.awt.Font("Georgia", 0, 100)); // NOI18N
        hr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hr.setText("00");
        getContentPane().add(hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        colon.setFont(new java.awt.Font("Georgia", 0, 100)); // NOI18N
        colon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colon.setText(":");
        getContentPane().add(colon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        colon1.setFont(new java.awt.Font("Georgia", 0, 100)); // NOI18N
        colon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colon1.setText(":");
        getContentPane().add(colon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int t=0;
void clock()
{
t++;
if(t<10)
sec.setText("0"+(t%60));
else if(t>=10)
sec.setText(""+(t%60));
if(t<600)
min.setText("0"+((t/60)%60));
else if(t>=600)
min.setText(""+((t/60)%60));
if(t<36000)
hr.setText("0"+((t/3600)%12));
else if(t>=36000)
hr.setText(""+((t/3600)%12));

}
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colon;
    private javax.swing.JLabel colon1;
    private javax.swing.JLabel hr;
    private javax.swing.JLabel min;
    private javax.swing.JLabel sec;
    // End of variables declaration//GEN-END:variables

}
