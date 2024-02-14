package JRadion;
import javax.swing.*;
public class Cours1 {
	JFrame frame;
	Cours1(){
		frame=new JFrame();
		JRadioButton jrButton1 =new JRadioButton("1-Male");
		JRadioButton jrButton2 =new JRadioButton("2-Femal");
		jrButton1.setBounds(50, 0, 100, 40);
		jrButton2.setBounds(50, 50, 100, 40);
		ButtonGroup bG =new ButtonGroup();
		bG.add(jrButton1);
		bG.add(jrButton2);
		frame.add(jrButton1);
		frame.add(jrButton2);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Cours1();
	}
}
