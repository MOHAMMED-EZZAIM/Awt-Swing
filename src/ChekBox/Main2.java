package ChekBox;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

public class Main2 implements ItemListener{
	JFrame f;
	Checkbox c1,c2,c3;
	CheckboxGroup grp;
	TextField text;
	Panel p;
	Panel pp;
	Main2(){
		  f=new JFrame();
		  grp=new CheckboxGroup();
		  c1=new Checkbox("pencile",true,grp);
		  c2=new Checkbox("rouler",false,grp);
		  c3=new Checkbox("gome",false,grp);
		  p=new Panel();
		  pp=new Panel();
		  text=new TextField();
		  text.setBackground(Color.BLUE);
		  text.setBounds(0, 0, 200, 200);
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
		new Main2();
	}

	
	
}
