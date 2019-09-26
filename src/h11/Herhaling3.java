package h11;

import java.awt.*;
import java.applet.*;


public class Herhaling3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int opteller = 1;
        int teller = -1;
        int teller2 = 1;
        int teller3;
        int x = 0;

        while(opteller < 15) {
            opteller++;
            teller3 = teller + teller2;
            teller = teller2;
            teller2 = teller3;
            x += 25;
            g.drawString("" + teller3, x, 250 );
        }
    }
}
