package List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class M1 extends JFrame implements ActionListener{
	List l;
	public M1() {
		l=new List(2,false);
		l.add("mohammed");
		l.add("latifa");
		l.add("mareyame");
		l.add("houda");
		l.add("lina");
		l.add("baba");
		l.se
		l.addActionListener(this);
		setVisible(true);
		setSize(500,500);
		setLayout(new BorderLayout());
		add(l,BorderLayout.NORTH);
		pack();
	}
	public static void main(String[] args) {
		new M1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s=l.getSelectedItem();
		setTitle(s);
		
	}
}
