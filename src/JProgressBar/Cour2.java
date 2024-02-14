package JProgressBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class Cour2 extends JFrame{
	public Cour2() {
		JProgressBar pro=new JProgressBar(0,500);
		pro.setBounds(20, 20, 400, 100);
		pro.setStringPainted(true);
		pro.setForeground(Color.red);
		pro.setBackground(Color.BLACK);
		pro.setFont(new Font("",Font.BOLD,20));
		this.add(pro,BorderLayout.NORTH);
		int i=500;
		this.setLayout(new BorderLayout());
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(i>0) {
			pro.setValue(i);
			i=i-10;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		pro.setString("termine!");
		
	}

	public static void main(String[] args) {
		new Cour2();
	}
}
