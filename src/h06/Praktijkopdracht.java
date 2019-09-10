package h06;

import java.awt.*;
import java.applet.*;


public class Praktijkopdracht extends Applet {
    double A;
    double B;
    double C;

    double uitkomst;



    public void init() {
        A = 5.9;
        B = 6.3;
        C = 6.9;

        uitkomst = (A+B+C) / 3;
        uitkomst *= 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + uitkomst, 20, 20);
    }
}





