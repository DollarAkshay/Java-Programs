/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Methods_Squaring.java
 *
 * Created on Oct 21, 2011, 9:37:30 AM
 */

package $_School_Programs_11th_STD_SemII_$;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author student
 */
public class Methods_Squaring extends javax.swing.JFrame {

    /** Creates new form Methods_Squaring */
    public Methods_Squaring() {
        initComponents();
        Timer t = new Timer(250,new ActionListener(){public void actionPerformed(ActionEvent e){

if(run==true)
{
loading();
}
}});
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

        n = new javax.swing.JTextField();
        res = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        res.setFont(new java.awt.Font("Bodoni MT Black", 2, 24)); // NOI18N
        res.setForeground(new java.awt.Color(0, 204, 0));
        res.setText("The square is:");
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 350, 50));

        jButton1.setText("Square it");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 40));

        loading.setBackground(new java.awt.Color(255, 0, 51));
        loading.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents
void doubleit(int a)
{
res.setText("The Square is:"+(a*a));
}

void loading(){
Random r = new Random();
rng = r.nextInt(10)+5;
while(i<=11){
if(((i%5)==0)&&(i!=10)&&(i!=11))
    loading.setText("Loading.");
if(((i%5)==1)&&(i!=10)&&(i!=11))
    loading.setText("Loading..");
if(((i%5)==2)&&(i!=10)&&(i!=11))
    loading.setText("Loading...");
if(((i%5)==3)&&(i!=10)&&(i!=11))
    loading.setText("Loading....");
if(((i%5)==4)&&(i!=10)&&(i!=11))
    loading.setText("Loading.....");
if(i==10){
    loading.setText("Done");
    }
if(i==11){
   loading.setVisible(false);
   res.setVisible(true);
    }
i++;
break;
}

}

int i=0;
int rng;
boolean run=false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
i=0;
run=true;
res.setVisible(false);
loading.setVisible(true);

int a = Integer.parseInt(n.getText());
doubleit(a);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
loading.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Methods_Squaring().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel loading;
    private javax.swing.JTextField n;
    private javax.swing.JLabel res;
    // End of variables declaration//GEN-END:variables

}
