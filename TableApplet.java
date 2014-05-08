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

		for (int i=0; i<8; i++) {

			for (int j=0; j<8; j++) {
				btn = new JButton();
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

				// String path = null;
				// Image image = null;

				// if (i<2) {
				// 	try {
				// 	    path = "pictures" + File.separator + "pawn_black.png";
				// 	    File file = new File(path);
				// 	    Image img = ImageIO.read(new File(path));
				// 	    btn.setIcon(new ImageIcon(img));
				// 	  } catch (IOException ex) {
				// 	  	System.out.println("Could not load image at path: " + path);
				// 	  	System.exit(1);
				// 	  }
				// } else if (i>5) {
				// 	try {
				// 	    path = "pictures" + File.separator + "pawn_white.png";
				// 	    File file = new File(path);
				// 	    Image img = ImageIO.read(new File(path));
				// 	    btn.setIcon(new ImageIcon(img));
				// 	  } catch (IOException ex) {
				// 	  	System.out.println("Could not load image at path: " + path);
				// 	  	System.exit(1);
				// 	  }
				// }

			}

		}

	}

	public void paint(Graphics g) {
		super.paint(g);
	}

	public void actionPerformed(ActionEvent e) {

	}
}