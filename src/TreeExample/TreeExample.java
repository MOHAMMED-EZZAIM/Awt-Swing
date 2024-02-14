package TreeExample;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple de JTree");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Racine");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Noeud 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Noeud 2");
        DefaultMutableTreeNode node11 = new DefaultMutableTreeNode("Noeud 1");
        DefaultMutableTreeNode node22 = new DefaultMutableTreeNode("Noeud 2");
        
        node1.add(node11);
        node2.add(node22);
        root.add(node1);
        root.add(node2);
       
        JTree tree = new JTree(root);
        frame.add(tree);
        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
