package H4;

import java.awt.*;
import java.applet.*;

public class h4O6 extends Applet {

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.black);
        g.drawRoundRect(200, 200, 80, 160, 10, 10);
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(200,200,80,160,10,10);
        g.setColor(Color.RED);
        g.fillOval(221,210,40,40);
        g.setColor(Color.YELLOW);
        g.fillOval(221,260,40,40);
        g.setColor(Color.GREEN);
        g.fillOval(221,310,40,40);
    }
}
