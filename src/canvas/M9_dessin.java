package canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import AutreExercice.M9_dessin;
import AutreExercice.canv;


public class M9_dessin extends JFrame{
	JFrame f;
	M9_dessin(){
		 f=new JFrame("canvas Exemple");
		 f.add(new canv());
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new M9_dessin();
	}
}
class canv extends Canvas{
	public canv() {
		setBackground(Color.WHITE);
		setSize(300,300);
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(30, 30, 100, 100);
		
		
	}
}
