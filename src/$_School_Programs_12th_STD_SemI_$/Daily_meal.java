/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Daily_meal.java
 *
 * Created on Sep 12, 2011, 2:10:32 PM
 */

package $_School_Programs_12th_STD_SemI_$;


import javax.swing.DefaultListModel;

/**
 *
 * @author student
 */
public class Daily_meal extends javax.swing.JFrame {

    /** Creates new form Daily_meal */
    public Daily_meal() {
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
        l = new javax.swing.JList();
        c = new javax.swing.JComboBox();
        inf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l.setModel(new DefaultListModel());
        l.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(l);

        c.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bread And Cereal", "Diary", "Fruits and Vegies", "Meat" }));
        c.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cItemStateChanged(evt);
            }
        });

        inf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        inf.setText("Calorie:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inf, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inf, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void cItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cItemStateChanged

        DefaultListModel d = (DefaultListModel) l.getModel();
        int i = c.getSelectedIndex();
switch(i)
{
    case 0:
        d.removeAllElements();
        d.add(0,"White Bread");
        d.add(1,"Brown Bread");
        break;
    case 1:
        d.removeAllElements();
        d.add(0,"Chedar Cheese");
        d.add(1,"Processed Cheese");
        d.add(2,"Cottage Cheese");
        d.add(3,"Milk");
        d.add(4,"Curd");
        d.add(5,"Ghee");
        break;
            case 2:
                d.removeAllElements();
        d.add(0,"Tomato");
        d.add(1,"Orange");
        d.add(2,"Cucumber");
        break;
        case 3:
            d.removeAllElements();
        d.add(0,"Lamb Meat");
        d.add(1,"Beef");
        d.add(2,"Chicken");
        break;
}


}//GEN-LAST:event_cItemStateChanged

    private void lValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lValueChanged
DefaultListModel d = (DefaultListModel) l.getModel();
int li = l.getSelectedIndex();
int ci = c.getSelectedIndex();
if((ci==0)&&(li==0))
        inf.setText("White Bread Calorie : 1000");
else if((ci==0)&&(li==1))
        inf.setText("Brown Bread Calorie : 679");
else if((ci==1)&&(li==0))
        inf.setText("Chedar CheeseCalorie : 546");
else if((ci==1)&&(li==1))
        inf.setText("Processed Cheese Calorie : 456");
else if((ci==1)&&(li==2))
        inf.setText("Cottage CheeseCalorie : 1220");
else if((ci==1)&&(li==3))
        inf.setText("Milk Calorie : 5620");
else if((ci==1)&&(li==4))
        inf.setText("CurdCalorie : 853");
else if((ci==1)&&(li==5))
        inf.setText("Ghee Calorie : 954");
else if((ci==2)&&(li==0))
        inf.setText("TomatoCalorie : 485");
else if((ci==2)&&(li==1))
        inf.setText("OrangeCalorie : 562");
else if((ci==2)&&(li==2))
        inf.setText("CucumberCalorie : 456");
else if((ci==2)&&(li==3))
        inf.setText("LambCalorie : 800");
else if((ci==3)&&(li==0))
        inf.setText("Beef Calorie : 1040");
else if((ci==3)&&(li==1))
        inf.setText("Calorie : 1200");
else if((ci==3)&&(li==2))
        inf.setText("Chick Calorie : 1202");







}//GEN-LAST:event_lValueChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daily_meal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c;
    private javax.swing.JLabel inf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList l;
    // End of variables declaration//GEN-END:variables

}
