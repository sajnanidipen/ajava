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
	b1.setBounds(200,100,100,20);
	
	JButton b2=new JButton("b2");
	b2.setBounds(200,140,100,20);
	JButton b3=new JButton("b3");
	b3.setBounds(200,180,100,20);
	lp.add(b1,new Integer(2));
	lp.add(b2,new Integer(1));
	lp.add(b3,new Integer(0));
	}
}
	