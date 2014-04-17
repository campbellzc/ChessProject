public class Bishop {
	
	Color color;
	Image white;
	Image black;

	public Bishop(Color color) {
		this.color = color;


	}

	private static Image loadImage(String name) {
		String path = null;
		Image image = null;

		try {
			path = "cards" + File.separator + name + ".png";
			image = ImageIO.read(new File(path));
		} catch(IOException e) {
			System.out.println("Could not load image at path: " + path);
			System.exit(1);
		}

		return image;
	}
}