package eu.cefim.java.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

// Swing; exemple: IntelliJ IDEA a été fait avec ça !
public class MaFenetre extends JFrame {
    public MaFenetre() {
        setTitle("Ma fenêtre");
        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton exitButton = new JButton("Quitter");
        exitButton.addActionListener(e -> System.exit(0));
        add(exitButton);
        exitButton.setMnemonic(KeyEvent.VK_Q);
        exitButton.setBounds(130, 100, 130, 80);
        setLayout(null);
        ImageIcon icon = new ImageIcon("src/main/resources/icon.png");

        // Ajouter des libelles
        JLabel label = new JLabel("Hello World");
        label.setBounds(130, 200, 100, 40);
        add(label);

        JLabel label1 = new JLabel("Fill free to ask anything !");
        label1.setBounds(140, 250, 120, 50);
        add(label1);

        // Ajout de couleur
        final Color pink = new Color(68, 84, 255);
        label.setOpaque(true);
        label.setBackground(pink);
        label.setMinimumSize(new Dimension(100, 40));

        final Color autre = new Color(52, 255, 108);
        label1.setOpaque(true);
        label1.setBackground(autre);
        label1.setMinimumSize(new Dimension(100, 40));

        // Layouts: faciliter la mise en page en établissant quelques règles
        JPanel pane = (JPanel) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setHorizontalGroup(gl.createParallelGroup()
                .addGroup(gl.createSequentialGroup()
                        .addComponent(exitButton)
                        .addComponent(label)
                        .addComponent(label1)
                )
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup()
                        .addComponent(exitButton)
                        .addComponent(label)
                        .addComponent(label1)
                )
        );

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        pack();
    }
}
