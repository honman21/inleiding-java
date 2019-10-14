package Challenge;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Horeca extends Applet {
    Button knop;
    double totaal2;
    double totaal;
    double Fris;
    double Bier;
    double Wijn;
    double Koffie;
    double Binngedist;
    double Buitgedist;


    public void init() {
        Fris = 2.25;
        Bier = 2.50;
        Wijn = 2.75;
        Koffie = 2;
        Binngedist = 3;
        Buitgedist = 3.75;

        //knoppen
        knop = new Button("Fris");
        frisListener fL = new frisListener();
        knop.addActionListener(fL);
        add(knop);

        knop = new Button("Bier");
        bierListener bL = new bierListener();
        knop.addActionListener(bL);
        add(knop);

        knop = new Button("Wijn");
        wijnListener wL = new wijnListener();
        knop.addActionListener(wL);
        add(knop);

        knop = new Button("Koffie");
        koffieListener kL = new koffieListener();
        knop.addActionListener(kL);
        add(knop);

        knop = new Button("Binn. gedist.");
        binListener biL = new binListener();
        knop.addActionListener(biL);
        add(knop);

        knop = new Button("Buit. gedist.");
        buitListener buL = new buitListener();
        knop.addActionListener(buL);
        add(knop);

        knop = new Button("Nieuwe bestelling");
        resetListener rL = new resetListener();
        knop.addActionListener(rL);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Bestelling totaal: " + totaal2,20,80);
        g.drawString("Totaal dagomzet: "+totaal,20,90);

    }

    class frisListener implements ActionListener  {
        public void actionPerformed(ActionEvent e ) {
           totaal+=Fris;
            totaal2+=Fris;
            repaint();
        }
    }
    class bierListener implements ActionListener  {
        public void actionPerformed(ActionEvent e ) {
            totaal+=Bier;
            totaal2+=Bier;
            repaint();
        }
    }
    class wijnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=Wijn;
            totaal2+=Wijn;
            repaint();
        }
    }
    class koffieListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=Koffie;;
            totaal2+=Koffie;
            repaint();
        }
    }
    class binListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=Binngedist;
            totaal2+=Binngedist;
            repaint();
        }
    }
    class buitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal+=Buitgedist;
            totaal2+=Buitgedist;
            repaint();
        }
    }
    class resetListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            totaal2 = 0;
            repaint();
        }
    }
}






