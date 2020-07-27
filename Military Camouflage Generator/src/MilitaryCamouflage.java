import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import javax.imageio.ImageIO;

public class MilitaryCamouflage {

	public static void main(String[] args) throws Exception {
		// firstTry();
		secondTry();
	}

	public static void firstTry() throws Exception {
		BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
		// BufferedImage testImage = ImageIO.read(new
		// URL("https://images.unsplash.com/photo-1523895665936-7bfe172b757d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80"));
		Random random = new Random();
		int randomInt;
		Color color = new Color(0, 0, 0);
		boolean isGreenOrYellow = false;

		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				randomInt = random.nextInt(100);

				if (isGreenOrYellow && randomInt < 75) {
					// YELLOW
					color = new Color(173, 146, 36);
					image.setRGB(i, j, color.getRGB());
					continue;
				}

				if (randomInt < 80) {
					// DARK GREEN
					color = new Color(50, 56, 12);
					isGreenOrYellow = false;
				} else if (randomInt > 80 && randomInt < 90) {
					// GREEN
					color = new Color(72, 92, 21);
					isGreenOrYellow = false;
				} else {
					// YELLOW
					color = new Color(173, 146, 36);
					isGreenOrYellow = true;
				}

				image.setRGB(i, j, color.getRGB());

			}
		}

		// Image scaledImage = image.getScaledInstance(500, 600, Image.SCALE_DEFAULT);

		ImageIO.write(image, "jpg", new File("firstTryJPG.jpg"));

	}

	public static void secondTry() throws Exception {
		Path path = Paths.get("C:\\Users\\Nikola\\Desktop\\Java Workspace\\Ostalo\\Image processing\\SECOND TRY");
		Files.createDirectories(path);

		Random random = new Random();
		int randomIntX;
		int randomIntY;
		
		// DARK GREEN
		Color color1 = new Color(0,40,31);
		// LIGHT GREEN
		Color color2 = new Color(74,115,59);
		// GREEN
		Color color3 = new Color(1,88,43);
		// DARK RED
		Color color4 = new Color(58,27,28);
		
		int width = 500;
		int height = 500;
		int numberOfSpots = 20;
		int numberOfMoves = 10000;
		
		// NUMBER OF SPOTS * NUMBER OF MOVES * NUMBER OF ITERATIONS
		int numberOfIterations = 10;
		String formatName = "png";
		String fileName = "secondTry500TEST.png";
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		for (int k = 0; k < numberOfIterations; k++) {

			for (int i = 0; i < numberOfSpots; i++) {
				randomIntX = random.nextInt(image.getWidth());
				randomIntY = random.nextInt(image.getHeight());

				for (int j = 0; j < numberOfMoves; j++) {
					if (random.nextInt(4) == 0) {
						randomIntX++;
						if (randomIntX >= image.getWidth()) {
							randomIntX = 0;
						}
						if (randomIntX < 0) {
							randomIntX = image.getWidth() - 1;
						}
					}
					if (random.nextInt(4) == 1) {
						randomIntX--;
						if (randomIntX >= image.getWidth()) {
							randomIntX = 0;
						}
						if (randomIntX < 0) {
							randomIntX = image.getWidth() - 1;
						}
					}
					if (random.nextInt(4) == 2) {
						randomIntY++;
						if (randomIntY >= image.getHeight()) {
							randomIntY = 0;
						}
						if (randomIntY < 0) {
							randomIntY = image.getHeight() - 1;
						}
					}
					if (random.nextInt(4) == 3) {
						randomIntY--;
						if (randomIntY >= image.getHeight()) {
							randomIntY = 0;
						}
						if (randomIntY < 0) {
							randomIntY = image.getHeight() - 1;
						}
					}
					// System.out.println("X = " + randomIntX);
					// System.out.println("Y = " + randomIntY);
					image.setRGB(randomIntX, randomIntY, color1.getRGB());
				}

			}

			for (int i = 0; i < numberOfSpots; i++) {
				randomIntX = random.nextInt(image.getWidth());
				randomIntY = random.nextInt(image.getHeight());

				for (int j = 0; j < numberOfMoves; j++) {
					if (random.nextInt(4) == 0) {
						randomIntX++;
						if (randomIntX >= image.getWidth()) {
							randomIntX = 0;
						}
						if (randomIntX < 0) {
							randomIntX = image.getWidth() - 1;
						}
					}
					if (random.nextInt(4) == 1) {
						randomIntX--;
						if (randomIntX >= image.getWidth()) {
							randomIntX = 0;
						}
						if (randomIntX < 0) {
							randomIntX = image.getWidth() - 1;
						}
					}
					if (random.nextInt(4) == 2) {
						randomIntY++;
						if (randomIntY >= image.getHeight()) {
							randomIntY = 0;
						}
						if (randomIntY < 0) {
							randomIntY = image.getHeight() - 1;
						}
					}
					if (random.nextInt(4) == 3) {
						randomIntY--;
						if (randomIntY >= image.getHeight()) {
							randomIntY = 0;
						}
						if (randomIntY < 0) {
							randomIntY = image.getHeight() - 1;
						}
					}
					// System.out.println("X = " + randomIntX);
					// System.out.println("Y = " + randomIntY);
					image.setRGB(randomIntX, randomIntY, color2.getRGB());
				}

			}
			
			for (int i = 0; i < numberOfSpots; i++) {
				randomIntX = random.nextInt(image.getWidth());
				randomIntY = random.nextInt(image.getHeight());

				for (int j = 0; j < numberOfMoves; j++) {
					if (random.nextInt(4) == 0) {
						randomIntX++;
						if (randomIntX >= image.getWidth()) {
							randomIntX = 0;
						}
						if (randomIntX < 0) {
							randomIntX = image.getWidth() - 1;
						}
					}
					if (random.nextInt(4) == 1) {
						randomIntX--;
						if (randomIntX >= image.getWidth()) {
							randomIntX = 0;
						}
						if (randomIntX < 0) {
							randomIntX = image.getWidth() - 1;
						}
					}
					if (random.nextInt(4) == 2) {
						randomIntY++;
						if (randomIntY >= image.getHeight()) {
							randomIntY = 0;
						}
						if (randomIntY < 0) {
							randomIntY = image.getHeight() - 1;
						}
					}
					if (random.nextInt(4) == 3) {
						randomIntY--;
						if (randomIntY >= image.getHeight()) {
							randomIntY = 0;
						}
						if (randomIntY < 0) {
							randomIntY = image.getHeight() - 1;
						}
					}
					// System.out.println("X = " + randomIntX);
					// System.out.println("Y = " + randomIntY);
					image.setRGB(randomIntX, randomIntY, color3.getRGB());
				}

			}

			// FILL IN EVERYWHERE WHERE IT HASN'T BEEN AFFECTED WITH COLOR4
			// IT HASN'T BEEN AFFECTED IF THE PIXEL COLOR IS BLACK (-16777216)
			for (int i = 0; i < image.getWidth(); i++) {
				for (int j = 0; j < image.getHeight(); j++) {
					if (image.getRGB(i, j) == -16777216) {
						image.setRGB(i, j, color4.getRGB());
						// System.out.println("X = " + i);
						// System.out.println("Y = " + j);
					}
				}
			}	
		}
		
		ImageIO.write(image, formatName, new File("SECOND TRY/" + fileName));
		//ImageIO.write(image, "jpg", new File("SECOND TRY/secondTry.jpg"));
	}
}
