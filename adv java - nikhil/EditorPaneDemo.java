import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EditorPaneDemo extends JFrame{
	public static void main(String args[]){
		JFrame f=new JFrame("Demo");
		f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(new BorderLayout());
		JEditorPane ep=new JEditorPane();
		
		ep.setContentType("text/plain");
		//ep.setContentType("text/html");
		ep.setText("<b><u>Hello</b></u>");
		f.add(ep);
		
	}
}	
	