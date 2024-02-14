package setLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class exemple1  extends JFrame{
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3,l4;
   public exemple1() {
	setTitle("hello word");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setSize(200,200);
	setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
	b1=new JButton("Exit programe b1");
	b2=new JButton("Exit programe b2");
	b3=new JButton("Exit programe b3");
	b4=new JButton("Exit programe b4");
	l1 =new JLabel("hello word l1");
	l2 =new JLabel("hello word l2");
	l3 =new JLabel("hello word l3");
	l4 =new JLabel("hello word l4");
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(l1);
	this.add(l2);
	this.add(l3);
	this.add(l4);
}
    public static void main(String[] args) {
		new exemple1();
	}
}
