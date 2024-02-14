package JColor;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Main2 extends JFrame implements ActionListener{
	JButton b;
	Container con;
	public Main2() {
		con=getContentPane();
		con.setLayout(new FlowLayout());
		b=new JButton("Choisire un colore:");
		b.addActionListener(this);
		con.add(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Color cDefa=Color.white;
		Color cChoiser;
		cChoiser=JColorChooser.showDialog(this, "choisir un colore", cDefa);
		con.setBackground(cChoiser);
		
	}
	public static void main(String[] args) {
		JFrame m=new Main2();
		m.setSize(500,500);
		m.setVisible(true);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

}
