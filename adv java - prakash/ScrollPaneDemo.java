import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class ScrollPaneDemo{
    public static void main(String args[]){
    JFrame f=new JFrame("Frame");
    f.setSize(400,500);
    f.setVisible(true);    
    boolean v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED ;
    boolean h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED ;
    JTextArea b1=new JTextArea("b1");
    b1.setBounds(20, 20, 50, 50); 
    JScrollPane ip = new JScrollPane(b1,v, h) ;
    f.add(ip);
  
    
}
}