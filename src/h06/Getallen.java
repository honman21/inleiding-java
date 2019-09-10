package h06;

import java.awt.*;
import java.applet.*;


public class Getallen extends Applet {
    int teller;
    int uitkomst;

    public void init() {
        teller  = (int) 28.25;
        uitkomst = (teller*4);
        uitkomst++;
    }

    public void paint(Graphics g) {
        g.drawString("Totale bedrag verdiend in euro's: " + uitkomst, 20, 20);;
        g.drawString("Jan krijgt: "+ teller,20,40);
        g.drawString("Ali krijgt: "+ teller,20,60);
        g.drawString("Jeannette krijgt: "+teller,20,80);
        g.drawString("Honman krijgt: "+teller,20,100);


    }

}
