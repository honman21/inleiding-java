package h05;

import java.awt.*;
import java.applet.*;

public class Variabelen extends Applet {
    Color magenta;
    Color black;
    int hoogte;
    int breedte;

    public void init() {
        magenta = Color.magenta;
        black = Color.black;
        hoogte = 100;
        breedte = 210;

    }

    public void paint(Graphics g){
        g.drawLine(20,20,231,20);
        g.drawString("Lijn",115,35);
        g.drawRect(20,40, breedte, hoogte);
        g.drawString("Rechthoek",91,155);
        g.setColor(Color.magenta);
        g.fillRect(241,40,breedte,hoogte);
        g.setColor(Color.black);
        g.drawOval(241,40,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",270, 155);
        g.drawOval(460,40,breedte,hoogte);
        g.setColor(Color.magenta);
        g.fillArc(460,40,breedte,hoogte,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",480,155);
        g.drawRoundRect(20,165,breedte,hoogte,30,20);
        g.drawString("Afgeronde rechthoek",75,280);
        g.setColor(Color.magenta);
        g.fillOval(241,165,breedte,hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",300,280);
        g.drawOval(505,165,100,hoogte);
        g.drawString("Cirkel",540,280);

    }
}

