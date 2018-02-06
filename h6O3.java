package H6;

import java.applet.Applet;
import java.awt.*;

public class h6O3 extends Applet {

    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int negative = 1883 + 115;
        g.drawString("de uitkomst is: " + negative,100,100);

    }
}