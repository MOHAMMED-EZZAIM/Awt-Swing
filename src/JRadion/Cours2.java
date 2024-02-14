package JRadion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
public class Cours2 extends JFrame implements ActionListener {
	JRadioButton r1;
	JRadioButton r2;
	JButton btn;
	Cours2(){
		r1=new JRadioButton("Appele");
		r2=new JRadioButton("Orange");
		r1.setBounds(110, 60, 100, 50);
		r2.setBounds(110, 100, 120, 50);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		btn=new JButton("Submit");
		btn.setBounds(100, 160, 90, 40);
		btn.addActionListener(this);
		add(r1);
		add(r2);
		add(btn);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {	
		if(r1.isSelected()) {
			JOptionPane.showMessageDialog(r1, "You select Appele !");
		}
		else if(r2.isSelected()) {
			JOptionPane.showMessageDialog(r2, "You select Orange!");
		}
		else {
			JOptionPane.showConfirmDialog(null, "select un choix!");
		}
		 
	}
	public static void main(String[] args) {
		new Cours2();
	}

	

}
