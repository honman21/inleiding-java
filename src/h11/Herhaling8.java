package h11;

import java.awt.*;
import java.applet.*;


public class Herhaling8 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setSize(1000,1000);
        int teller = 0;
        int y = 0;
        int x = 0;

        while(teller < 100) {
            y += 10;
            x += 10;
            g.drawOval(20,20,x,y);
            teller++;


        }
    }
}
