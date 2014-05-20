import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.imageio.ImageIO;

public class Bishop extends Piece {
	public Bishop(String color, String type, int x, int y, JButton[][] board) {
		super(color, type, x, y, board);
	}
	public ArrayList<JButton> getMoveLocations() {
		ArrayList<JButton> places = new ArrayList<JButton>();
		for (int i=Math.min(this.x, this.y); i<8-this.x; i++) {
			int height = this.y;
			int width = this.x;
			if(board[width][height] instanceof Piece) {
				break;
			} else {
				places.add(board[width][height]);
			}
			width++;
			height++;
		}
		for (int i=Math.min(this.x, this.y); i>0; i++) {
			int height = this.y;
			int width = this.x;
			if(board[width][height] instanceof Piece) {
				break;
			} else {
				places.add(board[width][height]);
			}
			width--;
			height--;
		}
		return places;
	}

}