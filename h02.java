package H1;

import java.awt.*;
import java.applet.*;


public class h02 extends Applet {


    public void init() {
        setSize(1000,1000);
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Igmar", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("Houtsnee", 50, 80 );


    }

}
