import javax.swing.*;

public class RadioButtonEx{

    JFrame f = new JFrame();
    RadioButtonEx(){
    
        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2= new JRadioButton("B) Female");
        JRadioButton r3= new JRadioButton("C) Special");
        JRadioButton r4 = new JRadioButton("D) Don't wish to tell");


        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        r3.setBounds(75,150,100,30);
        r4.setBounds(75,200,100,30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
         bg.add(r3);
        bg.add(r4);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args){

        new  RadioButtonEx();

    }
}

