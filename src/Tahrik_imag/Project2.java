package Tahrik_imag;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Project2 implements KeyListener{
	JFrame f;
	JLabel l;
	public Project2() {
		f=new JFrame("Label yatahark");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,600);
		f.setLayout(null);
		l=new JLabel();
		f.addKeyListener(this);
		l.setBounds(100, 100, 100, 100);
		l.setBackground(Color.red);
		l.setOpaque(true);
		f.add(l);
		f.getContentPane().setBackground(Color.BLACK);
		f.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
		case 'r':  l.setLocation(l.getX()+10, l.getY());
				break;
		case 'l':  l.setLocation(l.getX()-10, l.getY());
				break;
		case 'b':  l.setLocation(l.getX(), l.getY()+10);
				break;
		case 'n':  l.setLocation(l.getX(), l.getY()-10);
				break;
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
