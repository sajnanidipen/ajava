import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class celsius extends WindowAdapter
{
	public static void main(String args[]){
		JFrame f=new JFrame();
		
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(new GridLayout(3,1));
		JPanel p=  new JPanel();
		p.setLayout(new FlowLayout());
		JTextField t1=new JTextField();
		t1.setBounds(50,100,100,20);
		JButton b1=new JButton("Convert into celsius");
		t1.setBounds(50,140,100,20);
		JLabel l1=new JLabel("The value of celsius is:");
		t1.setBounds(50,140,100,20);
		JLabel l2=new JLabel("");
		p.add(l1);
		p.add(l2);
		f.add(t1);
		f.add(b1);
		f.add(l1);
		f.add(l2);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent a){
		float f=Float.parseFloat(t1.getText());
		double c=(5*(f-32))/9;
		l2.setText(String.valueOf(c));
	}
});
}
}