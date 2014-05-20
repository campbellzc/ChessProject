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

	private JButton lastClicked;
	private String pieceX;
<<<<<<< HEAD

=======
	public JButton[][] board;
>>>>>>> 1229eb57945bae049f405b48d3f35fb09dbc419e
	public void init() {

		setLayout(new GridLayout(8,8));
		JButton[][] board = new JButton[8][8];
		String title = "";

		for (int i=0; i<8; i++) {

			for (int j=0; j<8; j++) {

				JButton btn = new JButton(title);
				Piece piece = null;

				if (i == 1) {

				 	Pawn pawnB = new Pawn("black", "pawn", j, i);
				 	pawnB.setIcon(new ImageIcon(Piece.loadImage("pawn_black")));
				 	piece = pawnB;
					
				} else if (i == 6) {

				 	Pawn pawnW = new Pawn("white", "pawn", j, i);
				 	pawnW.setIcon(new ImageIcon(Piece.loadImage("pawn_white")));
				 	piece = pawnW;
					
				}
				if (i == 0 && (j == 0 || j == 7)) {

					Castle rookB = new Castle("black", "rook", j, i);
					rookB.setIcon(new ImageIcon(Piece.loadImage("rook_black")));
					piece = rookB;
					
				} else if (i == 7 && (j == 0 || j == 7)) {

					Castle rookW = new Castle("white", "rook", j, i);
					rookW.setIcon(new ImageIcon(Piece.loadImage("rook_white")));
					piece = rookW;
					
				}
				if (i == 0 && (j == 1 || j == 6)) {

					Knight knightB = new Knight("black", "knight", j, i);
					knightB.setIcon(new ImageIcon(Piece.loadImage("knight_black")));
					piece = knightB;
					
				} else if (i == 7 && (j == 1 || j == 6)) {

					Knight knightW = new Knight("white", "knight", j, i);
					knightW.setIcon(new ImageIcon(Piece.loadImage("knight_white")));
					piece = knightW;
					
				}
				if (i == 0 && (j == 2 || j == 5)) {

					Bishop bishopB = new Bishop("black", "bishop", j, i);
					bishopB.setIcon(new ImageIcon(Piece.loadImage("bishop_black")));
					piece = bishopB;
					
				} else if (i == 7 && (j == 2 || j == 5)) {

					Bishop bishopW = new Bishop("white", "bishop", j, i);
					bishopW.setIcon(new ImageIcon(Piece.loadImage("bishop_white")));
					piece = bishopW;
					
				}
				if (i == 0 && j == 3) {

					Queen queenB = new Queen("black", "queen", j, i);
					queenB.setIcon(new ImageIcon(Piece.loadImage("queen_black")));
					piece = queenB;
					
				} else if (i == 7 && j == 3) {

					Queen queenW = new Queen("white", "queen", j, i);
					queenW.setIcon(new ImageIcon(Piece.loadImage("queen_white")));
					piece = queenW;
					
				}
				if (i == 0 && j == 4) {

					King kingB = new King("black", "king", j, i);
					kingB.setIcon(new ImageIcon(Piece.loadImage("king_black")));
					piece = kingB;
					
				} else if (i == 7 && j == 4) {

					King kingW = new King("white", "king", j, i);
					kingW.setIcon(new ImageIcon(Piece.loadImage("king_white")));
					piece = kingW;
					
				}

				if (piece == null) {
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
					board[i][j] = btn;
					this.add(btn);
					continue;
				}

				if (i%2 == 0) {
					if (j%2 == 0) {
						piece.setBackground(new Color(235,199,158));
					} else {
						// dark color
						piece.setBackground(new Color(92,51,23));
					}
				} else {
					if (j%2 == 0) {
						// dark color
						piece.setBackground(new Color(92,51,23));
					} else {
						piece.setBackground(new Color(235,199,158));
					}
				}
				piece.setBorderPainted(false);
				piece.setOpaque(true);
				piece.addActionListener(this);
				board[i][j] = piece;
				this.add(piece);
			}

		}

	}

	public void paint(Graphics g) {
		super.paint(g);
	}

	public void actionPerformed(ActionEvent ae) {
		JButton currentlyClicked = (JButton)ae.getSource();
		if (currentlyClicked instanceof Piece) {
			Piece piece = (Piece)currentlyClicked;
		}
		lastClicked = (JButton)ae.getSource();
	}

	public boolean hasPiece(JButton btn) {
		if (btn.getIcon() != null) {
			System.out.println("True");
			return true;
		} else {
			System.out.println("False");
			return false;
		}
	}
	
}
