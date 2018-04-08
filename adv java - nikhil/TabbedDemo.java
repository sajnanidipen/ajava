import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TabbedDemo {
	public static void main(String args[]){
		JFrame f=new JFrame("Demo");
		f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(new BorderLayout());
		JTabbedPane lp=new JTabbedPane();
		f.add(lp);
		
		
		JButton b1=new JButton("Submit");
		
		JButton b2=new JButton("Cancel");
		
		
		
		lp.add("one",b1);
		lp.add("two",b2);
		
		
	}
}	
	
		