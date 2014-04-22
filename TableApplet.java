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

		for (int i=0; i<64; i++) {
			setLayout(new GridLayout(8,8));
			btn = new JButton();
			if (i>7 && i<16 || i>23 && i<32 || i>39 && i<48 || i>55 && i<64) {
				if (i%2 == 0) {
					btn.setBackground(Color.BLACK);
				} else {
					btn.setBackground(Color.WHITE);
				}
			} else {
				if (i%2 == 0) {
					btn.setBackground(Color.WHITE);
				} else {
					btn.setBackground(Color.BLACK);
				}
			}

			String path = null;
			Image image = null;

			if (i>7 && i<16) {
				try {
				    path = "pictures" + File.separator + "pawn_black.png";
				    File file = new File(path);
				    Image img = ImageIO.read(new File(path));
				    btn.setIcon(new ImageIcon(img));
				  } catch (IOException ex) {
				  	System.out.println("Could not load image at path: " + path);
				  	System.exit(1);
				  }
			} else if (i>47 && i<56) {
				try {
				    path = "pictures" + File.separator + "pawn_white.png";
				    File file = new File(path);
				    Image img = ImageIO.read(new File(path));
				    btn.setIcon(new ImageIcon(img));
				  } catch (IOException ex) {
				  	System.out.println("Could not load image at path: " + path);
				  	System.exit(1);
				  }
			}
			btn.setContentAreaFilled(false);
			btn.setForeground(Color.BLACK);
			btn.setOpaque(true);
			btn.addActionListener(this);
			this.add(btn);
		}

	}

	public void paint(Graphics g) {
		super.paint(g);
	}

	// Peice test = new Peice();
	// public void paint(Graphics g) {
	// 	super.paint(g);
	// 	test.draw(bishop_black);
	// }
	
	public void actionPerformed(ActionEvent e) {

	}
}