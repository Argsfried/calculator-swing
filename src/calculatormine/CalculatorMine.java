/*
@author Arukane
Title: Calculator
Comment: My first java project
*/
package calculatormine;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorMine
{
    double firstNumber,secondNumber,result;
    
    String answer;
    
    int switchA=0;
    
    private JTextField tp1;
    private JButton sqrt,clear,erase,divide,j7,j8,j9,multiply,j4,j5,j6,minus,j1,j2,j3,add,negpos,j0,jdot,equals;
    private JFrame frame;
    
    public CalculatorMine()
    {
        Components();
        frame.setVisible(true);
    }
    
   
    private void Components()
    {
        //Text Field
        tp1 = new JTextField();
        tp1.setEditable(false);
        tp1.setText("");
        tp1.setDisabledTextColor(Color.yellow);
        tp1.setFont(new Font("Tahoma",1,18));
        tp1.setHorizontalAlignment(JTextField.RIGHT);
        tp1.setInheritsPopupMenu(true);
        tp1.setBounds(10,10,355,100);
        tp1.addActionListener(this::tp1ActionPerformed);
        
        //First Column
        sqrt = new JButton();
        sqrt.setBounds(10,120,85,60);
        sqrt.setBackground(new java.awt.Color(128, 128, 128));
        sqrt.setFont(new java.awt.Font("Tahoma", 1, 18));
        sqrt.setText("√");
        sqrt.addActionListener(this::sqrtActionPerformed);

        
        clear = new JButton();
        clear.setBounds(100,120,85,60);
        clear.setBackground(new java.awt.Color(128,128,128));
        clear.setFont(new java.awt.Font("Tahoma",1,18));
        clear.setText("C");
        clear.addActionListener(this::clearActionPerformed);

        
        erase = new JButton();
        erase.setBounds(190,120,85,60);
        erase.setBackground(new java.awt.Color(128, 128, 128));
        erase.setFont(new java.awt.Font("Tahoma", 1, 18));
        erase.setText("←");
        erase.addActionListener(this::eraseActionPerformed);

      
        divide = new JButton();
        divide.setBounds(280,120,85,60);
        divide.setBackground(new java.awt.Color(128, 128, 128));
        divide.setFont(new java.awt.Font("Tahoma", 1, 18));
        divide.setText("÷");
        divide.addActionListener(this::divideActionPerformed);

        //Second Column
        j7 = new JButton();
        j7.setBounds(10,185,85,60);
        j7.setBackground(new java.awt.Color(128, 128, 128));
        j7.setText("7");
        j7.setFont(new java.awt.Font("Tahoma", 1, 18));
        j7.addActionListener(this::j7ActionPerformed);

        
        j8 = new JButton();
        j8.setBounds(100,185,85,60);
        j8.setBackground(new java.awt.Color(128, 128, 128));
        j8.setFont(new java.awt.Font("Tahoma", 1, 18));
        j8.setText("8");
        j8.addActionListener(this::j8ActionPerformed);
        
        j9 = new JButton();
        j9.setBounds(190,185,85,60);
        j9.setBackground(new java.awt.Color(128, 128, 128));
        j9.setFont(new java.awt.Font("Tahoma", 1, 18));
        j9.setText("9");
        j9.addActionListener(this::j9ActionPerformed);

       
        multiply = new JButton();
        multiply.setBounds(280,185,85,60);
        multiply.setBackground(new java.awt.Color(128, 128, 128));
        multiply.setFont(new java.awt.Font("Tahoma", 1, 18));
        multiply.setText("x");
        multiply.addActionListener(this::multiplyActionPerformed);
   
        
        //Third Column
        j4 = new JButton();
        j4.setBounds(10,250,85,60);
        j4.setBackground(new java.awt.Color(128, 128, 128));
        j4.setFont(new java.awt.Font("Tahoma", 1, 18));
        j4.setText("4");
        j4.addActionListener(this::j4ActionPerformed);

        
        j5 = new JButton();
        j5.setBounds(100,250,85,60);
        j5.setBackground(new java.awt.Color(128, 128, 128));
        j5.setFont(new java.awt.Font("Tahoma", 1, 18));
        j5.setText("5");
        j5.addActionListener(this::j5ActionPerformed);
        
        j6 = new JButton();
        j6.setBounds(190,250,85,60);
        j6.setBackground(new java.awt.Color(128, 128, 128));
        j6.setFont(new java.awt.Font("Tahoma", 1, 18));
        j6.setText("6");
        j6.addActionListener(this::j6ActionPerformed);

        minus = new JButton();
        minus.setBounds(280,250,85,60);
        minus.setBackground(new java.awt.Color(128, 128, 128));
        minus.setFont(new java.awt.Font("Tahoma", 1, 18));
        minus.setText("-");
        minus.addActionListener(this::minusActionPerformed);
 
        
        //Fourth Column
        j1 = new JButton();
        j1.setBounds(10,315,85,60);
        j1.setBackground(new java.awt.Color(128, 128, 128));
        j1.setFont(new java.awt.Font("Tahoma", 1, 18));
        j1.setText("1");
        j1.addActionListener(this::j1ActionPerformed);

        j2 = new JButton();
        j2.setBounds(100,315,85,60);
        j2.setBackground(new java.awt.Color(128, 128, 128));
        j2.setFont(new java.awt.Font("Tahoma", 1, 18));
        j2.setText("2");
        j2.addActionListener(this::j2ActionPerformed);

        
        j3 = new JButton();
        j3.setBounds(190,315,85,60);
        j3.setBackground(new java.awt.Color(128, 128, 128));
        j3.setFont(new java.awt.Font("Tahoma", 1, 18));
        j3.setText("3");
        j3.addActionListener(this::j3ActionPerformed);

        add = new JButton();
        add.setBounds(280,315,85,60);
        add.setBackground(new java.awt.Color(128, 128, 128));
        add.setFont(new java.awt.Font("Tahoma", 1, 18));
        add.setText("+");
        add.addActionListener(this::addActionPerformed);

        //Fifth Column
        negpos = new JButton();
        negpos.setBounds(10,380,85,60);
        negpos.setBackground(new java.awt.Color(128, 128, 128));
        negpos.setFont(new java.awt.Font("Tahoma", 1, 18));
        negpos.setText("+/-");
        negpos.addActionListener(this::negposActionPerformed);

        
        j0 = new JButton();
        j0.setBounds(100,380,85,60);
        j0.setBackground(new java.awt.Color(128, 128, 128));
        j0.setFont(new java.awt.Font("Tahoma", 1, 18));
        j0.setText("0");
        j0.addActionListener(this::j0ActionPerformed);
   
        jdot = new JButton();
        jdot.setBounds(190,380,85,60);
        jdot.setBackground(new java.awt.Color(128, 128, 128));
        jdot.setFont(new java.awt.Font("Tahoma", 1, 18));
        jdot.setText(".");
        jdot.addActionListener(this::jdotActionPerformed);

        equals = new JButton();
        equals.setBounds(280,380,85,60);
        equals.setBackground(new java.awt.Color(128, 128, 128));
        equals.setFont(new java.awt.Font("Tahoma", 1, 18));
        equals.setText("=");
        equals.addActionListener(this::equalsActionPerformed);
        
         //Frame
        frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Calculator");
        frame.setName("Calculator");
        frame.setSize(390,500);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/calcpng.png")));
        frame.setBackground(new java.awt.Color(128,128,128));
        frame.setMinimumSize(new java.awt.Dimension(390,500));
        frame.setMaximumSize(new java.awt.Dimension(390,500));
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(false);
        
        //Add
        frame.add(sqrt);
        frame.add(clear);
        frame.add(erase);
        frame.add(divide);
        frame.add(j7);
        frame.add(j8);
        frame.add(j9);
        frame.add(multiply);
        frame.add(j4);
        frame.add(j5);
        frame.add(j6);
        frame.add(minus);
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(add);
        frame.add(negpos);
        frame.add(j0);
        frame.add(jdot);
        frame.add(equals);
        frame.add(tp1);
        }    
        private void tp1ActionPerformed(ActionEvent evt){}
        
        private void j1ActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j1.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j1.getText();
                tp1.setText(enterNumber);
            }
        }
        private void j2ActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j2.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j2.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void j3ActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j3.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j3.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void j4ActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j4.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j4.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void j5ActionPerformed(ActionEvent evt)
        {
             if (switchA==0)
            {
                String enterNumber = tp1.getText()+j5.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j5.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void j6ActionPerformed(ActionEvent evt)
        {
             if (switchA==0)
            {
                String enterNumber = tp1.getText()+j6.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j6.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void j7ActionPerformed(ActionEvent evt) 
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j7.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j7.getText();
                tp1.setText(enterNumber);
            }
        }
                
        private void j8ActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j8.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j8.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void j9ActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j9.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j9.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void j0ActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+j0.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+j0.getText();
                tp1.setText(enterNumber);
            }
        }
        
        private void sqrtActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                double number = Double.parseDouble(String.valueOf(tp1.getText()));
                double sqrtInitial = number*number;                
                String sqrtNumber = String.valueOf((int)sqrtInitial);
                tp1.setText(sqrtNumber);
            }
        }
        
        private void clearActionPerformed(ActionEvent evt)
        {   
            firstNumber=0;
            secondNumber=0;
            switchA=0;
            tp1.setText("");
        }
        
        private void eraseActionPerformed(ActionEvent evt)
        {
            String backspace=null;
            if(tp1.getText().length() > 0)
            {
               StringBuilder sb1;
                sb1 = new StringBuilder(tp1.getText());
               sb1.deleteCharAt(tp1.getText().length()-1);
               backspace = sb1.toString();
               tp1.setText(backspace);
            }
        }
        
        private void divideActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                firstNumber = Double.parseDouble(tp1.getText());
                tp1.setText("");
            }
            else
            {
                secondNumber = Double.parseDouble(tp1.getText());
            }
            if(switchA==4)
            {
                firstNumber = firstNumber/secondNumber;
                tp1.setText(String.valueOf((int)firstNumber));
            }
            switchA=4;
        }
        
        private void multiplyActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                firstNumber = Double.parseDouble(tp1.getText());
                tp1.setText("");
            }
            else
            {
                secondNumber = Double.parseDouble(tp1.getText());
            }
            if(switchA==3)
            {
                firstNumber = firstNumber*secondNumber;
                tp1.setText(String.valueOf((int)firstNumber));
            }
            switchA=3;
        }
        
        private void minusActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                firstNumber = Double.parseDouble(tp1.getText());
                tp1.setText("");
            }
            else
            {
                secondNumber = Double.parseDouble(tp1.getText());
            }
            if(switchA==2)
            {
                firstNumber = firstNumber-secondNumber;
                tp1.setText(String.valueOf((int)firstNumber));
            }
            switchA=2;
        }
        
        private void addActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                firstNumber = Double.parseDouble(tp1.getText());
                tp1.setText("");
            }
            else
            {
                secondNumber = Double.parseDouble(tp1.getText());
            }
  
            if (switchA==1)
            {
                firstNumber = firstNumber+secondNumber;
                tp1.setText(String.valueOf((int)firstNumber));
            }
           switchA = 1;
        }
        private void negposActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                double negPos = Double.parseDouble(String.valueOf(tp1.getText()));
                negPos = negPos*(-1);
                String negPos2 = String.valueOf((int)negPos);
                tp1.setText(negPos2);
            }
        }
        
        private void jdotActionPerformed(ActionEvent evt)
        {
            if (switchA==0)
            {
                String enterNumber = tp1.getText()+jdot.getText();
                tp1.setText(enterNumber);
            }
            else
            {
                tp1.setText("");
                String enterNumber = tp1.getText()+jdot.getText();
                tp1.setText(enterNumber);
            }
        }
        private void equalsActionPerformed(ActionEvent evt)
        {
             if (tp1.getText() == "")
             {
                 tp1.setText("");
             }
             secondNumber = Double.parseDouble(tp1.getText());
             
             if (switchA==1)
             {
                 result = firstNumber+secondNumber;
                 answer = String.valueOf((int)result);
                 tp1.setText(answer);
             }
             if (switchA==2)
             {
                 result = firstNumber-secondNumber;
                 answer = String.valueOf((int)result);
                 tp1.setText(answer);
             }
             if (switchA==3)
             {
                 result = firstNumber*secondNumber;
                 answer = String.valueOf((int)result);
                 tp1.setText(answer);
             }
             if (switchA==4)
             {
                 result = firstNumber/secondNumber;
                 answer = String.valueOf((int)result);
                 tp1.setText(answer);
             }
        }
        
    public static void main(String[] args)
    {
        CalculatorMine calculatorMine = new CalculatorMine();
    }
}
