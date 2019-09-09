package h05;

import java.awt.*;
import java.applet.*;

public class Variabelen2 extends Applet {
    int gewichtValerie;
    int hoogteXas;
    int gewichtJeroen;
    int gewichtHans;



    public void init() {
        setSize(400,400);
        //*2 NIET weghalen
        gewichtValerie = 40*2;
        gewichtJeroen = 100*2;
        gewichtHans = 80*2;
        hoogteXas = 340;
    }

    public void paint(Graphics g) {
        //strepen
        g.drawLine(68,140,68,hoogteXas);
        g.drawLine(68,140,230,140);
        g.drawLine(230,hoogteXas,230,140);
        g.drawLine(230,hoogteXas,68,hoogteXas);
        g.drawLine(68,300,230,300);
        g.drawLine(68,260,230,260);
        g.drawLine(68,220,230,220);
        g.drawLine(68,180,230,180);

        //staven
          //Valerie
        g.setColor(Color.pink);
        g.fillRect(80, hoogteXas - gewichtValerie, 40, gewichtValerie);
        //Jeroen
        g.setColor(Color.blue);
        g.fillRect(130, hoogteXas-gewichtJeroen, 40, gewichtJeroen);
        //Hans
        g.setColor(Color.cyan);
        g.fillRect(180, hoogteXas-gewichtHans, 40, gewichtHans);

        //namen
        g.setColor(Color.black);
        g.drawString("Valerie", 80, 350);
        g.setColor(Color.black);
        g.drawString("Jeroen", 130, 350);
        g.setColor(Color.black);
        g.drawString("Hans", 180, 350);
        g.setColor(Color.black);


        //kg
        g.drawString("20KG", 30, 300);
        g.setColor(Color.black);
        g.drawString("40KG", 30, 260);
        g.setColor(Color.black);
        g.drawString("60KG", 30, 220);
        g.setColor(Color.black);
        g.drawString("80KG", 30, 180);
        g.setColor(Color.black);
        g.drawString("100KG", 30, 140);




    }
}

