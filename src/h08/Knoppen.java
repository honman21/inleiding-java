package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knoppen extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop;
    String schermtekst;


    public void init() {
        tekstvak = new TextField("", 15);
        label = new Label("Type iets in het tekstvakje");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        s = "";

        //knoppen
        knop = new Button("Ok");
        knopListener kl = new knopListener();
        knop.addActionListener( kl );
        add(knop);

        knop = new Button("Reset");
        resetListener rl = new resetListener();
        knop.addActionListener(rl);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();

        }
    }

    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            s = tekstvak.getText();
            repaint();
        }
    }
}