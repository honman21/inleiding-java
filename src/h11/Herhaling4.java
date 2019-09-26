package h11;

import java.awt.*;
import java.applet.*;


public class Herhaling4 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int ant = 0;
        int teller = 0;
        int y = 0;

        while(teller < 11) {
            y += 20;
            g.drawString("3*" + teller +"= " + ant, 50, y );
            teller++;
            ant = teller*3;
        }
    }
}
