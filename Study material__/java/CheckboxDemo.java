import java.awt.*;


public class CheckboxDemo{


    CheckboxDemo(){

    
    Frame f = new Frame("Who are you ?");

    Checkbox checkbox1 = new Checkbox("I am A decent Student ");
    checkbox1.setBounds(100,100,200,50);

    Checkbox checkbox2 = new Checkbox("I Respect my teachers",true);
    checkbox2.setBounds(100,150,200,50);
     
    Checkbox checkbox3 = new Checkbox("T Dont Wish to Tell",true);
    checkbox3.setBounds(100,200,200,50);
         
    f.add(checkbox1);
    f.add(checkbox2);
    f.add(checkbox3);

    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }
  public static void main(String args[]){

    new CheckboxDemo();
  }

}
