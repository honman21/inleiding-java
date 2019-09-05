package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(50, 100, 100, 100);
        g.drawRect(55, 160, 20, 40);
        g.drawRect(100, 125, 30, 30);
        g.drawLine(50, 100, 100, 50);
        g.drawLine(100, 50, 150, 100);
    }
}