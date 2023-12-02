import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


public class p18 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("GUI");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 150);


        // Create a panel to hold the components

        JPanel panel = new JPanel();

        frame.add(panel);


        // Create a label to display a message

        JLabel label = new JLabel("Message: ");

        panel.add(label);


        // Create a text field to display the message

        JTextField textField = new JTextField(15);

        panel.add(textField);


        // Create a button to change the message

        JButton button = new JButton("Click me");

        panel.add(button);


        // Add an ActionListener to the button

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textField.setText("Hello, World!");

            }

        });


        frame.setVisible(true);

    }

}