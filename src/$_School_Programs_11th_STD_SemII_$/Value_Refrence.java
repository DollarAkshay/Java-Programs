/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Value_Refrence.java
 *
 * Created on Nov 4, 2011, 11:35:33 AM
 */

package $_School_Programs_11th_STD_SemII_$;

/**
 *
 * @author student
 */
public class Value_Refrence extends javax.swing.JFrame {
int a;
 int b;
    /** Creates new form Value_Refrence */
    public Value_Refrence() {
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

        Swap_Refrence = new javax.swing.JButton();
        Swap_Value = new javax.swing.JButton();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        res = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Swap_Refrence.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        Swap_Refrence.setForeground(new java.awt.Color(255, 0, 0));
        Swap_Refrence.setText("<html>Swap Numbers <br>(By Refrence)</html>");
        Swap_Refrence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Swap_RefrenceActionPerformed(evt);
            }
        });

        Swap_Value.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        Swap_Value.setForeground(new java.awt.Color(255, 0, 0));
        Swap_Value.setText("<html>Swap Numbers <br>(By value)</html>");
        Swap_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Swap_ValueActionPerformed(evt);
            }
        });

        n1.setBackground(new java.awt.Color(0, 0, 0));
        n1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(51, 204, 0));
        n1.setBorder(null);

        n2.setBackground(new java.awt.Color(0, 0, 0));
        n2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        n2.setForeground(new java.awt.Color(51, 204, 0));
        n2.setBorder(null);

        jLabel1.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("First Number");

        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Second Number");

        num1.setEditable(false);
        num1.setBackground(new java.awt.Color(0, 0, 0));
        num1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        num1.setForeground(new java.awt.Color(255, 255, 0));
        num1.setBorder(null);

        num2.setEditable(false);
        num2.setBackground(new java.awt.Color(0, 0, 0));
        num2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        num2.setForeground(new java.awt.Color(255, 255, 0));
        num2.setBorder(null);

        res.setFont(new java.awt.Font("Narkisim", 0, 24)); // NOI18N
        res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Swap_Refrence, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Swap_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Swap_Refrence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Swap_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

void swapValue(int a, int b)
{
a=a+b;
b=a-b;
a=a-b;
}

void swapRefrence(Value_Refrence obj)
{
int temp =obj.a;
obj.a=obj.b;
obj.b=temp;
}



    private void Swap_RefrenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Swap_RefrenceActionPerformed
res.setText("Swap By Refrence");
a = Integer.parseInt(n1.getText());
b = Integer.parseInt(n2.getText());
swapRefrence(this);
num1.setText(""+a);
num2.setText(""+b);
    }//GEN-LAST:event_Swap_RefrenceActionPerformed

    private void Swap_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Swap_ValueActionPerformed
res.setText("Swap By Value");
        int c = Integer.parseInt(n1.getText());
int d = Integer.parseInt(n2.getText());
swapValue(c,d);
num1.setText(""+c);
num2.setText(""+d);
    }//GEN-LAST:event_Swap_ValueActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Value_Refrence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Swap_Refrence;
    private javax.swing.JButton Swap_Value;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JLabel res;
    // End of variables declaration//GEN-END:variables

}
