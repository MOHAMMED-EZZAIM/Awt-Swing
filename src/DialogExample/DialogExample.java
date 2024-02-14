package DialogExample;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("Exemple de JDialog");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'un bouton pour ouvrir le JDialog
        JButton openDialogButton = new JButton("Ouvrir la boîte de dialogue");
        openDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog(frame);
            }
        });

        // Ajout du bouton à la fenêtre
        frame.getContentPane().add(openDialogButton);

        // Affichage de la fenêtre
        frame.setVisible(true);
    }

    private static void showDialog(JFrame parentFrame) {
        // Création d'un JDialog avec le parent, le titre et la modalité
        JDialog dialog = new JDialog(parentFrame, "Boîte de dialogue", true);

        // Création de composants pour le JDialog
        JLabel label = new JLabel("Ceci est une boîte de dialogue modale.");
        JButton closeButton = new JButton("Fermer");

        // Ajout d'un écouteur pour fermer le JDialog lorsque le bouton est cliqué
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        // Création d'un JPanel pour le contenu du JDialog
        JPanel dialogPanel = new JPanel();
        dialogPanel.add(label);
        dialogPanel.add(closeButton);

        // Ajout du JPanel au JDialog
        dialog.getContentPane().add(dialogPanel);

        // Configuration de la taille du JDialog
        dialog.setSize(300, 150);

        // Positionnement au centre de la fenêtre parente
        dialog.setLocationRelativeTo(parentFrame);

        // Rendre le JDialog visible
        dialog.setVisible(true);
    }
}
