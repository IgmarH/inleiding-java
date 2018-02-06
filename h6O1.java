package H6;

import java.applet.Applet;
import java.awt.*;

public class h6O1 extends Applet {

    double a= 113;
    double b= 4;

    public void init () {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {

        double calc = (int) a/b;
        g.drawString("113 gesplit voor 4 personen "+ calc, 50, 50);
        g.drawString("Jan:€"+calc, 50, 80);
        g.drawString("Ali:€"+calc, 50, 100);
        g.drawString("Jeanneette:€"+calc, 50, 120);
        g.drawString("Igmar:€"+calc, 50, 140);
    }
}
