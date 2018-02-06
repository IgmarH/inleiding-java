package H1;

import java.awt.*;
import java.applet.*;


public class h01 extends Applet {


    public void init() {
        setBackground(Color.BLUE);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Igmar", 50, 60 );
    }

}