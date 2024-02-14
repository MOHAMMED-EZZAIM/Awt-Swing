package Jlabel;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Coures1 {
	JFrame f;
	JLabel lab;
	public Coures1() {
		f=new  JFrame();
		f.setLayout(new FlowLayout());
		Icon img=new ImageIcon("reseau bnc 2.jpg");
		lab=new JLabel("image reseau",img,SwingConstants.LEFT);
		f.add(lab);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(500,500);
	}
	public static void main(String[] args) {
		new Coures1();
	}

}
