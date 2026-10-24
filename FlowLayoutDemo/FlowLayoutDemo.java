
import java.awt.*;

public class FlowLayoutDemo extends Frame {

    FlowLayoutDemo() {
        setTitle("FlowLayout Example");

        setLayout(new FlowLayout());

        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
