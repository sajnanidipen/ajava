import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
class demo2 extends WindowAdapter{
	static JTextField t1,t2;
	static JLabel l1;static JButton b1,b2,b3;
	
	
	public static void main (String args[]){
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setLayout(new GridLayout(4,2));
		f.setSize(300,300);
		JPanel p = new JPanel(new GridLayout(1,2));
		JPanel p1 = new JPanel(new GridLayout(1,2));
		JPanel p2 = new JPanel(new GridLayout(1,3));
		JPanel p3 = new JPanel(new FlowLayout());
		JLabel l2 = new JLabel("number1");
		JLabel l3 = new JLabel("number2");
		JTextField t1 = new JTextField();
		
		JTextField t2 = new JTextField();
		b1 = new JButton("Modulus");
		b2 = new JButton("Cube");
		b3 = new JButton("add and fine odd and even");
		l1= new JLabel("hello");
		p.add(l2);
		p.add(t1);
		
		p1.add(l3);
		p1.add(t2);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p3.add(l1);
		f.add(p);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		b1.addActionListener(new Cal());
		b2.addActionListener(new Cal());
		b3.addActionListener(new Cal());
	}
static class  Cal implements ActionListener{
	
	public void actionPerformed(ActionEvent we){
		
		if (we.getSource()==b1){
			Float c=Float.parseFloat(t1.getText());
			Float c1=Float.parseFloat(t2.getText());
			Float m=c%c1;
			l1.setText(String.valueOf(m));
			
		}
		if (we.getSource()==b2){
			Float c=Float.parseFloat(t1.getText());
			Float c1=Float.parseFloat(t2.getText());
			Float m=c*c*c;
			l1.setText(String.valueOf(m));
		}
		if (we.getSource()==b3){
			Float c=Float.parseFloat(t1.getText());
			Float c1=Float.parseFloat(t2.getText());
			Float m=c+c;
			if(m%2==0){
				l1.setText("Even");
			
					}
			else{
				l1.setText("Odd");
			}
			
		}
		
		}	
	}
	
}
		
		
		
		
		