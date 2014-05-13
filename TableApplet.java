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
				} else if (i == 6) {
					btn.setIcon(new ImageIcon(Piece.loadImage("pawn_black")));
				}

			}

		}

	}

	public void paint(Graphics g) {
		super.paint(g);
	}

	public void actionPerformed(ActionEvent ae) {

		if ("Piece".equals(ae.getActionCommand())) {
			System.out.println("test");
			repaint();
		}

	}

	public boolean hasPiece(JButton btn) {
		if (btn.getIcon() != null) {
			return true;
		} else {
			return false;
		}
	}
	
}