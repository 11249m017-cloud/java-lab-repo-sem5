
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class AppletDesign extends Applet {

    public void paint(Graphics g) {
        // Draw a red rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 150, 80);

        // Draw a blue oval
        g.setColor(Color.BLUE);
        g.drawOval(250, 50, 120, 80);

        // Display message in bold font
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 50, 180);
    }
}
