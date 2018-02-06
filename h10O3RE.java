package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h10O3RE extends Applet {

    TextField tekstvak;
    String s, tekst;
    Label label;
    int maand;

    public void init() {
        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("typ een maand in");
        tekst = "";
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "Januari: heeft 31 dagen";
                    break;
                case 2:
                    tekst = "Februari: heeft 28 dagen";
                    break;
                case 3:
                    tekst = "Maart: heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April: heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei: heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni: heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli: heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus: heeft 31 dagen";
                    break;
                case 9:
                    tekst =  "September: heeft 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober: heeft 31 dagen";
                    break;
                case 11:
                    tekst = "November: heeft 30 dagen";
                    break;
                case 12:
                    tekst = "Decemer: heeft 31 dagen";
                    break;
                default:
                    tekst = "Foutmelding!";
                    break;
            }

            repaint();
        }

    }
}