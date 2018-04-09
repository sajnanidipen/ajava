import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TGUI{
	public static void main(String[] args){
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(300,300);
		f.setLayout(new GridLayout(4,1));
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		p1.setLayout(new GridLayout(1,2));
		p2.setLayout(new GridLayout(1,2));
		p3.setLayout(new FlowLayout());
		p4.setLayout(new FlowLayout());
		JLabel l1=new JLabel("Number 1",JLabel.CENTER);
		JLabel l2=new JLabel("Number 2",JLabel.CENTER);
		JLabel l3=new JLabel("The Value is: ");
		JLabel l4=new JLabel("");
		JTextField t1=new JTextField("");
		JTextField t2=new JTextField("");
		JButton b1=new JButton("Modulus");
		JButton b2=new JButton("Cube");
		JButton b3=new JButton("+, Even or Odd");
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p4.add(l3);
		p4.add(l4);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		
		ActionListener a=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((t1.getText()).equals("") || (t2.getText()).equals("")){
					l4.setText("Please enter some value");
				}
				else{
					int num1=Integer.parseInt(t1.getText());
					int num2=Integer.parseInt(t2.getText());
					if(e.getSource()==b1){
						l4.setText(String.valueOf(num1%num2));
					}
					else if(e.getSource()==b2){
						l4.setText(String.valueOf(num1*num1*num1));
					}
					else if(e.getSource()==b3){
						int add=num1+num2;
						if(add%2==0){
							l4.setText("Even");
						}
						else{
							l4.setText("Odd");
						}
					}
				}
			}
		};
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
	}
}
