package Challenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Staafdiagram extends Applet {
    int Valerie;
    int Jeroen;
    int Hans;
    Button knop;
    int hoogteXas = 400;
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    Label Valerie2;
    Label Jeroen2;
    Label Hans2;


    public void init() {
        setSize(700,500);



        tekstvak = new TextField("",5);
        Valerie2 = new Label("Valerie");
        tekstvak2 = new TextField("",5);
        Jeroen2 = new Label("Jeroen");
        tekstvak3 = new TextField("",5);
        Hans2 = new Label("Hans");
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add(Valerie2);
        add(tekstvak);
        add(Jeroen2);
        add(tekstvak2);
        add(Hans2);
        add(tekstvak3);
        add(knop);



    }

    public void paint(Graphics g) {

        //lijnen
        g.drawLine(40,40,40,400);
        g.drawLine(40,40,300,40);
        g.drawLine(40,100,300,100);
        g.drawLine(40,160,300,160);
        g.drawLine(40,220,300,220);
        g.drawLine(40,280,300,280);
        g.drawLine(40,340,300,340);
        g.drawLine(40,400,300,400);

        //staven
        g.setColor(Color.red);
        g.fillRect(60,hoogteXas-Valerie,50,Valerie);
        g.setColor(Color.blue);
        g.fillRect(130,hoogteXas-Jeroen,50,Jeroen);
        g.setColor(Color.orange);
        g.fillRect(200,hoogteXas-Hans,50,Hans);

        //eenheden
        g.setColor(Color.black);
        g.drawString("20KG ",5,350);
        g.drawString("40KG ",5,290);
        g.drawString("60KG ",5,230);
        g.drawString("80KG ",5,170);
        g.drawString("100KG",2,110);
        g.drawString("120KG",2,50);

        //namen
        g.drawString("Valerie",65,410);
        g.drawString("Jeroen",135,410);
        g.drawString("Hans",205,410);

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Valerie = Integer.parseInt(tekstvak.getText());
            Jeroen = Integer.parseInt(tekstvak2.getText());
            Hans = Integer.parseInt(tekstvak3.getText());
            Valerie*=3;
            Jeroen*=3;
            Hans*=3;
            repaint();

        }
    }
}
