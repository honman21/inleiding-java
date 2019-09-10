package h06;

import java.awt.*;
import java.applet.*;


public class Getallen2 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int uitkomst1;
    int uitkomst2;
    int uitkomst3;
    int uitkomst4;

    public void init() {
        a = 60;
        b = 24;
        c = 365;
        d = 3600;
        e = 86400;
        uitkomst1 = a*=1;
        uitkomst2 = a*=a;
        uitkomst3 = d*=b;
        uitkomst4 = e*=c;


    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden",70,20);
        g.drawString("1 minuut heeft: " + uitkomst1, 20, 50);
        g.drawString("1 uur heeft: "+ uitkomst2,20,70);
        g.drawString("1 dag heeft: "+uitkomst3,20,90);
        g.drawString("1 jaar heeft: "+uitkomst4,20,110);
    }
}