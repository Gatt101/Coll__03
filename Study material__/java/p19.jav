import java.swing.*;
import java.awt.*;
class p19{
public static void main(String [] args){
JFrame frame = new Jframe();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);

JPanel panel=new JPanel();
frame.add(panel);

JLabel label =new JLabel("Message: ");
panel.add(label);

JTextField textField = new JTextField(15);
        panel.add(textField);

  JButton button = new JButton("Click me");
        panel.add(button);

button.addActionListener(new ActionListner()
{ 
public void actionPerformed(ActionEvent e){
 textField.setText("Hello");

}


})
frame.setVisible(true);
}}