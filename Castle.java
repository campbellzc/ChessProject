public class Castle {
	
	Color color;
	Image white;
	Image black;

	public Castle(Color color) {
		this.color = color;
		this.white = Bishop.loadImage("rook_white");
		this.black = Bishop.loadImage("rook_black");

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