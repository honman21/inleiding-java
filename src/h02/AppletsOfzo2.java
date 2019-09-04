package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class AppletsOfzo2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.WHITE);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Honman", 50, 60);
        g.setColor(Color.RED);
        g.drawString("Deong", 50, 70);
    }
}