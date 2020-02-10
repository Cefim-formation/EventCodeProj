package eu.cefim.java.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

   /*
    Concevez une application graphique avec une fenêtre, 1 label et 2 boutons :
    le label doit afficher un compteur initialisé à 0
    le 1er bouton doit incrémenter cette valeur de 1 instantanément
    le 2e bouton doit patienter 3 secondes (pour simuler une opération longue puis incrémenter le compteur de 1)
    Testez votre application en alternant l'usage des 2 boutons, que remarquez-vous ?
    */
   /*
   Creer un nouveau thread pour eviter que le bouton addOne n'attende pas le bouton addOneWait
   ie, rendre les boutons independants
    */

   /////////////////////////////////////////////////////////////////////////
   public class AppliGraph1 extends JFrame {
       int compteur;
       public AppliGraph1() {
           setTitle("Thread test");
           setMinimumSize(new Dimension(600, 600));
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           JLabel compteurLabel = new JLabel(String.valueOf(compteur));
           JButton addOne = new JButton("+1");
           addOne.addActionListener(e -> compteurLabel.setText(String.valueOf(++compteur)));
           JButton addOneWait = new JButton("+1 (3sec)");
           addOneWait.addActionListener(e -> {
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException ex) {
                   //ex.printStackTrace();
               }
               compteurLabel.setText(String.valueOf(++compteur));
           });
           JPanel pane = (JPanel) getContentPane();
           GroupLayout gl = new GroupLayout(pane);
           pane.setLayout(gl);
           gl.setAutoCreateContainerGaps(true);
           gl.setAutoCreateGaps(true);
           gl.setHorizontalGroup(gl.createParallelGroup()
                   .addGroup(gl.createSequentialGroup()
                           .addComponent(compteurLabel)
                           .addComponent(addOne)
                           .addComponent(addOneWait)
                   )
           );
           gl.setVerticalGroup(gl.createSequentialGroup()
                   .addGroup(gl.createParallelGroup()
                           .addComponent(compteurLabel)
                           .addComponent(addOne)
                           .addComponent(addOneWait)
                   )
           );
       }
}
