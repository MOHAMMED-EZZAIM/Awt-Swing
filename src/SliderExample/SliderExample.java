package SliderExample;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple de JSlider");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // Création d'un JSlider avec une plage de valeurs de 0 à 100
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Ajout d'un écouteur de changement pour réagir aux modifications de la valeur du JSlider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                System.out.println("Valeur du curseur : " + value);
            }
        });

        panel.add(slider);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
