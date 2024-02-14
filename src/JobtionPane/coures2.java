package JobtionPane;
import javax.swing.*;
import java.awt.*;
public class coures2 {

	public static void main(String[] args) {
		String s[]= {"YOUR ARE ETUDIANT FST","DE ENSA","DE SMLALYA"};
		//JOptionPane.showOptionDialog(null, "hello word", "titre", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("icons8-maroc-96.png"), s, 0);
		@SuppressWarnings("unused")
		int i=JOptionPane.showOptionDialog(null, "hello word", "titre", 0, 0, new ImageIcon("icons8-maroc-96.png"), s, 0);
       if(i==0) {
    	   System.out.println("you are etudiant de fst");
       }
       else if(i==1) {
    	   System.out.println("you are etudiant de ensa");
       }
       else if(i==2) {
    	   System.out.println("you are etudiant de smalaliya");
       }
	}
}
