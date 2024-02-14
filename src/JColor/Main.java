package JColor;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
public class Main extends JFrame implements ActionListener{
	JButton btn;
	Container con;
	Main(){
		con=getContentPane();
		con.setLayout(new FlowLayout());
		btn=new JButton("color");
		btn.addActionListener(this);
		con.add(btn);
	}
	
	public void actionPerformed(ActionEvent e) {
		Color col= Color.red;
		Color colorc=JColorChooser.showDialog(this,"choisir un color pour your Container", col);
		con.setBackground(colorc);
	}
public static void main(String[] args) {
	// Classe Main extends classe JFrame don m est un JFrame
		JFrame m=new Main();
		m.setSize(500,500);
		m.setVisible(true);
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

}
