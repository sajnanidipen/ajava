import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempDemo extends WindowAdapter{
	static JTextField t1;
	static JButton b1;
	static JLabel l1;
	public static void main(String args[]){
		JFrame f=new JFrame("Temperature converter");
		f.setLayout(new GridLayout(3,1));
		f.setSize(300,300);
		f.setVisible(true);
		t1=new JTextField("");
		b1=new JButton("Convert into celcius");
		l1=new JLabel("");
		b1.addActionListener (new ListenerDemo());
		f.add(t1);
		f.add(b1);
		
		f.add(l1);
	}
	 static class ListenerDemo implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			 double a=Double.parseDouble(t1.getText());
			 if(ae.getSource()==b1){
			 double c;
				 c=a-273.00;
				 
				 l1.setText("The value in celcius is"+c);
			 }
		 }
	 }
}