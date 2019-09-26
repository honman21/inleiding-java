package h11;

import java.awt.*;
import java.applet.*;


public class Herhaling9 extends Applet {

    public void init() {
    }

    int y;
    int x;
    int breedte = 20;
    int hoogte = 20;

    public void paint(Graphics g) {
        y = 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, 20, 20);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 20, 20);

            }
            x += 20;
        }

        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += 20;
        }

        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += 20;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += 20;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += 20;
            g.drawRect(50,50,160,160);
        }
    }
}
