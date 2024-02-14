package Menu;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple de Menu");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Fichier");

        // Ajout d'éléments au menu Fichier
        JMenuItem newItem = new JMenuItem("Nouveau");
        JMenuItem openItem = new JMenuItem("Ouvrir");
        JMenuItem saveItem = new JMenuItem("Enregistrer");
        JMenuItem exitItem = new JMenuItem("Quitter");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
