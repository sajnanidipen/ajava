import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TabbedPaneDemo{
	public static void main(String args[]){
	JFrame f=new JFrame("Frame");
	f.setSize(400,400);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JTabbedPane tp=new JTabbedPane();
	f.add(tp);
	JButton b1=new JButton("b1");
	b1.setBounds(20,20,50,50);
	
	JButton b2=new JButton("b2");
	b2.setBounds(40,40,50,50);
	JButton b3=new JButton("b3");
	b3.setBounds(60,60,50,50);
	tp.add("one",b1);
	tp.add("two",b2);
	tp.add("three",b3);
	}
}