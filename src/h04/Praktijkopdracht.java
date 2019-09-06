package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        g.drawLine(20,20,231,20);
        g.drawString("Lijn",115,35);
        g.drawRect(20,40, 210, 100);
        g.drawString("Rechthoek",91,155);
        g.setColor(Color.magenta);
        g.fillRect(241,40,210,100);
        g.setColor(Color.black);
        g.drawOval(241,40,210,100);
        g.drawString("Gevulde rechthoek met ovaal",270, 155);
        g.drawOval(460,40,210,100);
        g.setColor(Color.magenta);
        g.fillArc(460,40,210,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",480,155);
        g.drawRoundRect(20,165,210,100,30,20);
        g.drawString("Afgeronde rechthoek",75,280);
        g.setColor(Color.magenta);
        g.fillOval(241,165,210,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",300,280);
        g.drawOval(505,165,100,100);
        g.drawString("Cirkel",540,280);

    }
}
