import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TableApplet extends Applet implements ActionListener{

	private JButton btn;
	private String pieceX;
	public void init() {

		setLayout(new GridLayout(8,8));
		JButton[][] board = new JButton[8][8];
		String title = "";

		for (int i=0; i<8; i++) {

			for (int j=0; j<8; j++) {

				if (i <= 1) {
					title = "Piece";
				} else if (i >= 6) {
					title = "Piece";
				}

				btn = new JButton(title);
				btn.setPreferredSize(new Dimension(40, 40));
				board[i][j] = btn;

				if (i%2 == 0) {
					if (j%2 == 0) {
						btn.setBackground(new Color(235,199,158));
					} else {
						// dark color
						btn.setBackground(new Color(92,51,23));
					}
				} else {
					if (j%2 == 0) {
						// dark color
						btn.setBackground(new Color(92,51,23));
					} else {
						btn.setBackground(new Color(235,199,158));
					}
				}

				btn.setBorderPainted(false);
				btn.setOpaque(true);
				btn.addActionListener(this);
				this.add(btn);
				title = "";

				if (i == 1) {
					btn.setIcon(new ImageIcon(Piece.loadImage("pawn_white")));
					Piece pawnW = new Piece("white", "pawn", j, i);
					btn.setDescription("pawnW");
				} else if (i == 6) {
					btn.setIcon(new ImageIcon(Piece.loadImage("pawn_black")));
					Piece pawnB = new Piece("black", "pawn", j, i);
					btn.setDescription("pawnB");
				}
				if (i == 0 && (j == 0 || j == 7)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("rook_white")));
					Piece rookW = new Piece("white", "rook", j, i);
					btn.setDescription("rookW");
				} else if (i == 7 && (j == 0 || j == 7)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("rook_black")));
					Piece rookB = new Piece("black", "rook", j, i);
					btn.setDescription("rookB");
				}
				if (i == 0 && (j == 1 || j == 6)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("knight_white")));
					Piece knightW = new Piece("white", "knight", j, i);
					btn.setDescription("knightW");
				} else if (i == 7 && (j == 1 || j == 6)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("knight_black")));
					Piece knightB = new Piece("black", "knight", j, i);
					btn.setDescription("knightB");
				}
				if (i == 0 && (j == 2 || j == 5)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("bishop_white")));
					Piece bishopW = new Piece("white", "bishop", j, i);
					btn.setDescription("bishopW");
				} else if (i == 7 && (j == 2 || j == 5)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("bishop_black")));
					Piece bishopB = new Piece("black", "bishop", j, i);
					btn.setDescription("bishopB");
				}
				if (i == 0 && j == 3) {
					btn.setIcon(new ImageIcon(Piece.loadImage("queen_white")));
					Piece queenW = new Piece("white", "queen", j, i);
					btn.setDescription("queenW");
				} else if (i == 7 && j == 3) {
					btn.setIcon(new ImageIcon(Piece.loadImage("queen_black")));
					Piece queenB = new Piece("black", "queen", j, i);
					btn.setDescription("queenB");
				}
				if (i == 0 && j == 4) {
					btn.setIcon(new ImageIcon(Piece.loadImage("king_white")));
					Piece kingW = new Piece("white", "king", j, i);
					btn.setDescription("kingW");
				} else if (i == 7 && j == 4) {
					btn.setIcon(new ImageIcon(Piece.loadImage("king_black")));
					Piece kingB = new Piece("black", "king", j, i);
					btn.setDescription("kingB");
				}
			}

		}

	}

	public void paint(Graphics g) {
		super.paint(g);
	}

<<<<<<< HEAD
	public void actionPerformed(ActionEvent ae) {

		if ("Piece".equals(ae.getActionCommand())) {
			System.out.println("test");
			repaint();
		}

=======
	public void actionPerformed(ActionEvent e) {
		if (!btn.getImage().getDescription().equals(null)) {
			if (btn.getImage().getDescription().substring(getDescription.length()-1,getDescription.length()).equals("W")) {
				pieceX = btn.getImage().getDescription().substring(0, getDescription.length()-1);
			} else {
				
			}
			
		}
		
>>>>>>> 3d1f6dcd4bb0a48deaaf44618079b57ec4a9c9c8
	}

	public boolean hasPiece(JButton btn) {
		if (btn.getIcon() != null) {
			return true;
		} else {
			return false;
		}
	}
	
}
