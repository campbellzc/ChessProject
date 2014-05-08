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
	// private Color colorA;

	public Piece(String color, String type, int x, int y) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.type = type;
		this.image = Piece.loadImage(type + "_" + color);
	}
	 
	public static Image loadImage(String name) {
		String path = null;
		Image image = null;
		Image scaled = null;

		try {
			path = "pictures" + File.separator + name + ".png";
			image = ImageIO.read(new File(path));
			scaled = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		} catch(IOException e) {
			System.out.println("Could not load image at path: " + path);
			System.exit(1);
		}

		return scaled;
	}

	public void Act() {

	}


	public void move() {


	}
	public int x() {
			return this.x;
	}

	public int y() {
			return this.y;
	}
}