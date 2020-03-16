package controller;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import service.Hostel;

public class SignUp 
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	public boolean registration() throws IOException
	{
		System.out.println("ENTER YOUR NAME");
		String name= br.readLine();
		System.out.println("ENTER YOUR PHONE NUMBER");
		String mobile=br.readLine();
		System.out.println("ENTER YOUR EMAIL");
		String email=br.readLine();
		System.out.println("ENTER YOUR PASSWORD");
		String password=br.readLine();
		System.out.println("ENTER CONFIRM PASSWORD");
		String confirmPassword=br.readLine();
		if((mobileValidation(mobile))&&(emailValidation(email))&&(passwordValidation(password,confirmPassword)))
		{
			Hostel h=new Hostel(name,mobile,email,password);
			h.setName(name);
			h.setMobile(mobile);
		
			return true;
			
		}
		
		else
		{
			return false;
			
		}
		
		
	}
	public boolean mobileValidation( String mobile)
	{
	        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
	  
	        Matcher m = p.matcher(mobile); 
	        return (m.find() && m.group().equals(mobile)); 
	    } 
	
	public boolean emailValidation(String email)
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
	private boolean passwordValidation(String password, String confirmPassword) 
	{
		if(password.length()==0)
			return false;
			if(!(password.equals(confirmPassword)))
				return false;
			if(!((password.length()>=8)&&(password.length()<=20)))
	              return false;
	              char a[]=password.toCharArray();
	         int capital=0;
	         int lower=0;
	         int num=0;
	         int special=0;
	         for(int i=0;i<password.length();i++)
	         {
	        	 if((a[i]>=65)&&(a[i]<=90))
	        		 capital ++;
	        	 else if((a[i]>=97)&&(a[i]<=122))
	        		 lower ++;
	        	 else if((a[i]>=48)&&(a[i]<=58))
	        		 num ++;
	        	 else
	        		 special ++;
	        		 
	         }
	         if((capital>0)&&(lower>0)&&(num>0))
	         {
	        	 return true;
	         }
		      else
		      {
		    	  System.out.println("INVALID,PASSWORD MUST CONTAIN UPPERCASE LOWERCASE AND NUMBERS ");
		    	  return false;
		   
		      }
	}
	
}
