package H4;

import java.awt.*;
import java.applet.*;

public class h4PR extends Applet {

    public void init() {
        setSize(1000, 1000);
    }



    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(165,167,369,167);

        g.drawLine(163,321,163,196);
        g.drawLine(163,196,367,196);
        g.drawLine(367,196,367,321);
        g.drawLine(367,321,163,321);

        g.drawRoundRect(162, 350, 205, 130, 10, 10);

        g.setColor(Color.MAGENTA);
        g.fillRect(400, 197, 205, 125);
        g.setColor(Color.BLACK);
        g.drawArc(400, 197, 205, 125, 90, 45);
        g.drawArc(400, 197, 205, 125, 135, 45);
        g.drawArc(400, 197, 205, 125, 180, 45);
        g.drawArc(400, 197, 205, 125, 225, 45);
        g.drawArc(400, 197, 205, 125, 270, 45);
        g.drawArc(400, 197, 205, 125, 315, 45);
        g.drawArc(400, 197, 205, 125, 360, 45);
        g.drawArc(400, 197, 205, 125, 405, 45);

        g.setColor(Color.MAGENTA);
        g.fillArc(400, 350, 205, 125, 90, 45);
        g.fillArc(400, 350, 205, 125, 135, 45);
        g.fillArc(400, 350, 205, 125, 180, 45);
        g.fillArc(400, 350, 205, 125, 225, 45);
        g.fillArc(400, 350, 205, 125, 270, 45);
        g.fillArc(400, 350, 205, 125, 315, 45);
        g.fillArc(400, 350, 205, 125, 360, 45);
        g.fillArc(400, 350, 205, 125, 405, 45);

        g.setColor(Color.BLACK);
        g.drawArc(650, 197, 205, 125, 90, 45);
        g.drawArc(650, 197, 205, 125, 135, 45);
        g.drawArc(650, 197, 205, 125, 180, 45);
        g.drawArc(650, 197, 205, 125, 225, 45);
        g.drawArc(650, 197, 205, 125, 270, 45);
        g.drawArc(650, 197, 205, 125, 315, 45);
        g.drawArc(650, 197, 205, 125, 360, 45);
        g.drawArc(650, 197, 205, 125, 405, 45);
        g.setColor(Color.MAGENTA);
        g.fillArc(650, 197, 205, 125, 0, 45);

        g.setColor(Color.BLACK);
        g.drawOval(700, 350, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString("Lijn", 250, 180 );
        g.setColor(Color.BLACK);
        g.drawString("Rechthoek", 200, 335 );
        g.setColor(Color.BLACK);
        g.drawString(" Gevulde rechthoek met ovaal", 400, 335 );
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal", 450, 500 );
        g.setColor(Color.BLACK);
        g.drawString("Afgeronde Rechthoek", 200, 500 );
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen", 670, 335 );
        g.setColor(Color.BLACK);
        g.drawString("Cirkel", 735, 500 );



    }
}



