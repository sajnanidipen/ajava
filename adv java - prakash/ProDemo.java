import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class ProDemo{
    public static void main(String args[]){
    JFrame f=new JFrame("Frame");
    f.setSize(400,500);
    f.setVisible(true);
    JLayeredPane ip = new JLayeredPane();
    f.add(ip);
    JButton b1=new JButton("b1");
    b1.setBounds(20, 20, 50, 50);  
    JButton b2=new JButton("b2");
    b2.setBounds(40, 40, 50, 50);
    JButton b3=new JButton("b3");
    b3.setBounds(60, 60, 50, 50); 
    ip.add(b1,new Integer(2));
    ip.add(b2,new Integer(1));
    ip.add(b3,new Integer(0));
}
}