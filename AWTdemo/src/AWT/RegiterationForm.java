package AWT;

import java.awt.*;
import java.awt.event.*;

class Registration_form extends Frame
{	// input properties
	
	Label lblTitle,lblName,lblFather,lblAge,lblGender,lblCourse,lblHobbies,lblAddress;
	TextField txtName,txtFather,txtAge;
	TextArea txtAddress;
	
	Checkbox checkMale,checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	
	Choice Course;
	
	Button btnsave,btnClear;
	
	
	
	Registration_form()
	{
		super("User Registration Form");
		setLayout(null);
		setSize(1000,600);
		setVisible(true);
		Color formColor=new Color(53,50,72);
		setBackground(formColor);
		
		// font style
		Font titleFont=new Font("aral",Font.BOLD,25);
		Font labelFont=new Font("aral",Font.PLAIN,18);
		Font textFont=new Font("aral",Font.PLAIN,15);
		
		
		//Resistration form label
		
		lblTitle =new Label("Registration Form");
		lblTitle.setBounds(250,40,300,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.yellow);
		add(lblTitle);
		
		//Name
		
		lblName =new Label("Name");
		lblName.setBounds(250,100,150,30);
		lblName.setFont(labelFont);
		lblName.setForeground(Color.white);
		add(lblName);
		
		txtName =new TextField();
		txtName.setBounds(400,100,400,30);
		txtName.setFont(textFont);
		txtName.setForeground(Color.white);
		add(txtName);
		
		
		//Father Name
		
		lblFather =new Label("Father Name");
		lblFather.setBounds(250,150,150,30);
		lblFather.setFont(labelFont);
		lblFather.setForeground(Color.white);
		add(lblFather);
		
		txtFather =new TextField();
		txtFather.setBounds(400,150,400,30);
		txtFather.setFont(textFont);
		txtFather.setForeground(Color.white);
		add(txtFather);
		
		//age
		
		lblAge =new Label("Age");
		lblAge.setBounds(250,200,150,30);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.white);
		add(lblAge);
		
		txtAge =new TextField();
		txtAge.setBounds(400,200,400,30);
		txtAge.setFont(textFont);
		txtAge.setForeground(Color.white);
		add(txtAge);
		
		//Gender
		lblGender =new Label("Age");
		lblGender.setBounds(250,250,150,30);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.white);
		add(lblGender);
		
		cbg =new CheckboxGroup();
		
		checkMale =new Checkbox("Male",cbg,true);
		checkMale.setBounds(500, 250, 100, 30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.white);
		add(checkMale);
		
		checkFemale =new Checkbox("Female",cbg,true);
		checkFemale.setBounds(600, 250, 100, 30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.white);
		add(checkFemale);
		
		//course
		
		lblCourse =new Label("Course");
		lblCourse.setBounds(250,300,150,30);
		lblCourse.setFont(labelFont);
		lblCourse.setForeground(Color.white);
		add(lblCourse);
		
		Course =new Choice();
		Course.setFont(labelFont);
		Course.setBounds(400, 300, 400, 50);
		Course.add("C");
		Course.add("C++");
		Course.add("JAVA");
		Course.add("C#");
		Course.add("PYTHON");
		add(Course);
		
		//Hoppies
		lblHobbies =new Label("Hobbies");
		lblHobbies.setBounds(250,350,150,30);
		lblHobbies.setFont(labelFont);
		lblHobbies.setForeground(Color.white);
		add(lblHobbies);
		
		Hobbies1=new Checkbox("Drawing");
		Hobbies1.setBounds(400,350,100,50);
		Hobbies1.setFont(labelFont);
		Hobbies1.setForeground(Color.white);
		add(Hobbies1);
		
		
		Hobbies2=new Checkbox("Singing");
		Hobbies2.setBounds(500,350,100,50);
		Hobbies2.setFont(labelFont);
		Hobbies2.setForeground(Color.white);
		add(Hobbies2);
		
		Hobbies3=new Checkbox("Music");
		Hobbies3.setBounds(600,350,100,50);
		Hobbies3.setFont(labelFont);
		Hobbies3.setForeground(Color.white);
		add(Hobbies3);
		
		Hobbies4=new Checkbox("Others");
		Hobbies4.setBounds(700,350,100,50);
		Hobbies4.setFont(labelFont);
		Hobbies4.setForeground(Color.white);
		add(Hobbies4);
		
		//textArea
		lblAddress =new Label("Address");
		lblAddress.setBounds(250,400,150,30);
		lblAddress.setFont(labelFont);
		lblAddress.setForeground(Color.white);
		add(lblAddress);
		
		txtAddress=new TextArea(10,20);
		txtAddress.setBounds(400, 400, 400, 100);
		txtAddress.setFont(labelFont);
		add(txtAddress);
		
		//button save
		btnsave =new Button("Save Details");
		btnsave.setBounds(400, 530, 150, 30);
		btnsave.setFont(labelFont);
		btnsave.setBackground(Color.BLUE);
		btnsave.setForeground(Color.white);
		add(btnsave);
		// button clear
		btnClear =new Button("Clear All");
		btnClear.setBounds(560, 530, 150, 30);
		btnClear.setFont(labelFont);
		btnClear.setBackground(Color.red);
		btnClear.setForeground(Color.white);
		add(btnClear);
		
		
		
		
		// close window
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
				
			}
		});
	}
}
public class RegiterationForm {

	public static void main(String[] args) {
		
		// create object Registration_form
		Registration_form frm=new Registration_form();

	}

}
