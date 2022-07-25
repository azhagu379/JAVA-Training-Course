package AWT;

import java.awt.*;
import java.awt.event.*;

public class Addtwonumber extends Frame implements ActionListener {
	
	
	Label l1,l2,l3;
	TextField txt1,txt2;
	Button btn;
	public Addtwonumber() {
		// TODO Auto-generated constructor stub
		
		super("Alagu");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		l1=new Label("Enter the Value 1:");
		l1.setBounds(10,50,100,30);
		
		txt1=new TextField();
		txt1.setBounds(150,50,250,30);
		
		
		l2=new Label("Enter the Value 1:");
		l2.setBounds(10,100,100,30);
		
		txt2=new TextField();
		txt2.setBounds(150,100,250,30);
		
		btn=new Button("Click me");
		btn.setBounds(150,150,100,30);
		btn.addActionListener(this);
		
		l3=new Label("---");
		l3.setBounds(150,200,150,100);
		
		
		
		add(l1);
		add(l2);
		add(txt1);
		add(txt2);
		add(btn);
		add(l3);
		
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1=txt1.getText();
		String s2=txt1.getText();
		
		if(s1.isEmpty() || s2.isEmpty())
		{
			l3.setText("Please Enter the data");
		}
		else {
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=a+b;
			String result=String.valueOf(c);
			l3.setText("Total "+result);
		}
		
		
	}
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addtwonumber o=new Addtwonumber();

	}

	

}
