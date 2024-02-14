package Disigne;
import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel{
	Image img;
	public MyPanel() {
		img=new ImageIcon("icons8-maroc-96.png").getImage();
	this.setBackground(Color.red);
	this.setOpaque(true);
	}
	public void paint(Graphics g) {
		this.setBounds(0, 0, 500, 500);
		Graphics2D g2D=(Graphics2D) g;
		g2D.setStroke(new BasicStroke(5));// somk
		//g2D.setPaint(Color.BLUE);//lone
	    //g2D.drawLine(0, 0, 500, 500);// rasem 5ate firstPoint (0,0) lastPoint (500,500)
		//g2D.setPaint(Color.red);
       	//g2D.drawRect(30, 30, 200, 200);//border rectangle 5awi
		//g2D.fillRect(30, 30, 200, 200); //rectangle 3amer
		
	    //g2D.drawOval(30, 30, 200, 200);
	    //g2D.fillOval(30, 30, 200, 200);
		//g2D.drawArc(30, 30, 200, 200, 0, 90);
		//g2D.setPaint(Color.red);
		//g2D.fillArc(30, 30, 200, 200, 0, 180);
		//g2D.setPaint(Color.WHITE);
		//g2D.fillArc(30, 30, 200, 200,180, 180);
		//g2D.setPaint(Color.yellow);
		//int [] xPionts= {150,250,350};
		//int [] yPionts= {300,150,300};
		//g2D.drawPolygon(xPionts, yPionts, 3);
		//g2D.fillPolygon(xPionts, yPionts, 3);
		g2D.setPaint(Color.blue);
		g2D.setFont(new  Font("Ink Free",Font.PLAIN,50));
		g2D.drawString("you are the best : D", 50, 50);
	    g2D.drawImage(img, 0, 0, null);
	}
}
