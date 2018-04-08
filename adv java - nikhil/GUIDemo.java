import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIDemo extends WindowAdapter{
	static JLabel l1,l2,l3;
	static JButton b1,b2,b3;
	
	static JTextField t1,t2;
	static JFrame f;
	static JPanel p1,p2,p3;
	static int a,b;
	public static void main(String args[]){
		f=new JFrame("Demo");
		f.setLayout(new GridLayout(4,1));
		f.setVisible(true);
		f.setSize(500,500);
		l1=new JLabel("enter number1");
		l2=new JLabel("enter number2");
		l3=new JLabel("");
		t1=new JTextField("");
		t2=new JTextField("");
		b1=new JButton("Modulus");
		b2=new JButton("Cube");
		b3=new JButton("Add");
		p1=new JPanel(new FlowLayout());
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2=new JPanel(new FlowLayout());
		p2.add(l1);
		p2.add(t1);
		p3=new JPanel(new FlowLayout());
		p3.add(l2);
		p3.add(t2);
		b1.addActionListener(new ListenerDemo());
		b2.addActionListener(new ListenerDemo());
		b3.addActionListener(new ListenerDemo());
		f.add(p2);
		f.add(p3);
		f.add(p1);
		f.add(l3);
	}

	static class ListenerDemo implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			if(ae.getSource()==b1){
				int c;
				c=a%b;
				l3.setText("The value is "+c);
			}
			if(ae.getSource()==b2){
				int c;
				c=a*a*a;
				l3.setText("The value is "+c);
			}
			if(ae.getSource()==b3){
				int c=a+b;
				//l3.setText("The value is "+c);
				if (c%2==0){
					l3.setText("The given no is even"+c);
				}
				else{
					l3.setText("The given no is odd "+c);
				}
			}
		}
	}
}
		
		
		

 
	
	
