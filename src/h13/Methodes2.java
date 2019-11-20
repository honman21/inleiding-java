package h13;

import java.awt.*;
import java.applet.*;

public class Methodes2 extends Applet{

    public void paint(Graphics g) {

        setSize(650, 500);

        int x, y, width, height;

        x = 50;
        y = 50;
        width = 50;
        height = 25;

        g.setColor(Color.RED);
        g.fillRect(x, 75, 400, 200);

        for (int Stenen = 0; Stenen < 4; Stenen++) {
            x = 50;
            y += 25;
            for (int MeerStenen = 0; MeerStenen < 8; MeerStenen++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, width, height);
                x += width;
            }
            x = 25;
            y += 25;
            for (int kolom = 0; kolom < 8; kolom++) {
                g.setColor(Color.WHITE);
                g.drawRect(x, y, width, height);
                x += width;
            }
        }
    }
}
