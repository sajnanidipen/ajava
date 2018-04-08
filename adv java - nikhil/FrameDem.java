
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class FrameDem extends WindowAdapter{
	Frame f=new Frame("frame Demo");
	public static void main(String args[]){
	DefaultListModel df=new DefaultListModel();
		df.addElement("FY");
		df.addElement("SY");
		df.addElement("TY");
		JList j1=new JList(df);
		j1.setSelectedIndex(0);
		j1.setVisibleRowCount(2);
		j1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		f.add(j1);
		f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}
		