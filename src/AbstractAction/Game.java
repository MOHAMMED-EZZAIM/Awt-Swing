package AbstractAction;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Game {
	JFrame f;
	JLabel l;
	Action UpAction;
	Action DowAction;
	Action RigthAction;
	Action LeftAction;
	public Game() {
		f=new JFrame("KeyBinding Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setLayout(null);
		l=new JLabel();
		l.setBackground(Color.red);
		l.setBounds(100, 100, 100, 100);
		l.setOpaque(true);
		
		UpAction=new UpAction();
		DowAction=new DowAction();
		RigthAction=new RigthAction();
		LeftAction=new LeftAction();
		l.getInputMap().put(KeyStroke.getKeyStroke("N"),"ezzim1");
		l.getActionMap().put("ezzim1", UpAction);
		
		l.getInputMap().put(KeyStroke.getKeyStroke("B"), "ezzim2");
		l.getActionMap().put("ezzim2", DowAction);
		
		l.getInputMap().put(KeyStroke.getKeyStroke("R"), "ezzim3");
		l.getActionMap().put("ezzim3", RigthAction);
		
		l.getInputMap().put(KeyStroke.getKeyStroke("L"), "ezzim4");
		l.getActionMap().put("ezzim4", LeftAction);
		f.add(l);
		f.setVisible(true);
		
	}
	
	
		public class  UpAction extends AbstractAction{	
			public void actionPerformed(ActionEvent e) {
				l.setLocation(l.getX(), l.getY()-10);}}
		
		public class  DowAction extends AbstractAction{
			public void actionPerformed(ActionEvent e) {
				l.setLocation(l.getX(), l.getY()+10);}}
		
		public class  RigthAction extends AbstractAction{
			public void actionPerformed(ActionEvent e) {
				l.setLocation(l.getX()+10, l.getY());}}
		
		public class  LeftAction extends AbstractAction{
			public void actionPerformed(ActionEvent e) {
				l.setLocation(l.getX()-10, l.getY());}}
	}


