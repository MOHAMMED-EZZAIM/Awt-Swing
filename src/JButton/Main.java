package JButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//JButton()
//JButton(String s)
//JButton(Icon i)
//public void setTex(String s)
//public String getTesx()
//public void setEnabled(boolean b) 

public class Main {
	public Main() {
		JFrame frame=new JFrame();
		JButton b=new JButton(new ImageIcon("9797456.png"));
		b.setBounds(200, 100, 100, 100);
		frame.add(b);
		frame.setSize(600,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
   public static void main(String[] args) {
	   
	new Main();
}
}
