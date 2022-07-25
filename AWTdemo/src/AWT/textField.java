package AWT;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

public class textField extends Frame {
	
	
	TextField txt;
	
	Label l1,l2;
	
	public textField() {
		super("Alagu");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		txt=new TextField();
		txt.setBounds(10,50,200,30);
		add(txt);
		
		l1=new Label("-----");
		l1.setBounds(300,50,250,30);
		
		l2=new Label("-----");
		l2.setBounds(10,100,250,30);
		
		add(l1);
		add(l2);
		
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		textField o=new textField();

	}

}
