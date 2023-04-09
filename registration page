import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Register extends JFrame implements ActionListener
{
	Connection con;
	ResultSet rs;
	Statement st;
	String query;
	JLabel lregister,lname,ldob,lgender,lphno,ladd,lqual,loccu,lemail,lpassword,lconpass,ldob2;
	JLabel e1,e2,e3,e4,e5,e6;
	JTextField tname,tdob,tphno,tadd,tqual,toccu,temail;
	JPasswordField tpassword,tconpass;
	JButton bsignup,breset,blogin;
	JRadioButton male,female,other;
	JCheckBox tc;
	ButtonGroup g;
	Register()throws Exception
	{
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\ManiSH\\Downloads\\tree.jpg")));
		//try
		//{
		//Class.forName("org.postgresql.Driver");
		//con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/register","postgres","hsy");
		//st=con.createStatement();
		//}
		//catch(Exception e)
		//{
		//	System.out.print(e);
		//}
		setTitle("Registration Form");
		setVisible(true);
		setLocation(300,100);
		setSize(800,700);
		setLayout(null);
		lregister=new JLabel("Create A New Account");
		lregister.setFont(new Font("Serif", Font.PLAIN, 30));
		lname=new JLabel("Full Name : ");
		ldob=new JLabel("Date of Birth : ");
		ldob2=new JLabel("(MM/DD/YYYY)");
		lgender=new JLabel("Gender : ");
		lphno=new JLabel("Ph Number : ");
		ladd=new JLabel("Address : ");
		lqual=new JLabel("Qualification : ");
		loccu=new JLabel("Occupation : ");
		lemail=new JLabel("Email : ");
		lpassword=new JLabel("Password : ");
		lconpass=new JLabel("Confirm Password : ");
		tname=new JTextField(20);
		tdob=new JTextField(10);
		tphno=new JTextField(10);
		tadd=new JTextField(50);
		tqual=new JTextField(20);
		toccu=new JTextField(20);
		temail=new JTextField(30);
		tpassword=new JPasswordField(20);
		tconpass=new JPasswordField(20);
		bsignup=new JButton("SignUp");
		breset=new JButton("Reset");
		blogin=new JButton("LogIn");
		male=new JRadioButton("Male");
		male.setActionCommand("Male");
		female=new JRadioButton("Female");
		female.setActionCommand("Female");
		other=new JRadioButton("Other");
		other.setActionCommand("Other");
		tc=new JCheckBox("Terms and Conditions");
		e1=new JLabel("");
		e1.setForeground(Color.RED);
		e2=new JLabel("");
		e2.setForeground(Color.RED);
		e3=new JLabel("");
		e3.setForeground(Color.RED);
		e4=new JLabel("");
		e4.setForeground(Color.RED);
		e5=new JLabel("");
		e5.setForeground(Color.RED);
		e6=new JLabel("");
		e6.setForeground(Color.RED);
		g=new ButtonGroup();
		add(lname);add(ldob);add(ldob2);add(lgender);add(lphno);add(ladd);add(lqual);add(loccu);add(lemail);
		add(lpassword);add(lconpass);add(tname);add(tdob);add(tphno);add(tadd);add(tqual);add(toccu);	
		add(temail);add(tpassword);add(tconpass);add(bsignup);add(breset);add(blogin);add(male);add(female);add(other);
		g.add(male);g.add(female);g.add(other);add(tc);add(lregister);
		lregister.setBounds(100,20,300,30);
		lname.setBounds(100,60,100,20);
		tname.setBounds(220,60,150,20);
		ldob.setBounds(100,90,100,20);
		ldob2.setBounds(100,110,100,20);
		tdob.setBounds(220,90,150,20);
		lgender.setBounds(100,140,100,20);
		male.setBounds(220,140,55,20);
		female.setBounds(270,140,67,20);
		other.setBounds(335,140,60,20);
		lphno.setBounds(100,170,100,20);
		tphno.setBounds(220,170,150,20);
		ladd.setBounds(100,200,100,20);
		tadd.setBounds(220,200,150,20);
		lqual.setBounds(100,230,100,20);
		tqual.setBounds(220,230,150,20);
		loccu.setBounds(100,260,100,20);
		toccu.setBounds(220,260,150,20);
		lemail.setBounds(100,290,100,20);
		temail.setBounds(220,290,150,20);
		lpassword.setBounds(100,320,100,20);
		tpassword.setBounds(220,320,150,20);
		lconpass.setBounds(100,350,120,20);
		tconpass.setBounds(220,350,150,20);
		tc.setBounds(140,380,200,20);
		bsignup.setBounds(130,410,90,30);
		breset.setBounds(245,410,90,30);
		blogin.setBounds(185,442,90,30);
		male.setSelected(true);
		bsignup.addActionListener(this);
		breset.addActionListener(this);
		blogin.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lregister.setForeground(Color.GREEN);
		lname.setForeground(Color.WHITE);
		ldob.setForeground(Color.WHITE);
		ldob2.setForeground(Color.WHITE);
		lgender.setForeground(Color.WHITE);
		lphno.setForeground(Color.WHITE);
		ladd.setForeground(Color.WHITE);
		lqual.setForeground(Color.WHITE);
		loccu.setForeground(Color.WHITE);
		lemail.setForeground(Color.WHITE);
		lpassword.setForeground(Color.WHITE);
		lconpass.setForeground(Color.WHITE);
		tc.setBackground(new Color(0,0,0,0));
	}
	int checkName()
	{
		String chkname=tname.getText();
		int flag=0,i;
		if(chkname.length()==0)
		{
			e1.setText("*FILL CORRECTLY");
			add(e1);
			e1.setBounds(380,60,120,20);
			return 1;
		}
		for(i=0;i<chkname.length();i++)
		{
			if(chkname.charAt(i)=='0' || chkname.charAt(i)=='1' || chkname.charAt(i)=='2' || chkname.charAt(i)=='3' || chkname.charAt(i)=='4' || chkname.charAt(i)=='5' || chkname.charAt(i)=='6' || chkname.charAt(i)=='7' || chkname.charAt(i)=='8' || chkname.charAt(i)=='9')
			{
				e1.setText("*FILL CORRECTLY");
				add(e1);
				e1.setBounds(380,60,120,20);
				return 1;
			}
		}
		e1.setText("");
		add(e1);
		e1.setBounds(380,60,120,20);
		return 0;
	}	
	int checkDate()
	{
		String chkdob=tdob.getText();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		try
		{
			Date d1 = sdf.parse(chkdob);
			e2.setText("");
			add(e2);
			e2.setBounds(380,90,120,20);
			return 0;
		}
		catch (Exception e)
		{
			e2.setText("*FILL CORRECTLY");
			add(e2);
			e2.setBounds(380,90,120,20);
			return 1;
		}
	}
	int checkPhno()
	{
		String chkphno=tphno.getText();
		int i;
		for(i=0;i<chkphno.length();i++);
		try
		{	
			Long.parseLong(chkphno);
			if(i==10)
			{
				e3.setText("");
				add(e3);
				e3.setBounds(380,170,120,20);
				return 0;
			}
			else
			{
				e3.setText("*FILL CORRECTLY");
				add(e3);
				e3.setBounds(380,170,120,20);
				return 1;
			}
		}
		catch(Exception e)
		{
			e3.setText("*FILL CORRECTLY");
			add(e3);
			e3.setBounds(380,170,120,20);
			return 1;
		}	
	}
	public static boolean checkEmail(String email) 
    	{ 
        	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
       		Pattern pat = Pattern.compile(emailRegex); 
        	if (email == null) 
        	    return false; 
       		return pat.matcher(email).matches(); 
    	} 
	int checkPassword()
	{
		String chkpass=tpassword.getText();
		String chkconpass=tconpass.getText();
		if(chkpass.length()<8)
		{
			e5.setText("*MINIMUM 8 CHARACTERS");
			e6.setText("*MINIMUM 8 CHARACTERS");
			add(e5);add(e6);
			e5.setBounds(380,320,160,20);
			e6.setBounds(380,350,160,20);
			tpassword.setText("");
			tconpass.setText("");
			return 1;
		}
		else if(!chkpass.equals(chkconpass))
		{
			e5.setText("*NOT MATCH");
			e6.setText("*NOT MATCH");
			add(e5);add(e6);
			e5.setBounds(380,320,120,20);
			e6.setBounds(380,350,120,20);
			tpassword.setText("");
			tconpass.setText("");
			return 1;
		}
		else
		{
			e5.setText("");
			e6.setText("");
			add(e5);add(e6);
			e5.setBounds(380,320,120,20);
			e6.setBounds(380,350,120,20);
			return 0;
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		int f1,f2,f3,f4;
		if(e.getSource()==bsignup)
		{
		if(tc.isSelected())
		{
			tc.setForeground(Color.BLACK);
			add(tc);
			f1=checkName();
			f2=checkDate();
			f3=checkPhno();
			if(checkEmail(temail.getText()))
			{
				e4.setText("");
				add(e4);
				e4.setBounds(380,290,120,20);
			}
			else
			{
				e4.setText("*FILL CORRECTLY");
				add(e4);
				e4.setBounds(380,290,120,20);
			}
			f4=checkPassword();
			if(f1==0 && f2==0 && f3==0 && f4==0 && checkEmail(temail.getText())
				&& tadd.getText().length()!=0 && tqual.getText().length()!=0
				&& toccu.getText().length()!=0)
			{
			int input=JOptionPane.showConfirmDialog(null,"Name = "+tname.getText()+"\nDOB = "+tdob.getText()+"\nGender = "+g.getSelection().getActionCommand()+"\nPh Number = "+tphno.getText()+"\nAddress = "+tadd.getText()+"\nQualification = "+tqual.getText()+"\nOccupation = "+toccu.getText()+"\nEmail = "+temail.getText(),"Confirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
			if(input == 0)
			{
			try
			{
				st.executeUpdate("insert into Register values('"+tname.getText()+"','"+tdob.getText()+"','"+g.getSelection().getActionCommand()+"','"+tphno.getText()+"','"+tadd.getText()+"','"+tqual.getText()+"','"+toccu.getText()+"','"+temail.getText()+"','"+tpassword.getText()+"','"+tconpass.getText()+"')");				
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			JOptionPane.showMessageDialog(null,"Account Created","Sent to Database",JOptionPane.INFORMATION_MESSAGE);
			new Login();
			}
			}
			else
				JOptionPane.showMessageDialog(null,"All Fields Are Mendatory,\nFill Data Correctly","Error Message",JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			add(tc);
			JOptionPane.showMessageDialog(null,"Accept Terms And Conditions","Error Message",JOptionPane.INFORMATION_MESSAGE); 
			tc.setForeground(Color.RED);
		}
		}
		if(e.getSource()==breset)
		{
			male.setSelected(true);
			tname.setText("");
			tdob.setText("");
			tphno.setText("");
			tadd.setText("");
			tqual.setText("");
			toccu.setText("");
			temail.setText("");
			tpassword.setText("");
			tconpass.setText("");
		}
		if(e.getSource()==blogin)
		{
			new Login();
		}
	}
	private int length(String text) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String args[])throws Exception
	{
		new Register();
	}
}
