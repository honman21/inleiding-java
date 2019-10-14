package Challenge;

import java.applet.Applet;
import java.awt.*;

public class Kunstwerk extends Applet {


    public void init() {
        setSize(400, 400);


    }


    public void paint(Graphics g) {
        g.drawLine(20,40,380,40);
        g.drawLine(100,20,100,40);
        g.drawLine(250,15,250,370);
        g.drawLine(380,20,380,375);
        g.drawLine(150,300,150,375);
        g.drawLine(55,40,55,370);
        g.setColor(Color.red);
        g.fillRect(57,42,190,190);


    }
}
