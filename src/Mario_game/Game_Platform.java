/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Game_Platform.java
 *
 * Created on Oct 22, 2011, 9:42:13 PM
 */
package Mario_Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author $Akshay$
 */
public class Game_Platform extends javax.swing.JFrame {

    /** Creates new form Game_Platform */
    public Game_Platform() {
        initComponents();
        Timer compiler = new Timer(1000,
           new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
           {
            
            
           if((fire_ball.getX()>end.getX()+5)&&(fire_ball.getX()<end.getX()+10))
           bug.append("\n$☠ Fire_Ball Ran Away");
           if((mario.getY()>222)&&(mario.getY()<=227))
           bug.append("\n$☠ Mario Falling down!!☹");

           
   
               
           

           
           }});
         compiler.start();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
             move = new Timer(10,new ActionListener(){
            public void actionPerformed(ActionEvent e){
               if(right==true)
               {
                mario.setIcon(new ImageIcon(getClass().getResource("/Mario_Game/mario_right.gif")));
                x++;
               }
               if(left==true){
                mario.setIcon(new ImageIcon(getClass().getResource("/Mario_Game/mario_left.gif")));
                x--;
                }
               if(mario.getY()<222) 
               y++;
               mario.setLocation(x,y);
               if((fire_ball.getX()==end.getX()) ||(fire_ball.getX()==end.getX()+1))
              test.append("\n$❉ End Reached ☺");
              if(fire_ball.getX()>end.getX()+1)
              fire_ball.setLocation(fire_ball.getX(),fire_ball.getY());
              else if(fire_ball.getY()>=220)
              fire_ball.setLocation(fire_ball.getX()+2,fire_ball.getY());
              else
              fire_ball.setLocation(fire_ball.getX()+2,fire_ball.getY()+1);
         }});
        move.start();
}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        scr = new javax.swing.JPanel();
        ground = new javax.swing.JLabel();
        mario = new javax.swing.JLabel();
        fire_ball = new javax.swing.JLabel();
        block = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        Developers_panel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        test_scroll = new javax.swing.JScrollPane();
        test = new javax.swing.JTextArea();
        bug_scroll = new javax.swing.JScrollPane();
        bug = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scr.setFocusable(false);
        scr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ground.setName("ground"); // NOI18N
        scr.add(ground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 252, 400, 150));

        mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mario_game/mario_right_stop.gif"))); // NOI18N
        mario.setFocusable(false);
        scr.add(mario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 222, 16, 30));

        fire_ball.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fire_ball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mario_game/fire_ball.gif"))); // NOI18N
        fire_ball.setFocusable(false);
        scr.add(fire_ball, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 10, 30));

        block.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        block.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mario_game/block.gif"))); // NOI18N
        block.setFocusable(false);
        block.setName("block"); // NOI18N
        scr.add(block, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 185, 30, 30));

        end.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        end.setText("|");
        end.setFocusable(false);
        scr.add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 210, 5, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mario_game/background.gif"))); // NOI18N
        bg.setFocusable(false);
        scr.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 400));

        getContentPane().add(scr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        Developers_panel.setBackground(new java.awt.Color(0, 0, 0));
        Developers_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " $ Developer's Area $ ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        Developers_panel.setFocusable(false);
        Developers_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("BatangChe", 1, 18));
        title.setForeground(new java.awt.Color(255, 0, 204));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Bug Report");
        title.setFocusable(false);
        Developers_panel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 260, 20));

        test_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        test_scroll.setFocusable(false);

        test.setColumns(20);
        test.setLineWrap(true);
        test.setRows(5);
        test.setFocusable(false);
        test_scroll.setViewportView(test);

        Developers_panel.add(test_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 230, 140));

        bug_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        bug_scroll.setFocusable(false);

        bug.setBackground(new java.awt.Color(0, 0, 0));
        bug.setColumns(18);
        bug.setFont(new java.awt.Font("Monospaced", 0, 14));
        bug.setForeground(new java.awt.Color(51, 204, 0));
        bug.setLineWrap(true);
        bug.setRows(2);
        bug.setBorder(null);
        bug.setFocusable(false);
        bug_scroll.setViewportView(bug);

        Developers_panel.add(bug_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 250, 120));

        getContentPane().add(Developers_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 500, 170));

        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("$Doallr Akshay$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 100, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 100, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int x=90,y=222,temp=0,jump=-50;
boolean up,down,left,right;
Timer in_air,fire,move;

boolean isOnGround()
{
if(scr.getComponentAt(mario.getX(), mario.getY()+mario.getHeight()+1).getName().equals("ground"))
return true;
else if (scr.getComponentAt(mario.getX(), mario.getY()+mario.getHeight()+1).getName().equals("block"))
return true;
else return false;
}


private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    if (evt.getKeyCode() == 37)
{
left = true;
}
if (evt.getKeyCode() == 39)
{
right = true;
}
if (evt.getKeyCode() == 38)
{
up = true;
}
if (evt.getKeyCode() == 40)
{
down = true;
}

    if(evt.getKeyCode()==KeyEvent.VK_UP)
    {
   
        if(mario.getY()>=222)
        {
            test.append("\n$❉ Jump Executed ☺");
            jump=-70;
        in_air = new Timer(10,
           new ActionListener(){
          
                    @Override
        public void actionPerformed(ActionEvent e)
           {
           if(jump<0)
           y-=2;
           
           if(jump==0){
               in_air.stop();
               test.append("\r\n$❉ Mario Reched max height:"+(222-mario.getY())+" ");
           }
           jump++;
           
           }});
         in_air.start();
        }
        
    }
   
    
//~~~~~~FIRE BALL ATTACK~~~~~~~~~~~~~~~~~~~~~~~~~FIRE BALL ATTACK~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    
if(evt.getKeyCode()==KeyEvent.VK_SPACE)
    {
    if(fire_ball.getX()>=end.getX())
    {
   fire_ball.setLocation(mario.getX(),mario.getY());
    test.append("\n$❉ Ball_Fired");
         
    }
    }
//~~~FIRE BALL ATTACK~~~~~~~~~~~~~~~~~~~~~~~~~~~FIRE BALL ATTACK~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
}//GEN-LAST:event_formKeyPressed

private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
if (evt.getKeyCode() == 37){   
mario.setIcon(new ImageIcon(getClass().getResource("/Mario_Game/mario_left_stop.gif")));
left = false;
}
if (evt.getKeyCode() == 39){
mario.setIcon(new ImageIcon(getClass().getResource("/Mario_Game/mario_right_stop.gif")));
right = false;
}
if (evt.getKeyCode() == 38)
up = false;
if (evt.getKeyCode() == 40)
down = false;
		
}//GEN-LAST:event_formKeyReleased

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
scr.requestFocus();
}//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game_Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Game_Platform().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Developers_panel;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel block;
    private javax.swing.JTextArea bug;
    private javax.swing.JScrollPane bug_scroll;
    private javax.swing.JLabel end;
    private javax.swing.JLabel fire_ball;
    private javax.swing.JLabel ground;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mario;
    private javax.swing.JPanel scr;
    private javax.swing.JTextArea test;
    private javax.swing.JScrollPane test_scroll;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
