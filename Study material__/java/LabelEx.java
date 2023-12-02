import java.awt.*;

public class LabelEx {
   public static void main(String args[]){
    Frame f = new Frame("Label Example ");

    Label l1 = new Label("Have a Good Day :)");
     Label l2 = new Label("Have a Another Good Day :)");

     l1.setBounds(50,100,300,30);
     l2.setBounds(50,150,300,30);

     f.add(l1);
     f.add(l2);

     f.setSize(800,800);

     f.setLayout(null);
     f.setVisible(true);


   }    
}
