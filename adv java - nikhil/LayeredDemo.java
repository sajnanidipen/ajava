import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LayeredDemo extends JFrame{
	public static void main(String args[]){
		JFrame f=new JFrame("Demo");
		f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(new BorderLayout());
		JLayeredPane lp=new JLayeredPane();
		f.add(lp);
		
		JButton b1=new JButton("Submit");
		b1.setBounds(100,50,100,30);
		JButton b2=new JButton("Cancel");
		b2.setBounds(120,60,100,30);
		JTextField t2=new JTextField(" ");
		t2.setBounds(140,70,100,30);
		lp.add(b1);
		lp.add(b2);
		lp.add(t2);
		
	}
}	
	
		