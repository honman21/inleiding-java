package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Beslissingen2 extends Applet {

    TextField tv;
    boolean firstnumber;
    Label label;
    int maxInput;
    int userInput;
    int minInput;

    public void init() {
        tv = new TextField("",7);
        tv.addActionListener((new vakListener()));
        label = new Label("Voer een getal in: ");
        add(label);
        add(tv);
        maxInput = 0;
        minInput = 0;
        firstnumber = true;

    }

    public void paint(Graphics g) {
        g.drawString("Min input: " + minInput,40,70);
        g.drawString("Max input: "+ maxInput, 40,90);

    }

    class vakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInputString = tv.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstnumber) {
                firstnumber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput) {
                    maxInput = userInput;

                    repaint();
                }else if (userInput < minInput) {
                    minInput = userInput;

                    repaint();
                }
            }
        }
    }
}