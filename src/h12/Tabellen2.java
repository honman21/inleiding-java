package h12;

import java.awt.*;
import java.applet.*;

public class Tabellen2 extends Applet {
    double knoppen[];
    Button knop;

    public void init() {
        knoppen = new double [25];

        for (int teller = 0; teller < knoppen.length; teller ++) {
            knoppen[teller] = 1 * teller + 1;
            knop = new Button("             " + knoppen[teller]);
            add(knop);
        }
    }

    public void paint(Graphics g) {
        }
    }

