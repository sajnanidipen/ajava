import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame implements ActionListener
{
	JButton jbt = new JButton("Click");
	Container c;
	MyFrame(){
		c=this.getContentPane();
		c.setLayout(null);
		
		jbt.setBounds(100,100,100,50);
		
		c.add(jbt);
	}
	
	public class act
	
}

class ButtonAction{
	public static void main(String args[]){
		
		MyFrame jf = new MyFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,100,800,500);
		
		
	}
	
}