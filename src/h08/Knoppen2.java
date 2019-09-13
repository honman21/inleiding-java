package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Knoppen2 extends Applet {
    Button knop;
    TextField tekstvak;
    String schermtekst;
    int totaal;
    int mannen;
    int vrouwen;
    int potVrouwen;
    int potMannen;


    public void init() {

        mannen = 0;
        vrouwen = 0;
        potMannen = 0;
        potVrouwen = 0;

        //knoppen
        knop = new Button("Man");
        manListener mL = new manListener();
        knop.addActionListener(mL);
        add(knop);

        knop = new Button("Vrouw");
        vrouwListener vL = new vrouwListener();
        knop.addActionListener(vL);
        add(knop);

        knop = new Button("Pot. Man");
        potMListener potML = new potMListener();
        knop.addActionListener(potML);
        add(knop);

        knop = new Button("Pot. Vrouw");
        potVListener potVL = new potVListener();
        knop.addActionListener(potVL);
        add(knop);
    }

    public void paint(Graphics g) {
        totaal = mannen + vrouwen + potVrouwen + potMannen;
        g.drawString("Aantal mannen:                         " + mannen,20,60);
        g.drawString("Aantal vrouwen:                         " + vrouwen,20,80);
        g.drawString("Aantal potentiële mannen:      " + potMannen, 20,100);
        g.drawString("Aantal potentiële vrouwen:      " + potVrouwen, 20,120);
        g.drawString("Totaal mannen en vrouwen:   " + totaal,20,150);

    }

    class manListener implements ActionListener  {
        public void actionPerformed(ActionEvent e ) {
            mannen++;
            repaint();
        }
    }
    class vrouwListener implements ActionListener  {
        public void actionPerformed(ActionEvent e ) {
            vrouwen++;
            repaint();
        }
    }
    class potMListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potMannen++;
            repaint();
        }
    }
     class potVListener implements ActionListener {
         public void actionPerformed(ActionEvent e) {
             potVrouwen++;
             repaint();
         }
     }
}





