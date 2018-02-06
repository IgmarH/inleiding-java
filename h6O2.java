package H6;

import java.applet.Applet;
import java.awt.*;

public class h6O2 extends Applet {

    int uur = 60*60 ;
    int dag = 60*60*24 ;
    int jaar = 60*60*24*365;


    public void init() {
        setSize(1000,1000);
    }

    public void paint (Graphics g) {
        g.drawString("het aantal seconden in een uur zijn: " + uur, 20,20);
        g.drawString("het aantal seconden in een dag zijn: " + dag,20, 35);
        g.drawString("het aantal seconden in een jaar zijn: " + jaar,20,50);

    }
}
