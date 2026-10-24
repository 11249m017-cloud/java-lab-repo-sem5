
import java.awt.*;

public class BorderLayoutDemo extends Frame {

    BorderLayoutDemo() {
        setTitle("Application Dashboard");

        setLayout(new BorderLayout());

        add(new Label("HEADER", Label.CENTER),
            BorderLayout.NORTH);

        add(new Label("FOOTER", Label.CENTER),
            BorderLayout.SOUTH);

        add(new Label("MENU", Label.CENTER),
            BorderLayout.WEST);

        add(new Label("OPTIONS", Label.CENTER),
            BorderLayout.EAST);

        add(new Label("MAIN CONTENT", Label.CENTER),
            BorderLayout.CENTER);

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
