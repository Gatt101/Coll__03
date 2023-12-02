/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizapllication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author PRATHAMESH PATIL
 */
public class QuizTest extends JFrame implements ActionListener{
         
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count = 0,current = 0;
    int m[] = new int[10];
    
    QuizTest(String s){ 
         super(s);
         label = new JLabel();
         add(label);
         bg = new ButtonGroup();
         for(int i=0;i<5;i++){
             radioButtons[i] = new JRadioButton();
             add(radioButtons[i]);
             bg.add(radioButtons[i]);
             
         }
         btnNext = new JButton("Next");
         btnResult = new JButton("Result");
         btnResult.setVisible(false);
         btnResult.addActionListener(this);
         btnNext.addActionListener(this);
         add(btnNext);
         add(btnResult);
         setData();
         label.setBounds(30,40,450,20);
         radioButtons[0].setBounds(50,80,450,20);
         radioButtons[1].setBounds(50,110,200,20);
         radioButtons[2].setBounds(50,140,200,20);
         radioButtons[3].setBounds(50, 170, 200, 20);
         btnNext.setBounds(100,240,100,30);
         btnResult.setBounds(270,240,100,30);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(null);
         setLocation(250,100);
         setVisible(true);
         setSize(600,350);
         
         
         
         
    }
    void setData(){
        radioButtons[4].setSelected(true);
        if(current==0){
            label.setText("Q1 : Which is the official language for Android Development?");
            radioButtons[0].setText("A- Java");
            radioButtons[1].setText("B- Kotlin");
            radioButtons[2].setText("C- C++");
            radioButtons[3].setText("D- JavaScript");
        }
         if(current==1){
            label.setText("Q2 : What is the size of boolean variable?");
            radioButtons[0].setText("A- 8 bit");
            radioButtons[1].setText("B- 16 bit");
            radioButtons[2].setText("C- 32 bit");
            radioButtons[3].setText("D- 4 bit");
        }
           if(current==2){
            label.setText("Q3 :What is the default value of long variable?");
            radioButtons[0].setText("A- 0");
            radioButtons[1].setText("B- 0.0");
            radioButtons[2].setText("C- 0L");
            radioButtons[3].setText("D- 0.000");
        }
            if(current==3){
            label.setText("Q4 : What is the default value of boolean variable?");
            radioButtons[0].setText("A- true");
            radioButtons[1].setText("B- false");
            radioButtons[2].setText("C- null");
            radioButtons[3].setText("D- not defined");
        }
            if(current==4){
            label.setText("Q5 :What is function overloading? ");
            radioButtons[0].setText("A- Method with same name,different paramwter types but different parameter name");
            radioButtons[1].setText("B- Method with different names");
            radioButtons[2].setText("C- Method with same name but different return types");
            radioButtons[3].setText("D- Method with same name but different parameters");
        }
            if(current==5){
            label.setText("Q6 :  What type of variables a class contains of?");
            radioButtons[0].setText("A-class variables, local variables, instance variables");
            radioButtons[1].setText("B-class variables, local variables");
            radioButtons[2].setText("C-class variables");
            radioButtons[3].setText("D-class variabless, instance variables");
        }
            if(current==6){
            label.setText("Q7 : What is Serialization?");
            radioButtons[0].setText("A- Serialization is the process of writing the state of an object to another object");
            radioButtons[1].setText("B- Serialization is the process of writing the state of an object to a byte stream");
            radioButtons[2].setText("C- Both of the above");
            radioButtons[3].setText("D- None of the above");
        }
            if(current==7){
            label.setText("Q8 :Which of the following is thread safe? ");
            radioButtons[0].setText("A- StringBuffer");
            radioButtons[1].setText("B- StringBuider");
            radioButtons[2].setText("C- Both of the above");
            radioButtons[3].setText("D- None of the above");
        }
            if(current==8){
            label.setText("Q9 :s2 = s1.trim() Which task it will performed? ");
            radioButtons[0].setText("A- Converts string s to all lowercase");
            radioButtons[1].setText("B- Give length of string s1");
            radioButtons[2].setText("C- Converts string s to all uppercase");
            radioButtons[3].setText("D- Remove white spaces at the beginning and end of the string s1");
        }
          if(current==9){
            label.setText("Q10 :public byte nextByte() What is the function of this scanner class?");
            radioButtons[0].setText("A- it scans the next token as a byte");
            radioButtons[1].setText("B- it scans the next token as a short value");
            radioButtons[2].setText("C- it scans the next token of input as a float");
            radioButtons[3].setText("D- it scans the next token of input as a float");
        }
          label.setBounds(30,40,450,20);
          for(int i=0,j=0; i<=90;i+=30, j++){
              radioButtons[j].setBounds(50,80+i,200,20);
              
          }          
        
       
    }
    boolean checkAns(){
        if(current==0){
            return (radioButtons[1].isSelected());
        
    }
          if(current==1){
            return (radioButtons[1].isSelected());
        
    }
            if(current==2){
            return (radioButtons[2].isSelected());
        
    }
              if(current==3){
            return (radioButtons[1].isSelected());
        
    }
                if(current==4){
            return (radioButtons[3].isSelected());
        
    }
                  if(current==5){
            return (radioButtons[0].isSelected());
        
    }
                    if(current==6){
            return (radioButtons[1].isSelected());
        
    }
                      if(current==7){
            return (radioButtons[0].isSelected());
        
    }
                        if(current==8){
            return (radioButtons[3].isSelected());
        
    }
                          if(current==9){
            return (radioButtons[0].isSelected());
        
    }
        return false;
        
    }
    

    public static void main(String[] args){
        new QuizTest("Simple QuizApp");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnNext){
           if(checkAns())
               count = count +1;
           current++;
           setData();
           if(current==9){
               btnNext.setEnabled(false);
               btnResult.setVisible(true);
               btnResult.setText("Result");
           }
                  
       }
       if(e.getActionCommand().equals("Result")){
           if(checkAns())
               count = count +1;
           current++;
           JOptionPane.showMessageDialog(this, "Correct Answers are"+count);
           System.exit(0);
       }
    }
    
}
