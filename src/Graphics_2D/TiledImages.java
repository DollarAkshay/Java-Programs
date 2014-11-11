package Graphics_2D;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

/** An example of using TexturePaint to fill objects with tiled
 *  images. Uses the getBufferedImage method of ImageUtilities to
 *  load an Image from a file and turn that into a BufferedImage.
 *
 *  From tutorial on learning Java2D at
 *  http://www.apl.jhu.edu/~hall/java/Java2D-Tutorial.html
 *
 *  1998 Marty Hall, http://www.apl.jhu.edu/~hall/java/
 */

public class TiledImages extends JPanel {
  
  private String imageFile1 = "F:\\AKSHAY'S PICTURES\\bella_vampire.jpg";
  private TexturePaint imagePaint1;
  private Rectangle imageRect;
  private String imageFile2 = "F:\\AKSHAY'S PICTURES\\bella_vampire.jpg";
  private TexturePaint imagePaint2;
  private int[] xPoints = { 50, 300,550 };
  private int[] yPoints = { 50, 400, 50 };
  private Polygon imageTriangle = new Polygon(xPoints, yPoints, 3);

  public TiledImages() {
    BufferedImage image =
      ImageUtilities.getBufferedImage(imageFile1, this);
    imageRect =
      new Rectangle(35, 70,300, 100);
    imagePaint1 =
      new TexturePaint(image, imageRect);
    image = ImageUtilities.getBufferedImage(imageFile2, this);
    imagePaint2 =
      new TexturePaint(image, new Rectangle(0, 0, 32, 32));
  }

    @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D)g;
    g2d.setPaint(imagePaint2);
    g2d.fill(imageTriangle);
    g2d.setPaint(Color.blue);
    g2d.setStroke(new BasicStroke(5));
    g2d.draw(imageTriangle);
    g2d.setPaint(imagePaint1);
    g2d.fill(imageRect);
    g2d.setPaint(Color.black);
    g2d.draw(imageRect);
  }

  public static void main(String[] args) {
    WindowUtilities.openInJFrame(new TiledImages(), 750, 650);
  }
}