import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class login extends WindowAdapter{
Frame f;
login(){
f=new Frame("login");
		Label n=new Label("Name:",Label.CENTER);
        Label p=new Label("Address:",Label.CENTER);
		Label g=new Label("Gender:",Label.CENTER);
		CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("male", cbg, true);    
        checkBox1.setBounds(150,180, 50,20);    
        Checkbox checkBox2 = new Checkbox("female", cbg,false);    
        checkBox2.setBounds(150,200, 55,20);    
        TextField name=new TextField(20);
        TextField pass=new TextField(20);
		Label m=new Label("mobile no:",Label.CENTER);
        TextField mob=new TextField(20);
        Button b1=new Button("submit");
        Button b2=new Button("cancel");
		Label h=new Label("Hobbies:",Label.CENTER);
		h.setBounds(70,230, 50,20); 
		 Checkbox c3 = new Checkbox("Cricket");  
        c3.setBounds(150,230, 65,20);  
        Checkbox c4 = new Checkbox("Football", true);  
        c4.setBounds(150,250, 65,20);
		 Checkbox c5 = new Checkbox("basketball");  
        c5.setBounds(150,270, 65,20);  
        Checkbox c6 = new Checkbox("TT");  
        c6.setBounds(150,290, 65,20);
        f.add(n);
        f.add(name);
        f.add(p);
        f.add(pass);
        f.add(b1);
        f.add(b2);
		f.add(m);
		f.add(mob);
		f.add(g);
		f.add(checkBox1);
		f.add(checkBox2);
		f.add(pass);
        f.add(h);
        f.add(c3);
		f.add(c4);
		f.add(c5);
		f.add(c6);
        n.setBounds(70,90,50,20);
        p.setBounds(70,120,50,20);
        name.setBounds(150,90,90,20);
        pass.setBounds(150,120,120,20);
		m.setBounds(70,150,55,20);
		mob.setBounds(150,150,90,20);
        b1.setBounds(100,320,70,40);
        b2.setBounds(180,320,70,40);
		g.setBounds(70,180,50,20);
f.setLayout(null);
f.addWindowListener(this);
f.setSize(400,400);
f.setVisible(true);
}
public void windowClosing(WindowEvent we){
	System.exit(0);
}
public static void main(String args[]){
	new login();
}
}