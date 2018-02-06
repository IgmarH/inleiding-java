package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h8O1 extends Applet {
    Button knop;
    TextField tekstvak;
    Button dop;
    String halo;


    public void init() {
        setSize(1000,1000);
        KnopListener kl = new KnopListener();
        tekstvak = new TextField("", 30);
        knop = new Button("OK");
        knop.addActionListener(kl);
        dop = new Button("Reset");
        dop.addActionListener(new Wis());
        tekstvak.addActionListener(kl);
        add(tekstvak);
        add(knop);
        add(dop);
        halo = "";


    }

    public void paint(Graphics g) {
        g.drawString("Welkom type ietsin het vak en klik dan op OK: " + halo, 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            halo = new String();
            halo = tekstvak.getText();

            repaint();
        }
    }

    class Wis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }

}

