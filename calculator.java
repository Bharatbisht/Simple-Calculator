import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
public class calculator implements ActionListener
{
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
 JTextArea textarea = new JTextArea(2,10);

 JButton button1 = new JButton("1");
 JButton button2 = new JButton("2");
 JButton button3 = new JButton("3");
 JButton button4 = new JButton("4");
 JButton button5 = new JButton("5");
 JButton button6 = new JButton("6");
 JButton button7 = new JButton("7");
 JButton button8 = new JButton("8");
 JButton button9 = new JButton("9");
 JButton button0 = new JButton("0");

 JButton buttonadd = new JButton("+");
 JButton buttonsub = new JButton("-");
 JButton buttonmul = new JButton("*");
 JButton buttondiv = new JButton("/");
 JButton buttonclear = new JButton("C");
 JButton buttonequal = new JButton("=");

 double number1,number2,result;
 int addc=0,mulc=0,divc=0,subc=0;

 public calculator()
 {
 	frame.setSize(300,300);
 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	frame.setVisible(true);
 	frame.setTitle("calculator");
 	frame.setResizable(false);
 	frame.add(panel);
 	panel.setBackground(Color.LIGHT_GRAY);
 	Border border = BorderFactory.createLineBorder(Color.RED,4);
    
    panel.add(textarea);
    textarea.setBackground(Color.WHITE);
    Border tborder = BorderFactory.createLineBorder(Color.BLACK,2);
    textarea.setBorder(tborder);
    Font font = new Font("arial",Font.BOLD,33);
    textarea.setFont(font);
    textarea.setForeground(Color.BLACK);

    textarea.setPreferredSize(new Dimension(2,10));
    textarea.setLineWrap(true);
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);
    panel.add(button7);
    panel.add(button8);
    panel.add(button9);
    panel.add(button0);
    panel.add(buttonadd);
    panel.add(buttonsub);
    panel.add(buttonmul);
    panel.add(buttondiv);
    panel.add(buttonclear);
    panel.add(buttonequal);


    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    button0.addActionListener(this);
    buttonadd.addActionListener(this);
    buttonsub.addActionListener(this);
    buttonmul.addActionListener(this);
    buttondiv.addActionListener(this);
    buttonclear.addActionListener(this);
    buttonequal.addActionListener(this);
    
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==button1)
	textarea.setText("1");
if(e.getSource()==button2) 
	textarea.setText("2");
if(e.getSource()==button3)
	textarea.setText("3");
if(e.getSource()==button4)
	textarea.setText("4");
if(e.getSource()==button5)
	textarea.setText("5");
if(e.getSource()==button6)
	textarea.setText("6");
if(e.getSource()==button7)
	textarea.setText("7");
if(e.getSource()==button8)
	textarea.setText("8");
if(e.getSource()==button9)
	textarea.setText("9");
if(e.getSource()==button0)
	textarea.setText("0");
if(e.getSource()==buttonclear)
	number1=0.0;
    number2=0.0;

if(e.getSource()==buttonadd)
	{number1=number_reader();
	textarea.setText("+");
	addc=1;
	divc=0;
	mulc=0;
	subc=0;}

if(e.getSource()==buttondiv)
	{number1=number_reader();
	textarea.setText("/");
	addc=0;
	divc=1;
	mulc=0;
	subc=0;}
if(e.getSource()==buttonmul)
	{
	number1=number_reader();
	textarea.setText("*");
	addc=0;
	divc=0;
	mulc=1;
	subc=0;
}
if(e.getSource()==buttonsub)
	{
	number1=number_reader();
	textarea.setText("-");
	addc=0;
	divc=0;
	mulc=0;
	subc=1;
   }   
if(e.getSource()==buttonequal)
    {
	   number2=number_reader();
	   if(addc==1)
	   {
	   	result=number1+number2;
	   	textarea.setText(Double.toString(result));
	   }
	   if(divc==1)
	   {
	   	result=number1/number2;
	   	textarea.setText(Double.toString(result));
	   }
	   if(mulc==1)
	   {
	   	result=number1*number2;
	   	textarea.setText(Double.toString(result));
	   }
	   if(subc==1)
	   {
	   	result=number1-number2;
	   	textarea.setText(Double.toString(result));
	   }
	}
}	
	public double number_reader()
	{
		double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1; 
	}	



public static void main(String[] args) 
    { 
	  calculator obj1 = new calculator();
    }

}
