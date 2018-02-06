package H4;

import java.awt.*;
import java.applet.*;

public class h4O3 extends Applet {

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(227,269,227,151);
        g.drawLine(227,151,231,151);
        g.drawLine(231,151,231,269);
        g.drawLine(231,269,227,269);
        g.setColor(Color.BLUE);
        g.fillRect(227,116,98,35);
        g.setColor(Color.WHITE);
        g.fillRect(227,95,98,35);
        g.setColor(Color.RED);
        g.fillRect(227,95,98,18);
        g.setColor(Color.BLACK);
        g.drawLine(227,151,227,95);
        g.drawLine(227,95,325,95);
        g.drawLine(325,95,325,151);
        g.drawLine(325,151,227,151);
    }
}



