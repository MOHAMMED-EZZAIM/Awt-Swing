package pack1;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Main {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JButton button=new JButton("Cliquer");
		button.setBounds(140, 110, 120, 60);
		frame.add(button);
		frame.setSize(500,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
