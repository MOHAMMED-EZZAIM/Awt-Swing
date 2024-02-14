package Menu;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class M1 extends JFrame {
	public M1() {
		JMenuBar bar=new JMenuBar();
		JMenu menu1=new JMenu("Dossier");
		JMenuItem item1=new JMenuItem("Ovrire");
		JMenuItem item2=new JMenuItem("Supprimer");
		JMenuItem item3=new JMenuItem("Modifier");
		JMenuItem item4=new JMenuItem("Quitter");
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		bar.setBackground(Color.blue);
		bar.add(menu1);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
		setSize(500,500);
		setJMenuBar(bar);
		pack();	
	}
	public static void main(String[] args) {
		new M1();
	}

}
