import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMouseListener{
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
		
			// MouseListener mb = new MouseListener(){
			// public void mouseEntered(MouseEvent e){
				// ta.append("mouseEntered\n");
			// }
			// public void mouseExited(MouseEvent e){
				// ta.append("mouseExited\n");
			// }
			// public void mouseClicked(MouseEvent e){
				// ta.append("mouseClicked\n");
			// }
			// public void mousePressed(MouseEvent e){
				// ta.append("mousePressed\n");
			// }
			// public void mouseReleased(MouseEvent e){
				// ta.append("mouseReleased\n");
			// }
			
			MouseMotionListener mb1 = new MouseMotionListener(){
				public void mouseMoved(MouseEvent e){
					ta.append("Mouse Moved at:"+e.getX()+" "+e.getY()+"\n");
				}
				public void mouseDragged(MouseEvent e){
					ta.append("Mouse Dragged at:"+e.getX()+" \n"+e.getY());
				}
			};
		//};
		tf.addMouseMotionListener(mb1);
	}
}