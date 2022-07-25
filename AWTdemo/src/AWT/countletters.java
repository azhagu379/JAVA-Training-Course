package AWT;

import java.awt.*;
import java.awt.event.*;

class countletterandword extends Frame implements ActionListener
{
	
	Label l1,l2;
	TextArea t;
	Button b;
	
	
	public countletterandword() {
		// TODO Auto-generated constructor stub
		
		super("Word & Letter count");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		
		l1=new Label("---");
		l1.setBounds(20, 30, 200, 20);
		add(l1);
		
		l2=new Label("---");
		l2.setBounds(20, 60, 200, 20);
		add(l2);
		
		t=new TextArea(10,20);
		t.setBounds(20, 100, 300, 200);
		add(t);
		
		b=new Button("Count");
		b.setBounds(20, 320, 100, 30);
		b.addActionListener(this);
		add(b);
		
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
		
		String text=t.getText();
		String[] words=text.split("\\s");
		l1.setText("Word:"+words.length);
		l2.setText("Characters: "+text.length());
		
	
		
	}
	
}

public class countletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countletterandword o=new countletterandword();

	}

}
