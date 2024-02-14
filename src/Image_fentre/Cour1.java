package Image_fentre;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Cour1 {

	public Cour1() {
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon img=new ImageIcon("RJ45.jpg");
		f.setIconImage(img.getImage());
	}
	public static void main(String[] args) {
		new Cour1();
	}
}
