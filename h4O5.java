package H4;

import java.awt.*;
import java.applet.*;

public class h4O5 extends Applet {

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.fillArc(200, 200, 200, 100, 90, 45);
        g.fillArc(200, 200, 200, 100, 135, 45);
        g.fillArc(200, 200, 200, 100, 180, 45);
        g.fillArc(200, 200, 200, 100, 225, 45);
        g.fillArc(200, 200, 200, 100, 270, 45);
        g.fillArc(200, 200, 200, 100, 315, 45);
        g.fillArc(200, 200, 200, 100, 360, 45);
        g.fillArc(200, 200, 200, 100, 405, 45);
    }
}
