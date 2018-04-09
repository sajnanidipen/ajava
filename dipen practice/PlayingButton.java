import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayingButton{
	public static void main(String args[]){
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(150,150,800,500);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JButton jbt1 = new JButton("Yellow");
		jbt1.setBounds(100,50,100,40);
		
		JButton jbt2 = new JButton("Red");
		jbt2.setBounds(200,50,100,40);
		
		JButton jbt3 = new JButton("Blue");
		jbt3.setBounds(300,50,100,40);
		
		//Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		//jbt.setCursor(cur);
		
		c.add(jbt1);
		c.add(jbt2);
		c.add(jbt3);
		
		ActionListener a = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==jbt1){
					c.setBackground(Color.YELLOW);
				}
				
				if(e.getSource()==jbt2){
					c.setBackground(Color.RED);
				}
				
				if(e.getSource()==jbt3){
					c.setBackground(Color.BLUE);
				}
				
			}
		};
		
		jbt1.addActionListener(a);
		jbt2.addActionListener(a);
		jbt3.addActionListener(a);
		
			
	}
	
}