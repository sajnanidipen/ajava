import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class FrameDemo1 extends WindowAdapter{
	public static void main(String args[]){
		Frame f=new Frame("frame Demo");
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		Label lab=new Label("Hello sycs");
		f.add(lab);
		Button b=new Button("Click Here");  
		b.setBounds(50,100,95,30);  
			f.add(b);  
		
		f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
	}
}