package Text;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class M1 extends JFrame implements ActionListener{
     TextField text;
     JButton b1;
     JPanel p;
	public M1() {
		p=new JPanel();
		p.setVisible(true);
		p.setLayout(new GridLayout(1,2));
		b1=new JButton("envoyer");
		text=new TextField("mohammed ezzaim sir 2023 i am verry happy",6);
		b1.addActionListener(this);
		p.add(text);
		p.add(b1);
		setVisible(true);
		setSize(500,500);
		setLayout(new BorderLayout());
		add(p,BorderLayout.NORTH);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String s=text.getText();
			setTitle(s);
		}	
	}
	public static void main(String[] args) {
		new M1();
	}
}
