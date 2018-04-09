import javax.swing.*;
import java.awt.*;

public class SwingBasics{
	public static void main(String args[]){
		
		//Part 1 - JFrame
		// //1
		// JFrame jf = new JFrame();
		// jf.setVisible(true);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// //2
		// //jf.setSize(800,500);
		// //jf.setLocation(150,75);
		
		// jf.setBounds(200,100,500,300);
		
		// //4
		// jf.setTitle("My JFrame Demo");
		
		// //5
		// ImageIcon icon = new ImageIcon("Railway Logo.png");
		// jf.setIconImage(icon.getImage());
		
		// //6
		// Container c = jf.getContentPane();
		// c.setBackground(Color.BLUE);
		
		// //7
		// jf.setResizable(false);
		
		//Part 2 - JLabel
		
		// JFrame jf = new JFrame();
		// jf.setVisible(true);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// jf.setBounds(150,200,700,500);
		
		// jf.setTitle("JLabel Demo");
		
		// Container c = jf.getContentPane();
		// c.setLayout(null);
		
		// //ImageIcon icon = new ImageIcon("Dipen.png");
		
		// //JLabel lb = new JLabel(icon);
		// //lb.setText("Dipen!!");
		// //lb.setBounds(100,50,250,250);
		
		// //Font ff = new Font("Arial",Font.ITALIC,50);
		// //lb.setFont(ff);
		
		// ImageIcon icon1 = new ImageIcon("Dipen.png");
		// JLabel lb2 = new JLabel("Dipen Here",icon1,JLabel.CENTER);
		// lb2.setBounds(100,50,200,200);
		
		// c.add(lb2);
		
		//Part 3- JTextField
		
		// JFrame jf = new JFrame();
		// jf.setVisible(true);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf.setBounds(150,150,800,500);
		
		// Container c=jf.getContentPane();
		// c.setLayout(null);
		
		// // JTextField tf = new JTextField();
		// // tf.setBounds(100,100,250,30);
		
		// // Font ff = new Font("Arial",Font.ITALIC,50);
		// // tf.setFont(ff);
		
		// // tf.setBackground(Color.YELLOW);
		// // tf.setForeground(Color.RED);
		
		// // JPasswordField jpf = new JPasswordField();
		// // jpf.setBounds(100,100,250,30);
		
		
		
		// c.add(jpf);
		
		//Part 4 - JButton
		
		// JFrame jf = new JFrame();
		// jf.setVisible(true);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf.setBounds(150,150,800,500);
		
		// Container c=jf.getContentPane();
		// c.setLayout(null);
		
		// JButton jbt = new JButton("Click Me!");
		// jbt.setBounds(100,50,100,40);
		
		// Cursor cur = new Cursor(Cursor.HAND_CURSOR);
		// jbt.setCursor(cur);
		
		// c.add(jbt);
		
		//Part 5 - JRadioButton
		
		// JFrame jf = new JFrame();
		// jf.setVisible(true);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf.setBounds(150,150,800,500);
		
		// Container c=jf.getContentPane();
		// c.setLayout(null);
		
		// JRadioButton rb1 = new JRadioButton("Male");
		// rb1.setBounds(100,100,100,30);
		
		// JRadioButton rb2 = new JRadioButton("Female");
		// rb2.setBounds(200,100,100,30);
		
		// ButtonGroup gender = new ButtonGroup();
		// gender.add(rb1);
		// gender.add(rb2);
		
		// rb1.setSelected(true);
		// rb2.setEnabled(false);
		
		// c.add(rb1);
		// c.add(rb2);
		
		//Part 6- JCheckBox
		
		// JFrame jf = new JFrame();
		// jf.setVisible(true);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf.setBounds(150,150,800,500);
		
		// Container c=jf.getContentPane();
		// c.setLayout(null);
		
		// JCheckBox cb1 = new JCheckBox("Hindi");
		// cb1.setBounds(100,100,100,30);
		
		// JCheckBox cb2 = new JCheckBox("Marathi");
		// cb2.setBounds(200,100,100,30);
		
		// cb1.setSelected(true);
		// cb2.setEnabled(false);
		
		// c.add(cb1);
		// c.add(cb2);
		
		//Part 7 -JComboBox
		
		// JFrame jf = new JFrame();
		// jf.setVisible(true);
		// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jf.setBounds(150,150,800,500);
		
		// Container c=jf.getContentPane();
		// c.setLayout(null);
		
		// String[] arr = {"A","B","C","D"};
		// JComboBox jcb = new JComboBox(arr);
		// jcb.setBounds(100,100,100,50);
		
		// jcb.setSelectedItem("A");
		
		// jcb.addItem("E");
		
		// c.add(jcb);
		
		//Part 8-JTextArea
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(150,150,800,500);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JTextArea jta = new JTextArea();
		jta.setBounds(100,100,100,200);
		
		c.add(jta);
	}
}