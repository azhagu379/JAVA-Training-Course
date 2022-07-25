package AWT;

import java.awt.*;

public class myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello worls");
		
		Frame frm =new Frame("Alagu ");
		
		// fram size
		frm.setSize(1000, 600); //w,h
		frm.setLayout(null);
		
		
		Button btn=new Button("click me");
		
		btn.setBounds(75,75,200,50); //x,y,w,h
		frm.add(btn);
		
		frm.setVisible(true);
	}

}
