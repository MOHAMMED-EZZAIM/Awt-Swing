package FileChooserExample;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cour1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple de JFileChooser");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton openButton = new JButton("Ouvrir le fichier");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showFileChooser();
            }
        });
        frame.add(openButton);

        
        frame.setVisible(true);
    }

    private static void showFileChooser() {
        // Création d'un JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers texte (*.txt)", "txt");
        fileChooser.setFileFilter(filter);

        // Affichage de la boîte de dialogue de sélection de fichiers
        int result = fileChooser.showOpenDialog(null);

        // Traitement du résultat de la sélection
        if (result == JFileChooser.APPROVE_OPTION) {
            // L'utilisateur a sélectionné un fichier
            System.out.println("Fichier sélectionné : " + fileChooser.getSelectedFile().getAbsolutePath());
        } else if (result == JFileChooser.CANCEL_OPTION) {
            // L'utilisateur a annulé la sélection
            System.out.println("Sélection annulée.");
        }
    }
}
