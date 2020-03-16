package hostel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

import service.Booking;
import service.Hostel;
import service.Start;

public class MyHome
{
	int single[]= {1,1,0,1,0,1,1,0,0,1};
	int two[]= {2,1,0,2,1,2,0,2,2,1};
	int three[]= {3,2,1,0,1,2,3,2,3,0};
	int singCount=0;
	int twoCount=0;
	int tCount=0;
	int index;
	LocalDate date= LocalDate.now();
	ArrayList<Booking> list=new ArrayList<Booking>();
	Hostel hostel=new Hostel();

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public  void count() throws NumberFormatException, IOException
	{
	for(int i=0;i<10;i++)
	{
		singCount= singCount+(1-single[i]);
		tCount= tCount+(3-three[i]);
		twoCount= twoCount+(2-two[i]);
	}
	System.out.println("SPACE IN SINGLE SHARING ROOM "+singCount);
	System.out.println("SPACE IN DOUBLE SHARING ROOM "+twoCount);
	System.out.println("SPACE IN THREEABLE SHARING ROOM  "+tCount);
	selectRoom();
	}

	public void selectRoom() throws IOException
	{
	
           String select="yes";
	while(select.equalsIgnoreCase("yes"))
	{
		System.out.println("ENTER 1 FOR SINGLE SHARING");
		System.out.println("ENTER 2 FOR DOUBLE SHARING");
		System.out.println("ENTER 3 FOR THREEABLE SHARING ");
		System.out.println("ENTER YOUR CHOICE");
		int choice;
		choice=Integer.parseInt(br.readLine());
	switch(choice)
	{
		case 1 :   book("single");
		             
		            break;
		case 2:    book("two");
		                 break;
		case   3:    book("three");
		            
		               break;
		default: System.out.println("INVALID,ENTER CORRECT CHOICE");
		break;
		
		            

	}
	System.out.println("ENTER YES TO CONTINUE IT WILL TAKE YOU TO THE HOSTELS LIST");
	 select=br.readLine();
	 if(select.equalsIgnoreCase("YES"))
	 {
		 
	hostel.bookStart();
	//Start. mainList();	
	return;
		
	}
	 
	}
	}
	
	public void  book(String s)
	{
		if(s.equalsIgnoreCase("single"))
		{
			for(int i=0;i<10;i++)
			{
				if(single[i]==0)
				{
					single[i]=1;
					index=i;
					Booking book=new Booking(hostel.getName(),hostel.getMobile(),"MyHome Girls Hostel",i,15000,date);
					System.out.println("\n");
					System.out.println("SUCESSFULLY BOOKED YOUR ROOM NUMBER IS "+i);
					book.success(book);
					list.add(book);	
					return;
					
				}
				
			}
			
		}
		if(s.equalsIgnoreCase("two"))
		{
			for(int i=0;i<10;i++)
			{
				if(two[i]==0)
				{
					two[i]=1;
					index=i;
					Booking book=new Booking(hostel.getName(),hostel.getMobile(),"MyHome Girls Hostel",i,10000,date);
					System.out.println("\n");
					System.out.println("SUCESSFULLY BOOKED YOUR ROOM NUMBER IS "+i);
					book.success(book);

					list.add(book);	
					return ;
					
					
				}
				
			}
			
		}
		if(s.equalsIgnoreCase("three"))
		{
			for(int i=0;i<10;i++)
			{
				if(three[i]==0)
				{
					three[i]=1;
					index=i;
					Booking book=new Booking(hostel.getName(),hostel.getMobile(),"MyHome Girls Hostel",i,7000,date);
					System.out.println("\n");
					System.out.println("SUCESSFULLY BOOKED YOUR ROOM NUMBER IS "+i);
					book.success(book);
					list.add(book);	
					return;
					
				}
				
			}
			
		}


		
		
	}
}
	
	
	
	
	

