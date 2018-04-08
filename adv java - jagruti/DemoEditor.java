import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class DemoEditor{
	public static void main(String args[]){
	JFrame f=new JFrame("Frame");
	f.setSize(400,300);
	f.setVisible(true);
	//f.setLayout(new BorderLayout());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JEditorPane ep=new JEditorPane();
	ep.setContentType("text/plain");
	ep.setContentType("text/html");
	ep.setText("<h1>hello</h1>");
	f.add(ep);
	}
}