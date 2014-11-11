package Graphics_2D;



/** An illustration of the use of AlphaComposite to make partially
 *  transparent drawings.
 *
 *  From tutorial on learning Java2D at
 *  http://www.apl.jhu.edu/~hall/java/Java2D-Tutorial.html
 *
 *  1998 Marty Hall, http://www.apl.jhu.edu/~hall/java/
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/** An illustration of the use of AlphaComposite to make
 * partially transparent drawings.
 */

@SuppressWarnings("serial")
class TransparencyExample extends JPanel {
    
 private static int gap=10, width=60, offset=20,
           deltaX=gap+width+offset;

 private Rectangle
  blueSquare = new Rectangle(gap+offset, gap+offset, width,
                width),
  redSquare = new Rectangle(gap, gap, width, width);

 private AlphaComposite makeComposite(float alpha) {
  int type = AlphaComposite.SRC_OVER;
  return(AlphaComposite.getInstance(type, alpha));
 }

 private void drawSquares(Graphics2D g2d, float alpha) {
  Composite originslcomposite =  g2d.getComposite();
  g2d.setComposite(makeComposite(alpha));
  g2d.setPaint(Color.YELLOW);
  g2d.fill(redSquare);
  g2d.setComposite(originslcomposite);
    g2d.setPaint(Color.BLUE);
  g2d.fill(blueSquare);
 }

 public void paintComponent(Graphics g) {
  super.paintComponent(g);
  Graphics2D g2d = (Graphics2D)g;
  g2d.setBackground(Color.BLACK);
  g2d.clearRect(0, 0, getWidth(), getHeight());
  for(int i=0; i<11; i++) {
   drawSquares(g2d, i*0.1F);
   g2d.translate(deltaX, 0);
  }
 }

 public static void main(String[] args) {
  String title = "Transparency example: alpha of the top " +
          "(red) square ranges from 0.0 at the left " +
          "to 1.0 at the right. Bottom (blue) square " +
          "is opaque.";
  WindowUtilities.openInJFrame(new TransparencyExample(),
                 11*deltaX + 2*gap,
                 deltaX + 3*gap,
                 title, Color.lightGray);
 }
}