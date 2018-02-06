package H4;

import java.awt.*;
import java.applet.*;

public class h4O2 extends Applet {

    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(465,333,464,138);
        g.drawLine(464,138,250,137);
        g.drawLine(250,137,250,333);
        g.drawLine(250,333,465,333);

        g.drawLine(250,137,357,71);
        g.drawLine(357,71,465,138);

        g.drawLine(284,333,284,249);
        g.drawLine(284,249,335,249);
        g.drawLine(335,249,335,332);
        g.drawLine(314,295,328,295);

        g.drawLine(372,309,372,269);
        g.drawLine(372,269,437,269);
        g.drawLine(437,269,437,309);
        g.drawLine(437,309,372,309);
        g.drawLine(379,302,379,276);
        g.drawLine(379,276,430,275);
        g.drawLine(430,275,430,302);
        g.drawLine(430,302,379,302);

        g.drawLine(282,204,282,162);
        g.drawLine(282,162,349,162);
        g.drawLine(349,162,349,204);
        g.drawLine(349,204,282,204);
        g.drawLine(291,196,290,170);
        g.drawLine(290,170,341,171);
        g.drawLine(341,171,341,196);
        g.drawLine(341,196,291,196);

    }
}
