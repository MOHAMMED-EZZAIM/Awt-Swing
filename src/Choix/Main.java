package Choix;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.channels.SelectableChannel;
import java.nio.channels.Selector;

public class Main  implements ItemListener{
	Frame f;
	Main(){
		f=new Frame();
		Choice c=new Choice();
		c.addItem("one");
		c.addItem("too");
		c.addItem("tree");
		c.addItem("foor");
		f.setSize(200,200);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setTitle("aucun titre");
		f.add(c);
		
	}
	public static void main(String[] args) {
		new Main();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice s=(Choice)e.getItemSelectable();
		String mess=s.getName();
		if(e.getStateChange()==ItemEvent.SELECTED) {
			f.setTitle("le name select est "+mess);
		}
		
	}

}
