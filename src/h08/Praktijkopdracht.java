package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    TextField Tekstvak;
    double getal;


    public void init() {

        setSize(400,121);

        //knoppen
        Button knopP = new Button("+");
        knopPListener PL = new knopPListener();
        knopP.addActionListener(PL);
        add(knopP);

        Button knopM = new Button("-");
        knopMListener ML = new knopMListener();
        knopM.addActionListener(ML);
        add(knopM);

        Button knopK = new Button("*");
        knopKListener KL = new knopKListener();
        knopK.addActionListener(KL);
        add(knopK);

        Button knopD = new Button("/");
        knopDListener DL = new knopDListener();
        knopD.addActionListener(DL);
        add(knopD);

        //vakken
        tekstvak = new TextField("",10);
        add(tekstvak);
        Tekstvak = new TextField("",10);
        add(Tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("",20,80);

    }

    class knopPListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2  = Double.parseDouble(Tekstvak.getText());
            getal = (vak1+vak2);
            tekstvak.setText(""+getal);
            Tekstvak.setText("");
            repaint();

        }

    }

    class knopMListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2  = Double.parseDouble(Tekstvak.getText());
            getal = (vak1-vak2);
            tekstvak.setText(""+getal);
            Tekstvak.setText("");
            repaint();

        }
    }

    class knopKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2  = Double.parseDouble(Tekstvak.getText());
            getal = (vak1*vak2);
            tekstvak.setText(""+getal);
            Tekstvak.setText("");
            repaint();

        }
    }

    class knopDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double vak1 = Double.parseDouble(tekstvak.getText());
            double vak2  = Double.parseDouble(Tekstvak.getText());
            getal = (vak1/vak2);
            tekstvak.setText(""+getal);
            Tekstvak.setText("");
            repaint();


        }
    }

}

