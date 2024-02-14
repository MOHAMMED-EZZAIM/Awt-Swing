package Jslider;
import javax.swing.*;
public class Cours1 {
	
	public Cours1() {
		JFrame f=new JFrame();
		JSlider slide=new JSlider(JSlider.HORIZONTAL,0,100,40);	
		slide.setMinorTickSpacing(1);
		slide.setMajorTickSpacing(10);
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		
		
		JPanel p=new JPanel();
		p.add(slide);
		f.add(p);
		f.setVisible(true);
		f.setSize(500,500);
		f.pack();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Cours1();
	}
	
	
}
