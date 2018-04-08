import java.io.*;
import java.util.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class login extends WindowAdapter{
	public static void main(String args[]){
	JFrame f=new JFrame();
	JLabel l1=new JLabel("Login name");
	f.add(l1);
	l1.setBounds(50,100,100,20);
	JLabel l2=new JLabel("Password");
	f.add(l2);
	l2.setBounds(50,140,100,20);
	JTextField t1=new JTextField();
	f.add(t1);
	t1.setBounds(200,100,100,20);
	JPasswordField t2=new JPasswordField();
	f.add(t2);
	t2.setBounds(200,140,100,20);
	JButton b1=new JButton("Login");
	f.add(b1);
	b1.setBounds(90,180,90,20);
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{ 
			JFrame f2=new JFrame();
			JLabel l3=new JLabel("Emp 1st Name:");
			f2.add(l3);
			l3.setBounds(50,100,100,20);
			JLabel l4=new JLabel("Emp 2nd Name:");
			f2.add(l4);
			l4.setBounds(400,100,100,20);
			JLabel l5=new JLabel("DOB :");
			f2.add(l5);
			l5.setBounds(50,140,100,20);
			JLabel l6=new JLabel("Email:");
			f2.add(l6);
			l6.setBounds(50,180,100,20);
			JLabel l7=new JLabel("Contact No :");
			f2.add(l7);
			l7.setBounds(50,220,100,20);
			JLabel l8=new JLabel("years of experience:");
			f2.add(l8);
			l8.setBounds(50,260,100,20);
			JTextField t3=new JTextField();
			f2.add(t3);
			t3.setBounds(200,100,100,20);
			JLabel a7=new JLabel("Gender");
			f2.add(a7);
			a7.setBounds(400,140,100,20);
			JRadioButton r1=new JRadioButton("A) Male");    
			JRadioButton r2=new JRadioButton("B) Female");    
			r1.setBounds(600,140,100,20);    
			r2.setBounds(600,160,100,20);    
			ButtonGroup bg=new ButtonGroup();    
			bg.add(r1);
			bg.add(r2);    
			f2.add(r1);
			f2.add(r2);  
			JTextField t4=new JTextField();
			f2.add(t4);
			t4.setBounds(600,100,100,20);
			JTextField t5=new JTextField();
			f2.add(t5);
			t5.setBounds(200,140,100,20);
			JTextField t6=new JTextField();
			f2.add(t6);
			t6.setBounds(200,180,100,20);
			JTextField t7=new JTextField();
			f2.add(t7);
			t7.setBounds(200,220,100,20);
			JTextField t8=new JTextField();
			f2.add(t8);
			t8.setBounds(200,260,100,20);
			JLabel a10=new JLabel("Designation");
			f2.add(a10);
			a10.setBounds(400,180,100,20);
			Checkbox checkbox1 = new Checkbox("Manager");  
			checkbox1.setBounds(600,180, 100,20);  
			Checkbox checkbox2 = new Checkbox("Clerk", true);  
			checkbox2.setBounds(600,200, 100,20);  
			f2.add(checkbox1);  
			f2.add(checkbox2);  
			f.setSize(400,400);
			JButton b2=new JButton("Submit");
			f2.add(b2);
			b2.setBounds(250,300,90,20);
			JButton b3=new JButton("Cancel");
			f2.add(b3);
			b3.setBounds(350,300,90,20);
			JButton b4=new JButton("Reset");
			f2.add(b4);
			b4.setBounds(450,300,90,20);
			f2.setSize(750,750);
			f2.setLayout(null);
			f2.setVisible(true);
		}
		
	});
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	}
}

