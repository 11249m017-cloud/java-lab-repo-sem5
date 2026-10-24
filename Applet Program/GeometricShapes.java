
import java.applet.Applet;
import java.awt.Graphics;

public class GeometricShapes extends Applet {

    public void paint(Graphics g) {
        // Draw a rectangle
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 65, 130);

        // Draw a circle
        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 215, 150);

        // Draw a line
        g.drawLine(50, 200, 150, 200);
        g.drawString("Line", 85, 220);

        // Draw a triangle
        g.drawLine(250, 200, 200, 280);
        g.drawLine(200, 280, 300, 280);
        g.drawLine(300, 280, 250, 200);
        g.drawString("Triangle", 225, 300);
    }
}
