import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
class celsius{
	public static void main(String args[]){
	JFrame f=new JFrame();
	JButton b1=new JButton("Convert into celsius");
	f.add(b1);
	JLable L1=new JLable("The value of celsius is:");
	f.add(L1);
	JTextField t=new JTextField();
	f.add(t);
	f.setVisible(true);
	f.setSize(1230,500);
	f.setLayout(null);
}
}