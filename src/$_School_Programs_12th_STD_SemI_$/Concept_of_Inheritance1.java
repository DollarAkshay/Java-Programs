/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Concept_of_Inheritance1.java
 *
 * Created on Jun 18, 2012, 10:43:56 AM
 */

package $_School_Programs_12th_STD_SemI_$;

/**
 *
 * @author student
 */
public class Concept_of_Inheritance1 extends javax.swing.JFrame {

    /** Creates new form Concept_of_Inheritance1 */
    public Concept_of_Inheritance1() {
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

        First_Name = new javax.swing.JTextField();
        Last_Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Display = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(First_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, 30));
        getContentPane().add(Last_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, 30));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setText("Student Class");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Enter First name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Enter Last name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>Concept of Inheritance\n<br>\nType C Q1\n</html>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        Display.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Display.setText("Display Name()");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 10, 310));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Result");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 320, 30));

        res.setColumns(20);
        res.setRows(5);
        jScrollPane2.setViewportView(res);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 320, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

public class Student
{
String lastname,firstname;
Student(){}

Student(String F,String L)
{
firstname=F;
lastname=L;
}
void Data(Student obj)
{
res.append("Name :"+obj.firstname+" "+obj.lastname+"\n");
}
public Student S002 = new Student();
}


private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
String FN = First_Name.getText(); 
String LN = Last_Name.getText();
Student S001 = new Student(FN,LN);

}//GEN-LAST:event_DisplayActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Concept_of_Inheritance1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Display;
    private javax.swing.JTextField First_Name;
    private javax.swing.JTextField Last_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea res;
    // End of variables declaration//GEN-END:variables

}
