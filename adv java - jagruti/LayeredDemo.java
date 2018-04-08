import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LayeredPaneDemo{
	public static void main(String args[]){
	JFrame f=new JFrame("Frame");
	f.setSize(400,300);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLayeredPane lp=new JLayeredPane();
	f.add(lp);
	JButton b1=new JButton("b1");
	b1.setBounds(20,20,50,50);
	
	JButton b2=new JButton("b2");
	b2.setBounds(40,50,50,50);
	JButton b3=new JButton("b3");
	b3.setBounds(60,80,50,50);
	lp.add(b1,new Integer(2));
	lp.add(b2,new Integer(1));
	lp.add(b3,new Integer(0));
	}
}
	