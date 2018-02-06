package H4;

import java.awt.*;
import java.applet.*;

public class h4O7 extends Applet {

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRoundRect(400, 400, 150, 150, 10, 10);
        g.setColor(Color.BLACK);
        g.fillOval(420,420,40,40);
        g.setColor(Color.BLACK);
        g.fillOval(492,420,40,40);
        g.setColor(Color.BLACK);
        g.fillOval(420,490,40,40);
        g.setColor(Color.BLACK);
        g.fillOval(492,490,40,40);
    }
}
