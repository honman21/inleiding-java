package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(20, 20, 100, 25);
        g.setColor(Color.white);
        g.fillRect(20, 45, 100, 25);
        g.setColor(Color.blue);
        g.fillRect(20, 70, 100, 25);

    }
}
