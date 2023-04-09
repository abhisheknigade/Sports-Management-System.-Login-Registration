import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ForgotPassword extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Connection con=null;
	ResultSet rs=null;
	Statement s=null;
	JTextField temail,tphno;
	JLabel ltitle,lemail,lphno;
	JButton bsubmit,breset;
	public String chkemail="";
	public long chkphno;
	ForgotPassword()
	{
		setLayout(null);
		setSize(1200,800);
		setVisible(true);
		ltitle=new JLabel("Forgotten Password");
		ltitle.setFont(new Font("Serif",Font.PLAIN,35));
		ltitle.setForeground(Color.BLUE);
		lemail=new JLabel("Enter Your Email-ID :");
		lemail.setFont(new Font("Serif",Font.PLAIN,20));
		lphno=new JLabel("Enter Your Ph. No.    :");
		lphno.setFont(new Font("Serif",Font.PLAIN,20));
		temail=new JTextField();
		tphno=new JTextField();
		bsubmit=new JButton("Submit");
		breset=new JButton("Reset");
		add(ltitle);add(lemail);add(lphno);add(temail);
		add(tphno);add(bsubmit);add(breset);
		ltitle.setBounds(465, 200, 300, 50);
		lemail.setBounds(380, 270, 200, 50);
		temail.setBounds(600, 283, 170, 30);
		lphno.setBounds(380,310,200,50);
		tphno.setBounds(600,323,170,30);
		bsubmit.setBounds(420, 360, 160, 30);
		breset.setBounds(600, 360, 160, 30);
		bsubmit.addActionListener(this);
		breset.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		String ch=e.getActionCommand();
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample","postgres","hsy");
			s=con.createStatement();
			String query="select email from registration where email ='"+temail.getText()+"'";
			rs=s.executeQuery(query);
			if(ch == "Submit")
			{
				if(rs.next())
				{
					chkemail=rs.getString(1);
					chkphno=rs.getInt(4);
					if(chkphno==Long.parseLong(tphno.getText()))
						new NewPassword();
					else
						JOptionPane.showMessageDialog(null,"Invalid Details");
				}	
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Details");
				}
			}
			if(ch == "Reset")
			{
				temail.setText(null);
				tphno.setText(null);
			}
		}	
		catch(Exception ev)
		{
			System.out.println(ev);
		}
	}
	public static void main(String arg[])
	{
		ForgotPassword fp=new ForgotPassword();
	}
}
