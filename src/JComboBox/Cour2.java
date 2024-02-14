package JComboBox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Cour2 implements ActionListener{

	JFrame f;
	JComboBox com;
	public Cour2() {
		f=new JFrame();
		String t[]= {"sir","irisi","MIPC","BCG"};
		com=new JComboBox(t);
		com.addActionListener(this);
		//com.setEditable(true);
		com.addItem("GC");
		com.setSelectedItem("MIPC");
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setSize(300,300);
		f.add(com);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Cour2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==com) {
		System.out.println(com.getSelectedItem());
		System.out.println(com.getSelectedIndex());
	}
		
	}
}
