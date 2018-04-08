import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class DemoMenuBar{
	public static void main(String args[]){
	JFrame f=new JFrame("Frame");
	f.setSize(400,300);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JRootPane rp=new JRootPane();
	JMenuBar mb=new JMenuBar();
	JMenu m= new JMenu("file");
	m.add("open");
	m.add("close");
	m.add("save");
	m.add("save as");
	mb.add(m);
	rp.setJMenuBar(mb);
	f.add(rp);
	}
}