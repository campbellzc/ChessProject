import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class TableApplet extends Applet implements ActionListener{

	private JButton btn;

	public void init() {

		for (int i=0; i<64; i++) {
			setLayout(new GridLayout(8,8));
			btn = new JButton();
			btn.setPreferredSize(new Dimension(40,40));
			if (i%2 == 0) {
				btn.setBackground(Color.WHITE);
			} else {
				btn.setBackground(Color.BLACK);
			}
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