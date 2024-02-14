package Menu;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class Course_impo implements ActionListener{

	String [] filItem= {"New","Open","Save","Exit"};
	String [] editeItem = {"Undo","Cut","Copy","Paste"};
	//char [] filShorcuts= {'N','O','S','E'};
	char []editShorcuts= {'Z','X','C','V'};

	public Course_impo() {
		JMenu filMenu=new JMenu("File");
		JMenu editmanu=new JMenu("Edit");
		JMenu othemenu=new JMenu("Other");
		JMenu sumMenu=new JMenu("SubMenu");
		
		for(int i=0;i<filItem.length;i++) {
			//JMenuItem item=new JMenuItem(filItem[i],filShorcuts[i]);
			JMenuItem item=new JMenuItem(filItem[i]);
			item.addActionListener(this);
			filMenu.add(item);
		}
		
		for(int i=0;i<editeItem.length;i++) {
			JMenuItem item=new JMenuItem(editeItem[i]);
			item.addActionListener(this);
			item.setAccelerator(KeyStroke.getKeyStroke(editShorcuts[i],
			java.awt.Event.CTRL_MASK));
			editmanu.add(item);
		}
//		editmanu.insertSeparator(1);
//		JMenuItem item;
//		sunMenu2.add
		JMenuBar bar=new JMenuBar();
		JFrame f=new JFrame();
		bar.add(filMenu);
		bar.add(editmanu);
		f.setLayout(new BorderLayout());
		f.add(bar,BorderLayout.NORTH);
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Menu :"+"{"+e.getActionCommand()+"}"+"Was cheked");
		
	}
	public static void main(String[] args) {
		new Course_impo();
	}
}
