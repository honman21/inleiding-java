package h11;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijkopdacht extends Applet {
    Button knop;
    TextField tv;
    int getal;
    String tekst;

    public void init() {
        tv = new TextField("",5);
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add(tv);
        add(knop);
    }


    public void paint(Graphics g) {
        int ant = 0;
        int teller = 1;
        int y = 0;


        while (teller < 11) {
            y += 20;
            ant = teller * getal;
            g.drawString(getal + "* " + teller + "= " + ant, 50, y);
            teller++;


        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tv.getText();
            getal = Integer.parseInt(tekst);
            repaint();
        }
    }
}

