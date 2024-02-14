package KeyListner;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class cour1 extends JFrame implements KeyListener{

	JLabel l;
	public cour1() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addKeyListener(this);
		this.setSize(500,500);
		l=new JLabel();
		l.setBounds(0, 0, 100, 100);
		l.setBackground(Color.red);
		l.setOpaque(true);
		this.add(l);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		switch(e.getKeyChar()) {
		
		case 'r' : l.setLocation(l.getX()+10, l.getY());
			break;
		case 'l' : l.setLocation(l.getX()-10, l.getY());
			break;
		case 'b' : l.setLocation(l.getX(), l.getY()+10);
			break;
		case 'n' : l.setLocation(l.getX(), l.getY()-10);
			break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("character entre est :"+e.getKeyChar());
		//System.out.println("character entre est :"+e.getKeyCode());
	}
	public static void main(String[] args) {
		new cour1();
	}
}
