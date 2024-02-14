package ToolBarExample;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolBarExample {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("Exemple de JToolBar");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'une barre d'outils
        JToolBar toolBar = new JToolBar();

        // Ajout de boutons à la barre d'outils
        JButton newButton = new JButton("Nouveau");
        JButton openButton = new JButton("Ouvrir");
        JButton saveButton = new JButton("Enregistrer");

        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);

        // Ajout de la barre d'outils à la fenêtre principale
        frame.add(toolBar);

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
