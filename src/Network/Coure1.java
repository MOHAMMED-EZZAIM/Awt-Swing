package Network;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.*;
public class Coure1 implements ActionListener{
	JFrame f;
	JLabel l;
	JButton b;
	JTextField text;
	public Coure1() {
		f=new JFrame();
		l=new JLabel();
		b=new JButton();
		
		text=new JTextField(20);
		b=new JButton("Find the ip");
		b.setBounds(30,240,100, 30);
		b.addActionListener(this);
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
		f.add(l);
		f.add(text);
		f.add(b);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(400,400);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Coure1();
		
	}
	public void actionPerformed(ActionEvent e) {
		String url=text.getText();
		
		try {
			InetAddress i=InetAddress.getByName(url); 
			String ip=i.getHostAddress();
			JOptionPane.showConfirmDialog(b, ip);
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		
	}
}
