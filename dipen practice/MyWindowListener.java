import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindowListener{
	public static void main(String args[]){
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(150,150,800,500);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(20,100,100,50);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(200,100,200,200);
		
		c.add(tf);
		c.add(ta);
		
		WindowListener wb = new WindowListener(){
			public void windowOpened(WindowEvent e){
				ta.append("windowOpened\n");
			}
			public void windowClosed(WindowEvent e){
				ta.append("windowClosed\n");
			}
			public void windowClosing(WindowEvent e){
				ta.append("windowClosing\n");
			}
			public void windowIconified(WindowEvent e){
				ta.append("windowIconified\n");
			}
			public void windowDeiconified(WindowEvent e){
				ta.append("windowDeiconified\n");
			}
			public void windowActivated(WindowEvent e){
				ta.append("windowActivated\n");
			}
			public void windowDeactivated(WindowEvent e){
				ta.append("windowDeactivated\n");
			}
			
		};
		tf.addWindowListener(wb);
		
		
	}
}