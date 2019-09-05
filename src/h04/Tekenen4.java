package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(80, 130, 40, 40);
        g.setColor(Color.blue);
        g.fillRect(120, 70, 40, 100);
        g.setColor(Color.cyan);
        g.fillRect(160, 90, 40, 80);
        g.setColor(Color.black);
        g.drawString("Valerie", 80, 180);
        g.setColor(Color.black);
        g.drawString("Jeroen", 120, 180);
        g.setColor(Color.black);
        g.drawString("Hans", 160, 180);
        g.setColor(Color.black);
        g.drawString("20KG", 30, 160);
        g.setColor(Color.black);
        g.drawString("40KG", 30, 140);
        g.setColor(Color.black);
        g.drawString("60KG", 30, 120);
        g.setColor(Color.black);
        g.drawString("80KG", 30, 100);
        g.setColor(Color.black);
        g.drawString("100KG", 30, 80);




    }
}
