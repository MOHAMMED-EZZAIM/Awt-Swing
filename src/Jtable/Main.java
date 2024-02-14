package Jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {
	JFrame fram;
	Main(){
		fram=new JFrame();
		String [][] names= {
				{"100","mohammed","java developeur"},
				{"100","mohammed","java developeur"},
				{"100","mohammed","java developeur"},
				{"100","mohammed","java developeur"},
				{"100","mohammed","java developeur"}};
		
		String header[]= {"ID","names","Departements"};
		JTable t =new JTable(names,header);
		//t.setBounds(40,50, 300, 200);
		JScrollPane s=new JScrollPane(t);
		//s.setBounds(40, 50, 300, 400);
		fram.add(s);
		fram.setSize(400, 400);
		fram.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Main();
	}

}
