import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Castle extends Piece{

	public Castle(String color, String type, int x, int y, JButton[][] board) {
		super(color, type, x, y, board);
	}

}
