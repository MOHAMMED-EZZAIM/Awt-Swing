package setLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BourderLayout extends JFrame {
	JButton b1,b2,b3,b4,b5;
   public BourderLayout() {
	setTitle("hello word");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setSize(300,300);
	setLayout(new BorderLayout(30,30));
	b1=new JButton("Exit programe b1");
	b2=new JButton("Exit programe b2");
	b3=new JButton("Exit programe b3");
	b4=new JButton("Exit programe b4");
	b5=new JButton("Exit programe b4");
	this.add(b1, BorderLayout.NORTH);
	this.add(b2, BorderLayout.WEST);
	this.add(b3, BorderLayout.EAST);
	this.add(b5, BorderLayout.SOUTH);
	this.add(b4, BorderLayout.CENTER);	
}
    public static void main(String[] args) {
		new BourderLayout();
	}
}