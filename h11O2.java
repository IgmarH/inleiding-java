package H11;

import java.applet.Applet;
import java.awt.*;

public class
h11O2 extends Applet{

    public void paint(Graphics g) {
        int teller;
        int y=10;


        for(teller=20; teller > 10; teller--)  {
            y+=20;
            g.drawString(""+teller,20,y);

        }


    }
}
