package AWT;

import java.awt.*;
import java.awt.event.*;

//text Area
class tx extends Frame implements ActionListener{
	
	TextArea t;
	Label l;
	TextField tf;
	Button b;
	
	tx(){
		super("Alagu");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		l=new Label("--");
		l.setBounds(20, 50, 300, 30);
		
		
		// multi line 
		t=new TextArea(10, 30);
		t.setBounds(20, 100, 300, 200);
		
		
		//single line typing
		tf=new TextField(20);
		tf.setBounds(20, 350, 300, 30);
		
		b=new Button("Click");
		b.setBounds(20,400,100,30);
		b.addActionListener(this);
		
		
		add(t);
		add(l);
		add(b);
		add(tf);
		
		//close button
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
		
		//l.setText(t.getText());
		
		// append the text
		//t.append(tf.getText());
		// cursor blink place add the string
		t.insert(tf.getText(),t.getCaretPosition());
		
	}
	
	
	
	
}

public class TextArea1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tx o=new tx();

	}

}
