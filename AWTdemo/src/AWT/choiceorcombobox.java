package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;


//choice in java AWT
class chorcombo extends Frame implements ActionListener{

	Choice c;
	Button b;
	Label lbl;
	chorcombo(){
		super("Choice");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		c=new Choice();
		c.setBounds(10,50,100,100);
		c.add("C");
		c.add("C++");
		c.add("JAVA");
		c.add("PYTHON");
		c.add("PHP");
		add(c);
		
		b=new Button("show the details");
		b.setBounds(120,50,100,20);
		add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dat="Programming Language Selected:"+c.getItem(c.getSelectedIndex());
				lbl.setText(dat);
				
			}
		});


		lbl=new Label("Empty");
		lbl.setBounds(10,70,300,30);
		add(lbl);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
				
			}
			
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		
	}
	
	
}
public class choiceorcombobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		chorcombo o=new chorcombo();

	}

}
