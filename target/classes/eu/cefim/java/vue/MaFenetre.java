package eu.cefim.java.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
// Swing: exemple: IntelliJ a été fait avec ça !
public class MaFenetre extends JFrame {
    public MaFenetre(){
        setTitle("Ma fenêtre");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton exitButton = new JButton("Quitter");
        exitButton.addActionListener(e -> System.exit(0));
        add(exitButton);
        exitButton.setMnemonic(KeyEvent.VK_Q);
        exitButton.setBounds(130, 100, 100, 40);
        setLayout(null);
        ImageIcon icon = new ImageIcon("src/main/resources/icon.png");

        // Ajouter des libelles
        JLabel label = new JLabel("Hello World");
        label.setBounds(130, 200, 100, 40);
        add(label);

        // Ajout de couleur
        public static final Color pink = new Color(78, 255, 108);
        label.setOpaque(true);
        label.setBackground(pink);
        label.setMinimumSize(new Dimension(100, 40));

    }
}
