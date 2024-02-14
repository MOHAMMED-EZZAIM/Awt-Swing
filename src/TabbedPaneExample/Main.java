package TabbedPaneExample;
import java.awt.*;
import javax.swing.*;
public class Main  extends JFrame{
	JPanel p1,p2,p3;
	JButton b1,b2,b3;
	JTabbedPane t;
	public Main() {
		setSize(500,500);
		pack();
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
	
		b1=new JButton(" Cliquer ici");
		b2=new JButton(" Cliquer ici");
		b3=new JButton(" Cliquer ici");
	
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		
		 JPanel tab3 = new JPanel();
	        tab3.add(new JLabel("Contenu de l'onglet 3"));
		
		t=new JTabbedPane();
		t.setBackground(Color.blue);
		t.setSize(200,200);
		t.addTab("fenetre1", p1);
		t.addTab("fenetre2", p2);
		t.addTab("fenetre2",tab3);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().add(t);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new  Main();
	}

}
