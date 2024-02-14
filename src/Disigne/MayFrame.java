package Disigne;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MayFrame extends JFrame{
	MyPanel p;
	public MayFrame() {
		p=new MyPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.add(p);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
}
