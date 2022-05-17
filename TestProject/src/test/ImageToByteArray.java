package test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class ImageToByteArray {
  public static void main(String[] args) throws Exception {
    BufferedImage image = ImageIO.read(new File("sample.jpg"));
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ImageIO.write(image, "jpg", bos);
    byte[] data = bos.toByteArray();
  }
}
