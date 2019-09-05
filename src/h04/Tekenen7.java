package h04;

import java.applet.Applet;
import java.awt.*;

public class Tekenen7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
       g.drawRoundRect(20,20,100,100,10,10);
       g.fillOval(30,30,30,30);
        g.fillOval(80,30,30,30);
        g.fillOval(30,80,30,30);
        g.fillOval(80,80,30,30);
    }

}
