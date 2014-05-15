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
	public void init() {

		setLayout(new GridLayout(8,8));
		JButton[][] board = new JButton[8][8];
		String title = "";

		for (int i=0; i<8; i++) {

			for (int j=0; j<8; j++) {

				JButton btn = new JButton(title);
				btn.setPreferredSize(new Dimension(40, 40));
				

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

				if (i == 1) {
					btn.setIcon(new ImageIcon(Piece.loadImage("pawn_white")));
				 	Pawn pawnW = new Pawn("white", "pawn", j, i);
					// btn.setDescription("pawnW");
				} else if (i == 6) {
					btn.setIcon(new ImageIcon(Piece.loadImage("pawn_black")));
				 	Pawn pawnB = new Pawn("black", "pawn", j, i);
					// btn.setDescription("pawnB");
				}
				if (i == 0 && (j == 0 || j == 7)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("rook_white")));
					Castle rookW = new Castle("white", "rook", j, i);
					// btn.setDescription("rookW");
				} else if (i == 7 && (j == 0 || j == 7)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("rook_black")));
					Castle rookB = new Castle("black", "rook", j, i);
					// btn.setDescription("rookB");
				}
				if (i == 0 && (j == 1 || j == 6)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("knight_white")));
					Knight knightW = new Knight("white", "knight", j, i);
					// btn.setDescription("knightW");
				} else if (i == 7 && (j == 1 || j == 6)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("knight_black")));
					Knight knightB = new Knight("black", "knight", j, i);
					// btn.setDescription("knightB");
				}
				if (i == 0 && (j == 2 || j == 5)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("bishop_white")));
					Bishop bishopW = new Bishop("white", "bishop", j, i);
					// btn.setDescription("bishopW");
				} else if (i == 7 && (j == 2 || j == 5)) {
					btn.setIcon(new ImageIcon(Piece.loadImage("bishop_black")));
					Bishop bishopB = new Bishop("black", "bishop", j, i);
					// btn.setDescription("bishopB");
				}
				if (i == 0 && j == 3) {
					btn.setIcon(new ImageIcon(Piece.loadImage("queen_white")));
					Queen queenW = new Queen("white", "queen", j, i);
					// btn.setDescription("queenW");
				} else if (i == 7 && j == 3) {
					btn.setIcon(new ImageIcon(Piece.loadImage("queen_black")));
					Queen queenB = new Queen("black", "queen", j, i);
					// btn.setDescription("queenB");
				}
				if (i == 0 && j == 4) {
					btn.setIcon(new ImageIcon(Piece.loadImage("king_white")));
					King kingW = new King("white", "king", j, i);
					// btn.setDescription("kingW");
				} else if (i == 7 && j == 4) {
					btn.setIcon(new ImageIcon(Piece.loadImage("king_black")));
					King kingB = new King("black", "king", j, i);
					// btn.setDescription("kingB");
				}
				board[i][j] = btn;
				this.add(btn);
			}

		}

	}

	public void paint(Graphics g) {
		super.paint(g);
	}

	public void actionPerformed(ActionEvent ae) {
		lastClicked = (JButton)ae.getSource();
		JButton temp = lastClicked;

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
