package AWT;

import java.awt.event.*;
import java.awt.*;

class listawt extends Frame implements ActionListener{

	List lst;
	Button btn;
	Label lbl;
	listawt()
	{
		super("List box");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		lst=new List(4,true);
		lst.setBounds(10,50,100,100);
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("Mars");
		lst.add("pluto");
		add(lst);
		
		lbl=new Label("Empty Label");
		lbl.setBounds(200,170,300,30);
		add(lbl);
		
		btn=new Button("Show the Details");
		btn.setBounds(10,170,100,30);
		add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String list[]=lst.getSelectedItems();
				String data="Selected Plannet:";
				for(String x:list)
						data=data+x+",";
				lbl.setText(data);
				
			}
		});
		
		
		
		
		
		
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

public class listawtjava {
	
	public static void main(String[] args) {
		listawt o=new listawt();
	}
		
	}


