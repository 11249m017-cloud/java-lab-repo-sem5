
import java.applet.Applet;
import java.awt.Graphics;

public class HumanFace extends Applet {

    public void paint(Graphics g) {
        // Draw the face
        g.drawOval(100, 50, 200, 200);

        // Draw the eyes
        g.drawOval(145, 110, 25, 20);
        g.drawOval(230, 110, 25, 20);

        // Draw the nose
        g.drawLine(200, 130, 185, 170);
        g.drawLine(185, 170, 205, 170);

        // Draw the mouth
        g.drawArc(155, 175, 90, 35, 180, 180);
    }
}
