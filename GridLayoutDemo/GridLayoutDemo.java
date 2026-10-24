
import java.awt.*;

public class GridLayoutDemo extends Frame {

    GridLayoutDemo() {
        setTitle("Calculator");

        setLayout(new GridLayout(4, 4, 5, 5));

        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("/"));

        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("*"));

        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("-"));

        add(new Button("0"));
        add(new Button("C"));
        add(new Button("="));
        add(new Button("+"));

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
