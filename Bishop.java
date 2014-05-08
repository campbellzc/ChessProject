public class Bishop extends Piece {
	private Color color
	public Bishop(Color colo, int x, int y) {
		this.color = colo;
		this.x = x;
		this.y = y;
		this.icon = new ImageIcon(Peice.loadImage("Bishop", color));
	}

}