// import java.awt.Graphics;
// import java.awt.Image;
// import java.awt.Rectangle;

// import java.io.File;
// import java.io.IOException;

// import javax.imageio.ImageIO;

// public class Piece {

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Piece {

	private Image image;
	private String color;
	private String type;
	public int x;
	public int y;
	public Color color;
	public Piece(String color, String type, int x, int y) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.type = type;
		this.image = Piece.loadImage(type + "_" + color);
	}
	public static Image loadImage(String piece, Color color) {
			String path = null;
			Image image = null;
			//Image scaled = null;

			try {
				if (color == Color.WHITE) {
					path = "pictures" + File.separator + piece.toLowerCase() + "_white.png";
				} else {
					path = "pictures" + File.separator + piece.toLowerCase() + "_black.png";
				}
				image = ImageIO.read(new File(path));
				//scaled = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			} catch (IOException e) {
				System.out.println("Could not load piece image at path: " + path);
				e.printStackTrace();
			}

			return image;
	}
	// public static Image loadImage(String name) {
	// 	String path = null;
	// 	Image image = null;

	// 	try {
	// 		path = "pictures" + File.separator + name + ".png";
	// 		image = ImageIO.read(new File(path));
	// 	} catch(IOException e) {
	// 		System.out.println("Could not load image at path: " + path);
	// 		System.exit(1);
	// 	}

	// 	return image;
	// }

	public void Act() {

	}


	public void move() {


	}
