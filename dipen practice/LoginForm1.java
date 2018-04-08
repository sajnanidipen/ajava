import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm1{
	public static void main(String args[]){
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(150,150,800,500);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JLabel lb1 = new JLabel("Username:");
		lb1.setBounds(100,100,100,50);
		
		JTextField jtf1 = new JTextField();
		jtf1.setBounds(200,120,100,30);
		
		JLabel lb2 = new JLabel("Password:");
		lb2.setBounds(100,150,100,50);
		
		JTextField jtf2 = new JTextField();
		jtf2.setBounds(200,170,100,30);
		
		JButton jbt1 = new JButton("Login");
		jbt1.setBounds(150,250,100,40);
		
		JTextArea result = new JTextArea();
		result.setBounds(175,300,200,50);
		
		c.add(lb1);
		c.add(jtf1);
		c.add(lb2);
		c.add(jtf2);
		c.add(jbt1);
		
		ActionListener a = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==jbt1){
					
					c.setBackground(Color.YELLOW);
					
					String uname = jtf1.getText();
					String upass = jtf2.getText();
					
					
					result.setText("Username:"+uname+" "+"\nPassword:"+upass);
					c.add(result);
					
				}
			}
		};
		
		jbt1.addActionListener(a);
		
	}
	
}