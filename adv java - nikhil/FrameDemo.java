//using swing toolkit
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameDemo extends WindowAdapter{
	public static void main(String args[]){
		JFrame f=new JFrame("frame Demo");
	
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		JLabel l1=new JLabel("First name:");
		l1.setBounds(100,50,70,30);
		JTextField t1=new JTextField(20);
		t1.setBounds(150,50,70,30);
		f.add(l1);
		f.add(t1);
		//JLabel lab=new JLabel("Hello sycs");
		
		JLabel l2=new JLabel("Last name:");
		l1.setBounds(100,150,70,30);
		JTextField t2=new JTextField(20);
		t2.setBounds(200,150,70,30);
		f.add(l2);
		f.add(t2);
		JLabel l3=new JLabel("Gender");
		l3.setBounds(100,200,70,30);
		f.add(l3);
		JRadioButton r=new JRadioButton("male");
		r.setBounds(100,250,70,30);
		JRadioButton r1=new JRadioButton("female");
		r1.setBounds(100,300,70,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r);
		bg.add(r1);
		f.add(r);
		f.add(r1);
		JLabel l4=new JLabel("Languages");
		l4.setBounds(100,350,70,30);
		f.add(l1);
		   JCheckBox checkBox1 = new JCheckBox("C++");  
        checkBox1.setBounds(100,200, 60,30);  
        JCheckBox checkBox2 = new JCheckBox("Java", true);  
        checkBox2.setBounds(100,250, 60,30);  
        f.add(checkBox1);  
        f.add(checkBox2);  
			

		
		
		
		
		DefaultListModel df=new DefaultListModel();
		df.addElement("FY");
		df.addElement("SY");
		df.addElement("TY");
		JList j1=new JList(df);
		j1.setSelectedIndex(0);
		j1.setVisibleRowCount(2);
		j1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		f.add(j1);
		f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
	}
}