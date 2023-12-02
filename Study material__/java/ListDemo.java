import java.awt.*;

public class ListDemo {


ListDemo(){


    Frame f = new Frame();

    List l1= new List(5);
    List l2= new List(5);

    l1.setBounds(100,100,75,75);
    l2.setBounds(300,100,75,75);

    l1.add("roll no 51");
    l1.add("roll no 68");
    l1.add("roll no 58");
    l1.add("roll no 8");
    l1.add("roll no 54");
    l2.add("RRR");
    l2.add("Java");
    l2.add("Attack on Titan");
    l2.add("Eren Yeager");
    l2.add("Red Dead");
  
      f.add(l1);
      f.add(l2);

      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);


}

public static void main(String args[]){
   new ListDemo();

}
}