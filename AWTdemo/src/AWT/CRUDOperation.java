package AWT;

import java.awt.*;
import java.awt.event.*;

class crud extends Frame

{
	crud(){
		super("CRUD OPERATION");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
				
			}
		});
	}
	
}
public class CRUDOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crud o=new crud();

	}

}
