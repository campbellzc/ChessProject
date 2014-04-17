public class Castle {
	
	private Color color;
	private Image white;
	private Image black;

	public Castle(Color color) {
		this.color = color;
		this.white = Castle.loadImage("rook_white");
		this.black = Castle.loadImage("rook_black");

	}

	public void draw(Graphics g, Rectangel r) {
		if(this.color == BLACK) {
			g.drawImage(black, r.x, r.y, r.width, r.height, null);
		}
		else {
			g.drawImage(white, r.x, r.y, r.width, r.height, null);
		}
	}

}