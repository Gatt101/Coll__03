import java.awt.*;

public class AButton extends Frame{

    AButton(){
    Button b = new Button("ANTBUtton");

    b.setBounds(30,100,80,30);
    add(b);
    setSize(300,300);
    setLayout(null);
    setVisible(true);


    }

    public static void main(String args[]){
        AButton f = new AButton();
    }
    
}
