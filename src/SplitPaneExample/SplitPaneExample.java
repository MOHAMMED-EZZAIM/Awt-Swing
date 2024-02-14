package SplitPaneExample;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class SplitPaneExample {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("Exemple de JSplitPane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création de deux panneaux avec des composants différents
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        // Ajout de composants aux panneaux (par exemple, JTextArea)
        JTextArea leftTextArea = new JTextArea("Panneau de gauche");
        JTextArea rightTextArea = new JTextArea("Panneau de droite");

        leftPanel.add(leftTextArea);
        rightPanel.add(rightTextArea);

        // Création d'un JSplitPane avec les panneaux gauche et droit
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);

        // Configuration des propriétés du JSplitPane
        splitPane.setOneTouchExpandable(true); // Permet l'expansion d'un panneau en un clic

        // Ajout du JSplitPane à la fenêtre principale
        frame.getContentPane().add(splitPane);

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
