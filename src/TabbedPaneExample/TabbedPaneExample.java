package TabbedPaneExample;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
public class TabbedPaneExample {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame frame = new JFrame("Exemple de JTabbedPane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création d'un JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Création de trois onglets avec des composants différents
        JPanel tab1 = new JPanel();
        tab1.add(new JLabel("Contenu de l'onglet 1"));
        
        JPanel tab2 = new JPanel();
        tab2.add(new JButton("Clic ici !"));

        JPanel tab3 = new JPanel();
        tab3.add(new JLabel("Contenu de l'onglet 3"));

        // Ajout des onglets au JTabbedPane
        tabbedPane.addTab("Onglet 1", tab1);
        tabbedPane.addTab("Onglet 2",tab2);
        tabbedPane.addTab("Onglet 3",tab3);

        // Ajout du JTabbedPane à la fenêtre principale
        frame.getContentPane().add(tabbedPane);

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
