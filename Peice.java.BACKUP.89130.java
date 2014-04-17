import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Peice {
	private Image image;
	public void act() {
		if (getBoard() == null)
			return;
		
	}
<<<<<<< HEAD
	public void Act() {

	}
=======
>>>>>>> 6d718c85ceada3c86fb90e1641f0545c3162e1b3

	public void move() {
		
	}

	public ArrayList<Actor> processActors() {
		
	}
<<<<<<< HEAD


	// private Image image;
=======
>>>>>>> 6d718c85ceada3c86fb90e1641f0545c3162e1b3
	private static Image loadImage(String name) {
		String path = null;
		Image image = null;

		try {
			path = "pictures" + File.separator + name + ".png";
			image = ImageIO.read(new File(path));
		} catch(IOException e) {
			System.out.println("Could not load image at path: " + path);
			System.exit(1);
		}

		return image;
	}


}