package Mouselistner;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class cour2 extends JFrame implements MouseListener{
	JLabel l;
	Icon i1,i2,i3,i4,i5;
	public cour2() {
		i1=new ImageIcon("Twemoji12_1f602.svg.png");
		i2=new ImageIcon("yellow-faced-smiley-emoji-with-tears-in-its-sockets-free-vector.jpg");
		i3=new ImageIcon("image (1).png");
		i4=new ImageIcon("images (2).jpg");
		i5=new ImageIcon("RJ45.jpg");
		l=new JLabel();
		l.setBounds(20, 0, 200, 200);
		l.setBorder(BorderFactory.createDashedBorder(Color.red,100,100));
		l.addMouseListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700,700);
		//this.getContentPane().setBackground(Color.BLACK);
		this.add(l);
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		l.setIcon(i1);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//lab9iti bark 3ela 
		l.setIcon(i2);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		l.setIcon(i5);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		l.setIcon(i3);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		l.setIcon(i4);
		
	}
	
	public static void main(String[] args) {
		new cour2();
	}
	
}
