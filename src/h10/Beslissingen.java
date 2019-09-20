package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Beslissingen extends Applet {

    TextField tekstvak;
    Label label;
    int tekst;
    int getal;

    public void init() {
        tekstvak = new TextField("",7);
        tekstvak.addActionListener((new vakListener()));
        label = new Label("Voer een getal in: ");
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("Grootste getal: " + tekst,40,70);

    }

    class vakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > tekst) {
                tekst = getal;
                repaint();
            }
        }
    }
}