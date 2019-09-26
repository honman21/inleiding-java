package h11;

import java.awt.*;
import java.applet.*;


public class Herhaling2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setSize(400,300);
        int teller = 20;
        int x = 0;

        while(teller > 9) {
            x += 20;
            g.drawString("" + teller, x, 270 );
            teller--;
        }
    }
}