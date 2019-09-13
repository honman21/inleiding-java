package h08;

import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;

public class Knoppen3 extends Applet {
    TextField tekstvak;
    Button knop;
    double btw;
    double bedrag;
    Label label;


    public void init() {
        setSize(400,100);
        label = new Label("Voer een bedrag in");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstListener());
        add(tekstvak);
        add(label);
        btw = 1.21;

        //knop
        Button knop = new Button("Ok");
        knop.addActionListener(new TekstListener());
        add(knop);
    }


    public void paint(Graphics g) {
        g.drawString("Bedrag met 21% BTW: €" + bedrag*btw,20,80 );


    }

    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            bedrag = Double.parseDouble(s);
            repaint();
        }
    }




}


