package ChekBox;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

public class Main implements ItemListener {
	JFrame f;
	Checkbox c1,c2,c3;
	TextArea text;
	Panel p;
	Panel pp;
	Font font;
	Main(){
		  font =new Font("",Font.BOLD,34);
		  f=new JFrame();
		  c1=new Checkbox("pencile",true);
		  c2=new Checkbox("rouler",false);
		  c3=new Checkbox("gome");
		  p=new Panel();
		  pp=new Panel();
		  text=new TextArea();
		  text.setFont(font);
		  text.setBackground(Color.BLUE);
		  text.setBounds(0, 0, 0, 0);
		  p.setLayout(new FlowLayout());
		  p.setVisible(true);
		  p.add(c1);
		  p.add(c2);
		  p.add(c3);
		  pp.setLayout(new FlowLayout());
		  pp.add(text);
		  c1.addItemListener(this);
		  c2.addItemListener(this);
		  c3.addItemListener(this);
		  f.setLayout(new BorderLayout());
		  f.add(p,BorderLayout.NORTH);
		  f.add(pp,BorderLayout.CENTER);
	      f.setVisible(true);
		  f.setSize(400,400);
	}
	
public void itemStateChanged(ItemEvent e) {
	Checkbox cliquOne=(Checkbox)e.getItemSelectable();
	String message=cliquOne.getLabel();
	text.setText(message);
		if(e.getStateChange()==ItemEvent.SELECTED) {
			f.setTitle("bravo il a cliquer sur un chikbox");
		}
		else {
			f.setTitle("aucun cliquer");
		}
		
	}
	public static void main(String[] args) {
		new Main();
	}

	
	
}
