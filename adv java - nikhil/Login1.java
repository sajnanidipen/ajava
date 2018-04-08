import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login1 extends WindowAdapter{
	public static void main(String args[]){
		
		JFrame f=new JFrame("frame Demo");
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600,600);
		
		JLabel l2=new JLabel("Username:");
		l2.setBounds(100,25,100,30);
		f.add(l2);
		JTextField t=new JTextField(20);
		t.setBounds(100,50,100,30);
		JLabel l3=new JLabel("Password:");
		l3.setBounds(100,75,100,30);
		f.add(l2);
		JTextField t1=new JTextField(20);
		t1.setBounds(100,100,100,30);
		JButton b1=new JButton("OK");
		b1.setBounds(100,125,100,30);
		JButton b2=new JButton("CANCEL");
		b2.setBounds(100,150,100,30);
		JLabel lab=new JLabel("label");
		lab.setBounds(100,175,100,30);
		f.add(l2);
		f.add(t);
		f.add(l3);
		f.add(t1);
		f.add(b1);
		f.add(b2);
		f.add(lab);
		f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	
	}
}
		
		