package service;
import java.io.*;
import java.util.ArrayList;

import controller.Login;
import controller.SignUp;
import hostel.VivantaGirlsHstl;

public class Hostel
{
	String name;
	String mobile;
	String email;
	String password;
	
	public Hostel(String name, String mobile, String email, String password) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		
	}


	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

		ArrayList<String> list=new ArrayList<String>();
		
		public void add() throws IOException
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE PASSWORD TO ADD HOSTEL INTO THE LIST");
			String password=br.readLine();
			if(password.equals("snehalatha"))
			{
				System.out.println("ENTER HOSTEL NAME");
				String hostel=br.readLine();
				list.add(hostel);
				System.out.println("HOSTEL ADDED SUCESSFULLY");
				
			}
			else
			{
				System.out.println("INVALID..!! ENTER CORRECT PASSWORD");
				
			}
		}
		
		public void display()
		{
			System.out.println("HOSTELS LIST");
			
			for(String s:list)
			{
				System.out.println(s);
			}
			
		}	
		
		
		public void remove() throws IOException
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE PASSWORD TO ADD HOSTEL INTO THE LIST");
			String password=br.readLine();
			if(password.equals("snehalatha"))
			{
				display();
				System.out.println("ENTER HOSTEL NAME");
				String hostel=br.readLine();
				if(list.contains(hostel))
				{
			             list.remove(hostel);
			             System.out.println("HOSTEL REMOVED SUCESSFULLY");
				}
				else
					System.out.println("HOSTEL NAME NOT FOUND IN THE LIST");
		
			}
		}
		
		public  void bookStart() throws NumberFormatException, IOException
		{   
			
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int i=1;
			for(String s:list)
			{
				System.out.println("Enter "+i+"  for "+s);
				i++;
				
			}
			System.out.println("ENTER YOUR CHOICE");
			int choice =Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:   VivantaGirlsHstl vh=new VivantaGirlsHstl();
			          vh.count();
				      break;
			case 2:    VivantaGirlsHstl vh1=new VivantaGirlsHstl();
	                   vh1.count();
				      break;
			case 3:    VivantaGirlsHstl vh2=new VivantaGirlsHstl();
	                    vh2.count();
				      break;
	         default:
	        	      System.out.println("INVALID CHOICE...!!");
	        	      bookStart();
	        	      break;
			}
			
		}
			
		
		
		
		
		public Hostel() {
		// TODO Auto-generated constructor stub
	}


		public  boolean start()throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int choice;
		
			boolean b=true;
			while(b)
				{	
				System.out.println("<< WELCOME TO FIND MY HOSTEL SERVICES>> ");
				System.out.println("1.ENTER 1 SIGNUP");
				System.out.println(" 2.ENTER 2 LOGIN");
				System.out.print("ENTER YOUR CHOICE  ");
		
				choice=Integer.parseInt(br.readLine());
		
				switch(choice) 
				{
					case 1 :  SignUp su = new SignUp();
					boolean b1=su.registration();
					if(b1)
					{
						System.out.println("SUCESSFULLY REGISTERED");
						System.out.println("PLEASE LOGIN TO CONTINUE");
						System.out.println("\n");
	        	
	        	  
						Login log=new Login(email,password);
						boolean b2=log.check();
					
						//System.out.println(b2);
						b=false;
					}
					else
					{
						System.out.println("ENTER CORRECT EMAIL AND PASSWORD TO SIGN UP");
						start();
					}
					break;
		      
		
					case 2 :   Login log = new Login(email,password);
								boolean c = log.check();
							    if(c)
							    {
							    	//System.out.println(c);
							    	b=false;
							    	return c;
							  
							    }
							    else
							    {
							    	b=true;
							    }
									
								break;
		
		
		default: System.out.println("INVALID CHOICE , CHOOSE FROM THE OPTIONS");
		            b=true;
		           break;
		
					}//switch
				
	
				}//while
			return true;
	
			
		}
	
}
