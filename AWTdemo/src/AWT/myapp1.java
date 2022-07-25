package AWT;

import java.awt.Button;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class app extends Frame implements ActionListener{
	
	//3rd approch
	Button btn;
	
	//label
	Label lbl,l1,l2,l3;
	
	//checkbox
	Checkbox c1,c2,c3;
	
	app()
	{
		super("Alagu");
		setSize(1000,600);
		setLayout(null);
		
		btn=new Button("Click me");
		btn.setBounds(75,75,200,50);
		add(btn);
		btn.addActionListener(this);
		
		lbl=new Label("--");
		lbl.setBounds(75,150,200,50);
		add(lbl);
		setVisible(true);
		
		c1=new Checkbox("C program");
		c1.setBounds(10,50,250,30);
		
		l1=new Label("Not Selected");
		l1.setBounds(300,100,200,50);
		
		c2=new Checkbox("C++ program");
		c2.setBounds(10,100,250,30);
		
		l2=new Label("Not Selected");
		l2.setBounds(300,150,200,50);

		
		c3=new Checkbox("Java program");
		c3.setBounds(10,150,250,30);
		
		l3=new Label("Not Selected");
		l3.setBounds(300,200,200,50);
		
		c1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l1.setText((e.getStateChange()==1?"Checked":"unchecked"));
				
			}
		});
		c2.addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						l2.setText((e.getStateChange()==1?"Checked":"unchecked"));
						
					}
				});
		c3.addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						l3.setText((e.getStateChange()==1?"Checked":"unchecked"));
						
					}
				});
		
		add(c1);
		add(l1);
		add(c2);
		add(l2);
		add(c3);
		add(l3);
		
		
		// Closing button
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
		
		lbl.setText("Button Clicked");
		
	}
}

public class myapp1 {
	 //2 approch
	/*Button btn;
	myapp1()
	{
		super("Alagu");
		setSize(1000,600);
		setLayout(null);
		
		btn=new Button("Click me");
		
		btn.setBounds(75,75,200,50);
		
		add(btn);
		
		setVisible(true);
		
	}*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		app frm=new app();

	}

}
