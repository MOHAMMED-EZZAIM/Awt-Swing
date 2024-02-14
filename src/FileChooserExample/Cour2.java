package FileChooserExample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Cour2 implements ActionListener{

	JFrame f;
	JButton b;
	public Cour2() {
		f=new JFrame();
		b=new JButton("Choisir un file");
		f.add(b);
		b.addActionListener(this);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.pack();
	}
	public static void main(String[] args) {
		new Cour2();
	}
	public void actionPerformed(ActionEvent e) {
		JFileChooser d=new JFileChooser();
		//d.showOpenDialog(b);
		//d.showSaveDialog(b);
		
	}
}
