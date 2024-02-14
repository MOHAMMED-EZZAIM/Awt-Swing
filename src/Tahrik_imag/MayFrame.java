package Tahrik_imag;
import javax.swing.*;
public class MayFrame extends JFrame{
	DragPanel dragpanel=new DragPanel();
	public MayFrame() {
		this.add(dragpanel);
		this.setTitle("Drag&Drop");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
