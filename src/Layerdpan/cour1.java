package Layerdpan;

import java.awt.*;

import javax.swing.*;

public class cour1 {
	JFrame f;
	JLayeredPane ler;
	JPanel p1,p2,p3;
	public cour1() {
		f=new JFrame();
		ler=new JLayeredPane();
		ler.setBounds(0, 0,500, 500);
		
		p1=new JPanel();
		p1.setOpaque(true);
		p1.setBounds(0, 0, 250, 250);
		p1.setBackground(Color.red);
		
		p2=new JPanel();
		p2.setOpaque(true);
		p2.setBounds(100, 100, 250, 250);
		p2.setBackground(Color.yellow);
		

		p3=new JPanel();
		p3.setOpaque(true);
		p3.setBounds(300, 170, 250, 250);
		p3.setBackground(Color.BLACK);
		
		ler.add(p1,Integer.valueOf(0));
		ler.add(p2,Integer.valueOf(1));
		ler.add(p3,Integer.valueOf(2));
		f.add(ler);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(500,500);	
	}
	public static void main(String[] args) {
		new cour1();
	}

}
