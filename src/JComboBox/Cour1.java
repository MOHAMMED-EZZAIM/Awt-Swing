package JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
public class Cour1 {
		JFrame fram;
		Cour1(){
			fram=new JFrame("CompoBox");
            String [] names= {"mohammed","ossama","Ali","ismail"};
            String [] fruit= {"Apple","Orange","Banana",};
			JComboBox jcompo  = new JComboBox(names);
			JComboBox j2 =new JComboBox (fruit);
			jcompo.setBounds(60, 60, 100, 30);
			j2.setBounds(60, 100, 100, 30);
			fram.add(j2);
			fram.add(jcompo);
			fram.setSize(500,500);
			fram.setLayout(null);
			fram.setVisible(true);
		}
		public static void main(String[] args) {
			new  Cour1();
		}
}
