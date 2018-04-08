import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyKeyListener{
	public static void main(String args[]){
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(150,150,800,500);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(100,100,100,30);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(200,100,200,200);
		
		c.add(tf);
		c.add(ta);
		
		KeyListener kb = new KeyListener(){
			public void keyTyped(KeyEvent e){
				ta.append("Key Typed:"+e.getKeyChar()+"\n");
			}
			public void keyPressed(KeyEvent e){
				ta.append("Key Pressed:"+e.getKeyChar()+"\n");
			}
			public void keyReleased(KeyEvent e){
				ta.append("Key Released:"+e.getKeyChar()+"\n");
			}
		};
		tf.addKeyListener(kb);
	}
}