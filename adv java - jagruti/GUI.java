import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI{
	public static void main(String []args){
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(new GridLayout(3,1));
		JPanel p1=new JPanel();
		p1.setLayout(new FlowLayout());
		/*JPanel p2=new JPanel();
		p1.setLayout(new )*/
		JTextField t=new JTextField();
		JButton b=new JButton("Convert to celsius");
		JLabel l1=new JLabel("The value in celsius is:");
		JLabel l2=new JLabel("");
		p1.add(l1);
		p1.add(l2);
		f.add(t);
		f.add(b);
		f.add(p1);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				float f=Float.parseFloat(t.getText());
				double c=(5*(f-32))/9;
				l2.setText(String.valueOf(c));
			}
		});
	}
}