/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author JulFX
 */
public class CapturarOdontograma {
private BufferedImage bi;
private Graphics2D big;
private String savePath;
private File f;

public void savePane(JPanel capPane, String savePath) {
this.savePath = savePath;

bi = new BufferedImage(capPane.getWidth(), capPane.getHeight(),
BufferedImage.TYPE_INT_RGB);
big = (Graphics2D)bi.getGraphics();
//!!!
capPane.paint(big);

saveImage();
}

private void saveImage() {
try {
f = new File(savePath);
ImageIO.write(bi, "JPEG", f);
}catch (Exception e) {
System.out.println("Exception in -> PaneUtill.saveImage " );
e.printStackTrace();
}
}
} 