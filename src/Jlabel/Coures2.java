package Jlabel;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Coures2 {

	JFrame f;
	JLabel lab;
	public Coures2() {
		f=new  JFrame();
		f.setLayout(new FlowLayout());
	    String s="<html> mohammed <br> ezzaim    <form >\r\n"
	    		+ "\r\n"
	    		+ "        	<h1>Bienvenu dans la page de connexion:</h1>\r\n"
	    		+ "\r\n"
	    		+ "\r\n"
	    		+ "        		<input type=\"text\" name=\"nom\" placeholder=\"Votre Nom\"><br><br>\r\n"
	    		+ "        		<input type=\"text\" name=\"prenom\" placeholder=\"Votre Prenom\"><br><br>\r\n"
	    		+ "\r\n"
	    		+ "        		<input type=\"text\" name=\"email\" placeholder=\"Votre Email\" ><br><br>       	\r\n"
	    		+ "\r\n"
	    		+ "        	    <input type=\"password\" name=\"password\" placeholder=\"Votre Mot de passe\" ><br><br>        	\r\n"
	    		+ "\r\n"
	    		+ "        		<input type=\"checkbox\" name=\"check\" id=\"check\">\r\n"
	    		+ "        		<label for=\"check\">se souvenir de moi</label><br><br>\r\n"
	    		+ "\r\n"
	    		+ "\r\n"
	    		+ "                <td align=\"center\"><br><input type=\"submit\" value=\"Se Connecter\">\r\n"
	    		+ "\r\n"
	    		+ "\r\n"
	    		+ "        </form></html>";
		lab=new JLabel(s);
		f.add(lab);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(500,500);
	}
	public static void main(String[] args) {
		new Coures2();
	}

}
