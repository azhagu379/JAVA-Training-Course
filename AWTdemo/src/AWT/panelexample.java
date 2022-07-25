package AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class pa extends Frame{
	
	pa()
	{
		super("Panel");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		
		Panel panel =new Panel();
		panel.setBounds(40,80,200,200);
		panel.setBackground(Color.gray);
		
		
		Button b1=new Button("Button 1");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.BLUE);
		
		Button b2=new Button("Button 1");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.GREEN);
		panel.add(b2);
		panel.add(b1);
		add(panel);
		
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
			
		});
	}
	
}
public class panelexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pa o=new pa();

	}

}
