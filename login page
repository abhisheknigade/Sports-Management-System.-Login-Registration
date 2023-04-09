import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Connection con=null;
	ResultSet rs=null;
	Statement s=null;
	JTextField temail,tpassword;
	JButton submit,reset,forgetpassword,signup;
	JLabel lemail,lpassword,llogin;
	Login()
	{
		//setContentPane(new JLabel(new ImageIcon("C:\\Users\\ManiSH\\Downloads\\tree.jpg")));
		setLayout(null);
		setSize(1200,800);
		setLocation(70,0);
		setVisible(true);
		llogin=new JLabel("Login Page");
		llogin.setFont(new Font(null, Font.PLAIN,30));
		lemail=new JLabel("Email:");
		lemail.setFont(new Font(null,Font.PLAIN,20));
		lpassword=new JLabel("Password:");
		lpassword.setFont(new Font(null,Font.PLAIN,20));
		temail=new JTextField();
		tpassword=new JTextField();
		submit=new JButton("Submit");
		reset=new JButton("Reset");
		signup=new JButton("Sign Up");
		forgetpassword=new JButton("Forgot Password");
		add(llogin);add(lemail);add(temail);add(lpassword);add(tpassword);
		add(submit);add(reset);add(signup);add(forgetpassword);
		llogin.setBounds(550,200,180,50);
		lemail.setBounds(470,250,80,50);
		temail.setBounds(620,260,150,30);
		lpassword.setBounds(470,300,100,50);
		tpassword.setBounds(620,310,150,30);
		submit.setBounds(450,350,160,30);
		reset.setBounds(650,350,160,30);
		signup.setBounds(450,400,160,30);		
		forgetpassword.setBounds(650,400,160,30);
		submit.addActionListener(this);
		reset.addActionListener(this);
		signup.addActionListener(this);
		reset.addActionListener(this);
		forgetpassword.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent ae)
	{	String ch=ae.getActionCommand();
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","hsy");
			s=con.createStatement();
			String query="select password from registration where username ='"+temail.getText()+"'";
			rs=s.executeQuery(query);
			String getpassword="";
			while(rs.next())
			{
				getpassword=rs.getString(1);
			}
				if(ch == "Submit")
				{
					if(temail.getText().equals("") || tpassword.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Login Failed.Enter Valid Username and Password");
						return;
					}
					if(getpassword.equals(tpassword.getText()))
					{
						JOptionPane.showMessageDialog(null,"Login Successfull");
						new Main();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Login Failed.Enter Valid Username and Password");
					}
				}	
				else if(ch == "Reset")
				{
					temail.setText(null);
					tpassword.setText(null);
				}
				else if(ch == "Sign Up")
				{
					new Register();
				}
				else if(ch == "Forgot Password")
				{
					new ForgotPassword();
				}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	public static void main(String args[])
	{
		new Login();
	}
}
