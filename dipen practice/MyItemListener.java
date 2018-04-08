import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyItemListener{
	public static void main(String args[]){
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(150,150,800,500);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		Color[] arr = {Color.RED,Color.BLUE,Color.GREEN};
		JComboBox jcb = new JComboBox(arr);
		jcb.setBounds(100,100,250,100);
		
		
		//jcb.setSelectedItem("Red");
		
		JLabel lb1 = new JLabel("YO!");
		lb1.setBounds(100,200,100,30);
	
		
		c.add(jcb);
		//c.add(lb1);
		
		ItemListener my= new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				Color clr = (Color)jcb.getSelectedItem();
				c.setBackground(clr);
				//lb1.setText(jcb.getSelectedItem().toString());
				//String clr = lb1.getText();
			}
		};
		
		jcb.addItemListener(my);
		
	}
}