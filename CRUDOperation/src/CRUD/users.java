package CRUD;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.sql.*;






class UserFrame extends Frame implements ActionListener
{
	Label lblTitle,lblId,lblName,lblCity,lblAge,lblStatus;
	TextField txtName,txtId,txtCity,txtAge;
	Button btnsave,btnClear,btnDelete;
	
	String qry="";
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs=null;
	Statement stmt=null;
	
	
	//Database Connection
	public void connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//mysql connector
			//localhost database name 
			String url="jdbc:mysql://localhost:3306/awt?characterEncoding=utf8";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	public void clear() {
		txtId.setText("");
		txtName.setText("");
		txtAge.setText("");
		txtCity.setText("");
		txtId.setText("");
		txtName.requestFocus();
	}

	
		UserFrame()
		{ 
			connect();
			this.setVisible(true);
			this.setSize(1000, 600);
			this.setLayout(null);
			this.setTitle("User Management");
			Color formColor=new Color(50,59,72);
			setBackground(formColor);
			
			Font titleFont=new Font("aral",Font.BOLD,25);
			Font labelFont=new Font("aral",Font.PLAIN,18);
			Font textFont=new Font("aral",Font.PLAIN,15);
			
			
			//Resistration form label
			
			lblTitle =new Label("User Management");
			lblTitle.setBounds(250,40,300,50);
			lblTitle.setFont(titleFont);
			lblTitle.setForeground(Color.yellow);
			add(lblTitle);
			
			lblId =new Label("ID");
			lblId .setBounds(200,100,150,30);
			lblId .setFont(labelFont);
			lblId .setForeground(Color.white);
			add(lblId );
			
			txtId =new TextField();
			txtId.setBounds(400,100,400,30);
			txtId.setFont(textFont);
			
			txtId.addActionListener(this);
			add(txtId);
			
			lblName =new Label("Name");
			lblName.setBounds(200,150,150,30);
			lblName.setFont(labelFont);
			lblName.setForeground(Color.white);
			add(lblName);
			
			txtName =new TextField();
			txtName.setBounds(400,150,400,30);
			txtName.setFont(textFont);
			
			add(txtName);
			
			lblAge =new Label("Age");
			lblAge.setBounds(200,200,150,30);
			lblAge.setFont(labelFont);
			lblAge.setForeground(Color.white);
			add(lblAge);
			
			txtAge =new TextField();
			txtAge.setBounds(400,200,400,30);
			txtAge.setFont(textFont);
			
			add(txtAge);
			
			lblCity =new Label("City");
			lblCity.setBounds(200,250,150,30);
			lblCity.setFont(labelFont);
			lblCity.setForeground(Color.white);
			add(lblCity);
			
			txtCity =new TextField();
			txtCity.setBounds(400,250,400,30);
			txtCity.setFont(textFont);
			
			add(txtCity);
			
			btnsave=new Button("Save");
			btnsave.setBounds(400, 300, 100, 30);
			btnsave.setBackground(Color.BLUE);
			btnsave.setForeground(Color.white);
			btnsave.setFont(labelFont);
			btnsave.addActionListener(this);
			add(btnsave);
			
			btnClear=new Button("Clear");
			btnClear.setBounds(520, 300, 100, 30);
			btnClear.setBackground(Color.ORANGE);
			btnClear.setForeground(Color.white);
			btnClear.setFont(labelFont);
			btnClear.addActionListener(this);
			add(btnClear);
			
			btnDelete=new Button("Delete");
			btnDelete.setBounds(640, 300, 100, 30);
			btnDelete.setBackground(Color.red);
			btnDelete.setForeground(Color.white);
			btnDelete.setFont(labelFont);
			btnDelete.addActionListener(this);
			add(btnDelete);
			
			
			lblStatus =new Label("-------------------");
			lblStatus.setBounds(400,350,300,30);
			lblStatus.setFont(labelFont);
			lblStatus.setForeground(Color.white);
			add(lblStatus);
			
			
			
			
			
			
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
		
		try{
			
			String id =txtId.getText();
			String name =txtName.getText();
			String age =txtAge.getText();
			String city =txtCity.getText();
			
			if(e.getSource().equals(txtId))
			{
				qry="select Id,Name,Age,City from users where Id="+txtId.getText();
				stmt=con.createStatement();
				rs=stmt.executeQuery(qry);
				if(rs.next()) {
					txtId.setText(rs.getString("Id"));
					txtName.setText(rs.getString("Name"));
					txtAge.setText(rs.getString("Age"));
					txtCity.setText(rs.getString("City"));
				}
				else {
					clear();
					lblStatus.setText("Invalid Id");
				}
			}
			
			
			
		
		if(e.getSource().equals(btnClear)) {
			clear();
			lblStatus.setText("-----");
		}
		else if(e.getSource().equals(btnsave)) {
			
			if(id.isEmpty()||id.equals(""))
			{	//Save details
				qry="insert into users (Name,Age,City)values(?,?,?)";
				st=con.prepareStatement(qry);
				st.setString(1, name);
				st.setString(2, age);
				st.setString(3, city);
				st.executeUpdate();
				clear();
				
				
				
				lblStatus.setText("Data Insert Success");
				
			}
			else
			{
				//update Details
				qry="update users set Name=?,Age=?,City=? where Id=?";
				st=con.prepareStatement(qry);
				st.setString(1, name);
				st.setString(2, age);
				st.setString(3, city);
				st.setString(4, id);
				st.executeUpdate();
				clear();
				lblStatus.setText("Data updated Success");
			}
			
			
		}
		else if(e.getSource().equals(btnDelete))
		{
			//Delete details
			if(!id.isEmpty()||!id.equals("")) {
				qry="delete from users where Id=?";
				st=con.prepareStatement(qry);
				st.setString(1, id);
				st.executeUpdate();
				clear();
				lblStatus.setText("Data Deleted Success");
				
			}
			else {
				lblStatus.setText("Please Enter The Correct Id");
			}
			
			
		}
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
}
public class users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserFrame frm=new UserFrame();

	}

}
