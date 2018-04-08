import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class EditorPaneDemo{
    public static void main(String args[]){
    JFrame f=new JFrame("Frame");
    f.setSize(400,500);
    f.setVisible(true);
    JEditorPane ep = new JEditorPane();
    ep.setContentType("text/html");
    ep.setText("<h1>Hello</h1>");
    f.add(ep);

}
}