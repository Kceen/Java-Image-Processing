import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;

public class ImageResizingMAIN {
	
	public static void main(String[] args) throws Exception {
		File imageFile = new File("vw.jpg");
		BufferedImage image = ImageIO.read(imageFile);
		
		int width = image.getWidth();
		int height = image.getHeight();
		int newWidth;
		int newHeight;
		int cropStartX;
		int cropStartY;
		
		if(width > height) {
			newWidth = height;
			newHeight = height;
			cropStartX = (width - newWidth) / 2;
			cropStartY = 0;
		}
		else {
			newWidth = width;
			newHeight = width;
			cropStartX = 0;
			cropStartY = (height - newHeight) / 2;
		}
		
		
		
		
		BufferedImage newImage = image.getSubimage(cropStartX, cropStartY, newWidth, newHeight);
		ImageIO.write(newImage, "jpg", new File("pictureDog.jpg"));
		
	}
	
	
}
