import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends WindowAdapter{
	public static void main(String args[]){
		JFrame f=new JFrame("Demo");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		JRootPane rp=new JRootPane();
		JMenuBar mb=new JMenuBar();
		JMenu m=new JMenu("File");
		m.add("open");
		m.add("close");
		m.add("save");
		m.add("Save as");
		mb.add(m);
		rp.setJMenuBar(mb);
		f.add(rp);
	}
}

		