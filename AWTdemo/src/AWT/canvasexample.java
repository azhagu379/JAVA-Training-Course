package AWT;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

class Mycanvas extends Canvas{
	
	Mycanvas(){
		setBackground(Color.GRAY);
		setSize(300,200);
		
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(75, 75, 150, 75);
	}
	
	
}
public class canvasexample extends Frame {
	
	public canvasexample() {
		super("This is Canvas");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		add(new Mycanvas());
	
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		canvasexample o=new canvasexample();
		

	}

}
