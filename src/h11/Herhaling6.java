package h11;

import java.awt.*;
import java.applet.*;


public class Herhaling6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;
        int x = 0;
        int lengte = 50;

        while(teller < 5) {
            y += 5;
            x += 5;
            g.drawOval(x,y,lengte,lengte);
            lengte-=10;
            teller++;


        }
    }
}