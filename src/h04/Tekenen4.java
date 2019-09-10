package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen4 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        //strepen
        g.drawLine(68,140,68,340);
        g.drawLine(68,140,230,140);
        g.drawLine(230,340,230,140);
        g.drawLine(230,340,68,340);
        g.drawLine(68,300,230,300);
        g.drawLine(68,260,230,260);
        g.drawLine(68,220,230,220);
        g.drawLine(68,180,230,180);

        //staven
        g.setColor(Color.pink);
        g.fillRect(80, 260, 40, 80);
        g.setColor(Color.blue);
        g.fillRect(130, 140, 40, 200);
        g.setColor(Color.cyan);
        g.fillRect(180, 180, 40, 160);

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
