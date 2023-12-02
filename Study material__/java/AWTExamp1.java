import java.awt.*;

public class AWTExamp1 extends Frame {

    AWTExamp1() {

        Button c = new Button("CLICK_ME");
        c.setBounds(30, 100, 80, 30);
        c.setName("wewwed");

        add(c);

        setSize(300, 300);

        setTitle("Hi SE DIV 2");

        setLayout(null);

        setVisible(true);
    }

    public static void main(String args[]) {
        AWTExamp1 f = new AWTExamp1();
    }
}