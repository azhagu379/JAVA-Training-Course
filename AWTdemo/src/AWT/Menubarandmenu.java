package AWT;

import java.awt.*;
import java.awt.event.*;
//Menu bar


public class Menubarandmenu extends Frame{
	
	MenuBar m=new MenuBar();
	Menubarandmenu()
	{
		super("Menu");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		
		
		Menu menu=new Menu("Menu");
		Menu submenu=new Menu("sub Menu");
		
		MenuItem i1=new MenuItem("Item 1");
		MenuItem i2=new MenuItem("Item 2");
		MenuItem i3=new MenuItem("Item 3");
		MenuItem i4=new MenuItem("Item 4");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		
		submenu.add(i3);
		submenu.add(i1);
		
		menu.add(submenu);
		m.add(menu);
	
		
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubl
		Menubarandmenu o=new Menubarandmenu();

	}

}
