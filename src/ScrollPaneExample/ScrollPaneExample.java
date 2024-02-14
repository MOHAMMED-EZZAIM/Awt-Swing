package ScrollPaneExample;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple de JScrollPane");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea(
            "Ceci est un exemple de JTextArea dans un JScrollPane.\n" +
            "La JScrollPane ajoutera des barres de défilement si nécessaire."
        );
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
