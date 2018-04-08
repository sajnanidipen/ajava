import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class TabDemo{
    public static void main(String args[]){
    JFrame f=new JFrame("Frame");
    f.setSize(400,500);
    f.setVisible(true);
    JTabbedPane ip = new JTabbedPane();
    f.add(ip);
    JButton b1=new JButton("b1");
    b1.setBounds(20, 20, 50, 50);  
    JButton b2=new JButton("b2");
    b2.setBounds(40, 40, 50, 50);
    JButton b3=new JButton("b3");
    b3.setBounds(60, 60, 50, 50); 
    ip.add("one",b1);
    ip.add("two",b2);
    ip.add("three",b3);
}
}