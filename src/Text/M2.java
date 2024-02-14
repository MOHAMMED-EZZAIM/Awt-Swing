package Text;
import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.*;
	public class M2 extends JFrame implements ActionListener{
	     TextArea text;
	     JButton b1;
	     JPanel p;
		public M2() {
			p=new JPanel();
			p.setVisible(true);
			p.setLayout(new GridLayout(1,2));
			b1=new JButton("envoyer");
			text=new TextArea("hello!",3,30);
			b1.addActionListener(this);
			p.add(text);
			p.add(b1);
			setVisible(true);
			setSize(500,500);
			setLayout(new BorderLayout());
			add(p,BorderLayout.NORTH);
			pack();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		public static void main(String[] args) {
			new M2();
		}
	}



