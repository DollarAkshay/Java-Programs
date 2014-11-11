package Simple_Games;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.tools.JavaFileManager.Location;
/*
 * Created on 29 Aug, 2011, 4:25:59 PM
 */
public class dodge_the_boxes extends javax.swing.JFrame {
    int i1=1,j1=-1;
    int i2=1,j2=-1;
    int i3=1,j3=1;
    int i4=-1,j4=1;
    int i5=-1,j5=-1;
    int score=0;
    int m1,m2,m3,m4,m5,n1,n2,n3,n4,n5;

    Color c1=Color.GREEN,c2=Color.BLUE,c3=Color.MAGENTA,c4=Color.YELLOW,c5=Color.RED;


    /** Creates new form dodge_the_ball */
    public dodge_the_boxes() {
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

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        p5 = new javax.swing.JPanel();
        box = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dodge the Boxes(Demo :))");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 50, 50));

        p2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 50, 50));

        p3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 50, 50));

        p4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        p5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, 50));

        box.setBackground(new java.awt.Color(255, 255, 255));
        box.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                boxMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout boxLayout = new javax.swing.GroupLayout(box);
        box.setLayout(boxLayout);
        boxLayout.setHorizontalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        boxLayout.setVerticalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxMouseDragged
p1.setBackground(c1);
p2.setBackground(c2);
p3.setBackground(c3);
p4.setBackground(c4);
p5.setBackground(c5);
score++;
//enough of colouring...........**************************************
if(p1.getX()==400) {i1=-1; score++;}
if(p1.getY()==0) {j1=1; score++;}
if(p1.getY()==300) {j1=-1; score++;}
if(p1.getX()==0) {i1=1; score++;}

if(p2.getX()==0) {i2=1; score++;}
if(p2.getX()==400) {i2=-1; score++;}
if(p2.getY()==0) {j2=1; score++;}
if(p2.getY()==300) {j2=-1; score++;}

if(p3.getX()==0) {i3=1; score++;}
if(p3.getX()==400) {i3=-1; score++;}
if(p3.getY()==0) {j3=1; score++;}
if(p3.getY()==300) {j3=-1; score++;}

if(p4.getX()==0) {i4=1; score++;}
if(p4.getX()==400) {i4=-1; score++;}
if(p4.getY()==0) {j4=1; score++;}
if(p4.getY()==300) {j4=-1; score++;}

if(p5.getX()==0) {i5=1; score++;}
if(p5.getX()==400) {i5=-1; score++;}
if(p5.getY()==0) {j5=1; score++;}
if(p5.getY()==300) {j5=-1; score++;}

//**********************************************************************************************



//NOW FOR THE FINAL KILL************************************************************!!!!!!!!
box.setLocation(getMousePosition());
p1.setLocation(p1.getX()+i1,p1.getY()+j1);
p2.setLocation(p2.getX()+i2,p2.getY()+j2);
p3.setLocation(p3.getX()+i3,p3.getY()+j3);
p4.setLocation(p4.getX()+i4,p4.getY()+j4);
p5.setLocation(p5.getX()+i5,p5.getY()+j5);

//DEATH ON THE ROAD...........***************
if(death(box,p1)==true || death(box,p2)==true || death(box,p3)==true || death(box,p4)==true || death(box,p5)==true)
{JOptionPane.showMessageDialog(null,"Your score is "+score); score=0; /*dispose();*/
p1.setLocation(m1,n1);
p2.setLocation(m2,n2);
p3.setLocation(m3,n3);
p4.setLocation(m4,n4);
p5.setLocation(m5,n5);
box.setLocation(200,150);
p1.setBackground(Color.DARK_GRAY);
p2.setBackground(Color.DARK_GRAY);
p3.setBackground(Color.DARK_GRAY);
p4.setBackground(Color.DARK_GRAY);
p5.setBackground(Color.DARK_GRAY);
}



    }//GEN-LAST:event_boxMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
m1=p1.getX();       // TODO add your handling code here:m1=p1.getX();       // TODO add your handling code here:
m2=p2.getX(); m3=p3.getX(); m4=p4.getX(); m5=p5.getX();
n1=p1.getY();
n2=p2.getY();
n3=p3.getY();
n4=p4.getY();
n5=p5.getY();

    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */

   public static boolean death(Component x,Component h) //Component x is the player item
    {
       boolean check=false;
       int a=1,b=1;
       //***********************************************************************
       if(x.getX()<=h.getX()+50 && h.getX()<=x.getX()+50) a=0;
       if(x.getY()<=h.getY()+50 && h.getY()<=x.getY()+50) b=0;
       if(a==0 && b==0) check=true;
       if(x.getX()==0 ||x.getX()==400 || x.getY()==0 ||x.getY()==300) check=true;
       //***********************************************************************
       return check;
    }

   public static int bounce(Component a,Component b)
    {
       int check=0; int v=0,w=0;
       if(a.getX()<=b.getX()+50 && b.getX()<=a.getX()+50) v=0;
       if(a.getY()<=b.getY()+50 && b.getY()<=a.getY()+50) w=0;
       if(v==0 && w==1) check=2;
       if(v==1 && w==0) check=1;
       if(v==1 && w==1) check=3;
       return check;

   }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dodge_the_boxes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel box;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    // End of variables declaration//GEN-END:variables

}
