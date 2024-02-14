package Font;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class Main implements ActionListener{
	JFrame f;
	JButton b;
	JTextArea text;
	TextArea area;
	Font fon;
	public Main() {
		//============================================
		fon =new Font("",Font.BOLD,50);
		//=============================================
		f=new JFrame("this Application");
		b=new JButton("envoyer");
		area=new TextArea("hello",200,300,TextArea.SCROLLBARS_BOTH);
		text.setFont(fon);
		text.setBackground(Color.DARK_GRAY);
		text.setForeground(Color.red);
		text.setSize(300,300);
		text.setBounds(0, 0,1300, 150);
		f.add(text);
		f.add(b);
		b.setBounds(10, 160,100, 30);
		b.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(500,500);
		
	}
	public static void main(String[] args) {
		new Main();
	}

	public void actionPerformed(ActionEvent e) {
		String t=text.getText();
		text.setText("");
		f.setTitle(t);
		
	}
}

