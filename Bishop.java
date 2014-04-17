public class Bishop extends Piece {
	
	private Color color;
	private Image white;
	private Image black;

	public Bishop(Color color) {
		this.color = color;
		this.white = Bishop.loadImage("bishop_white");
		this.black = Bishop.loadImage("bishop_black");

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