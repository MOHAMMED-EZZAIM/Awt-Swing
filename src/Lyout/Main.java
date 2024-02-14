package Lyout;

import java.awt.GridLayout;
import javax.swing.*;

public class Main {

	public Main() {
		JFrame f=new JFrame();
		JLabel lastName=new JLabel("Last Name",JLabel.RIGHT);
		JLabel midellName=new JLabel("midell Name ",JLabel.RIGHT);
		JLabel firstName=new JLabel("first Name",JLabel.RIGHT);
		JTextField lasttField=new JTextField();
		JTextField middellField =new JTextField();
		JTextField firstField=new JTextField();
		
		lastName.setDisplayedMnemonic('L');
		midellName.setDisplayedMnemonic('M');
		firstName.setDisplayedMnemonic('F');
		
		lastName.setLabelFor(lasttField);
		midellName.setLabelFor(middellField);
		firstName.setLabelFor(firstField);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,3,5,5));
		p.add(lastName);
		p.add(lasttField);
		p.add(midellName);
		p.add(middellField);
		p.add(firstName);
		p.add(firstField);
		f.add(p);
		f.setVisible(true);
		f.pack();
	}
	public static void main(String[] args) {
		new Main();
	}
}
