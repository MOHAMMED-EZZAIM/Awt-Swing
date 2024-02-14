package JobtionPane;

import javax.swing.JOptionPane;

public class coures1 {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null,"mohammed ezzaim", "le titre",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null,"mohammed ezzaim", "le titre",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null,"mohammed ezzaim", "le titre",JOptionPane.QUESTION_MESSAGE);
	int nbr=JOptionPane.showConfirmDialog(null, "bro, entre you name oui or no?", "this important", JOptionPane.YES_NO_CANCEL_OPTION);
	if(nbr==0) {
		String name=JOptionPane.showInputDialog("what is your name ?");
		System.out.println(nbr);
		System.out.println("hello bro:"+name);
	}	
	}
	
}
