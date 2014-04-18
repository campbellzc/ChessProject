public class Pawn extends Piece{
	private int steps;
	private Color color;
	private Image white;
	private Image black;
	public Pawn(Color color) {
		steps = 0;
		this.color = color;
		this.white = Piece.loadImage("pawn_white");
		this.black = Piece.loadImage("pawn_black");
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