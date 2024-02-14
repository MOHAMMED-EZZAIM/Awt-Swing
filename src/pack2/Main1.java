package pack2;
import javax.swing.*;
public class Main1 {
	JFrame frame;
	public Main1() {
		frame=new JFrame();
		JButton b=new JButton("Cliquer");
		b.setBounds(120, 100, 110, 50);
		frame.add(b);
		frame.setSize(1000,1000);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Main1();
	}

}
