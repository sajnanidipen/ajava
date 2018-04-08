import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class demo1{
	static JTextField t1,t2;
	static JLabel l1;
	
	
	public static void main (String args[]){
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setLayout(new GridLayout(4,1));
		f.setSize(300,300);
		JPanel p = new JPanel(new FlowLayout());
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		JLabel l2 = new JLabel("number1");
		JLabel l3 = new JLabel("number2");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		p.add(l2);
		p.add(t1);
		
		p1.add(l3);
		p1.add(t2);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		f.add(p);
		f.add(p1);
		f.add(p2);
	}
}
		
		
		
		
		