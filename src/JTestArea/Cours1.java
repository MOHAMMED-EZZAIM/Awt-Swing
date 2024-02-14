package JTestArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JFrame;

public class Cours1 {
	Cours1(){
		TextArea area;
		JFrame frame;
		Font font;
		font=new Font("verdana",Font.BOLD,16);
		frame=new JFrame();
		area=new TextArea("hello",200,300,TextArea.SCROLLBARS_BOTH);
		area.setFont(font);
		area.setBounds(0,0, 1300, 500);
		area.setBackground(Color.darkGray);
		area.setForeground(Color.ORANGE);
		frame.add(area);
		frame.setSize(700,700);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Cours1();
	}

}
