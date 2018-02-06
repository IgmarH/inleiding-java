package H4;

import java.awt.*;
import java.applet.*;

public class h4O4 extends Applet {

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(303,130,384,130);
        g.drawLine(303,358,303,130);
        g.drawLine(384,130,384,358);
        g.drawLine(384,358,303,358);

        g.drawLine(384,358,384,276);
        g.drawLine(384,276,464,276);
        g.drawLine(464,276,463,358);
        g.drawLine(463,358,384,358);

        g.drawLine(464,358,464,188);
        g.drawLine(464,188,537,188);
        g.drawLine(537,188,537,358);
        g.drawLine(537,358,464,358);

        g.drawLine(291,129,291,363);
        g.drawLine(291,363,537,363);

        g.setColor(Color.BLACK);
        g.drawString("Jeroen", 325, 375 );
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 400, 375 );
        g.setColor(Color.BLACK);
        g.drawString("Hans", 480, 375 );

        g.setColor(Color.BLACK);
        g.drawString("20", 260, 340 );
        g.setColor(Color.BLACK);
        g.drawString("40", 261, 292 );
        g.setColor(Color.BLACK);
        g.drawString("60", 259, 241 );
        g.setColor(Color.BLACK);
        g.drawString("80", 259, 187 );
        g.setColor(Color.BLACK);
        g.drawString("100", 256, 134 );

        g.setColor(Color.BLUE);
        g.fillRect(304,131,80,227);
        g.setColor(Color.GREEN);
        g.fillRect(385,277,79,81);
        g.setColor(Color.RED);
        g.fillRect(465,189,72,169);
    }
}

