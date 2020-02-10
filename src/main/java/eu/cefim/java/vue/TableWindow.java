package eu.cefim.java.vue;

import javax.swing.*;
import java.awt.*;

    public class TableWindow extends JFrame {
        public TableWindow() {
            setTitle("JTable");
            setMinimumSize(new Dimension(600, 600));
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            String[] columnNames = {
                    "Nom",
                    "Prénom",
                    "Age",
                    "Sexe",
                    "Adhésion"
            };
            Object[][] data = {
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
                    {"Holden", "James", 20, "M", true},
                    {"Bond", "James", 40, "M", false},
                    {"Cotillard", "Marion", 30, "F", true},
                    {"Marceau", "Sophie", 40, "F", false},
            };
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            table.setFillsViewportHeight(true);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            JPanel pane = (JPanel) getContentPane();
            GroupLayout gl = new GroupLayout(pane);
            pane.setLayout(gl);
            gl.setAutoCreateContainerGaps(true);
            gl.setAutoCreateGaps(true);
            gl.setHorizontalGroup(gl.createParallelGroup()
                    .addGroup(gl.createSequentialGroup()
                            .addComponent(scrollPane)
                    )
            );
            gl.setVerticalGroup(gl.createSequentialGroup()
                    .addGroup(gl.createParallelGroup()
                            .addComponent(scrollPane)
                    )
            );
            pack();
        }
    }
