package Tahrik_imag;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragPanel extends JPanel{
	Icon img=new ImageIcon("Twemoji12_1f602.svg.png");
	final int WIDTH=img.getIconWidth();
	final int HEIGHT=img.getIconHeight();
	Point imagConer;
	Point prevpt;
	public DragPanel() {
		imagConer=new Point(0,0);
		clickListener o1Click=new clickListener();
		DragListener o2Click=new DragListener();
		this.addMouseListener(o1Click);
		this.addMouseMotionListener(o2Click);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		img.paintIcon(this, g, (int)imagConer.getX(), (int)imagConer.getY());
		
	}
	private class clickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			prevpt=e.getPoint();
		}
	}
	private class DragListener extends MouseMotionAdapter{	
		public void mouseDragged(MouseEvent e) {
			Point currentpt=e.getPoint();
			imagConer.translate(
					(int)(currentpt.getX()-prevpt.getX()), 
					(int)(currentpt.getY()-prevpt.getY()));
			prevpt=currentpt;
			repaint();
		}
	}
}
