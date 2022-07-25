package AWT;

import java.awt.*;
import java.awt.event.*;

public class radiobtc extends Frame {

	
	Label l1,l2;
	Checkbox c1,c2;
	CheckboxGroup g1;
	
	radiobtc()
	{
		super("Alagu");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		g1=new CheckboxGroup();
	
		c1=new Checkbox("Male",g1,false);
		c1.setBounds(10,50,250,30);
		
		l1=new Label("Not Selected");
		l1.setBounds(300,50,600,30);
		
		
		c2=new Checkbox("Female",g1,false);
		c2.setBounds(10,100,250,30);
		
		l2=new Label("Not Selected");
		l2.setBounds(300,100,600,30);
		
		c1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l1.setText(e.getStateChange()==1?"Checked":"unchecked");
				l2.setText("unchecked");
				
			}
		});
		c2.addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						l2.setText(e.getStateChange()==1?"Checked":"unchecked");
						l1.setText("unchecked");
						
					}
				});
		
		add(c1);
		add(c2);
		add(l2);
		add(l1);
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radiobtc n=new radiobtc();
		
		

	}

}
