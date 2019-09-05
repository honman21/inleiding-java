package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(20,30,100,200,10,20);
        g.setColor(Color.red);
        g.fillOval(40, 40, 60, 60);
        g.setColor(Color.orange);
        g.fillOval(40,100,60,60);
        g.setColor(Color.green);
        g.fillOval(40,160,60,60);
        g.setColor(Color.darkGray);
        g.fillRect(55,220,30,60);
    }
}
