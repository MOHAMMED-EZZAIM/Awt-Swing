package Choix;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class M1 extends JFrame implements ItemListener {
	Choice c;
	Container con;
	public M1() {
	    con=getContentPane();
		setLayout(null);
		setVisible(true);
		setSize(300,300);
		pack();
		c=new Choice();
		c.add("yellow");
		c.add("red");
		c.add("blue");
		c.add("green");
		c.addItemListener(this);
	    add(c);
		add(con);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new M1();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String s=c.getSelectedItem();
		setTitle("employer numero :"+s);
		Color c;
		switch(s) {
		case "yellow": c=Color.yellow;  
			break;
		case "red": c=Color.red;  
		    break;
		case "blue": c=Color.blue;  
		     break;
		case "green": c=Color.green;  
	     break;
		 default : c=Color.black; break;  
		}
		con.setBackground(c);
	}

}
