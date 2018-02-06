package H4;

import java.applet.Applet;
import java.awt.*;

public class h4O1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(292,300,367,412);
        g.drawLine(367,412,217,412);
        g.drawLine(217,412,292,300);

    }
}
