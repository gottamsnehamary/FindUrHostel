package controller;
import java.io.*;

public class Login 
{
	String email1;
	String password1;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public Login(String email, String password) 
	{
		email1=email;
		password1=password;
	
	}
	public boolean check() throws IOException
	{
	
		System.out.println("\n");
		System.out.println("ENTER YOUR EMAIL");
		String name=br.readLine(); 
		System.out.println("\n");
		System.out.println("ENTER YOUR PASSWORD");
		String password=br.readLine();
		System.out.println("\n");
		if((name.equals(email1))&&(password.equals(password1)))
		{
			return true;
			
		}
		else
		{
			//System.out.println("Incorrect email or password");
			return false;
	    }
	}
}
