package service;
import java.io.*;
import java.io.IOException;
//import java.util.ArrayList;
//
//
//import hostel.VivantaGirlsHstl;
//import hostel.MyHome;
//import excel.Excel;


public class Start {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		
		Hostel h=new Hostel();
		h.start();
		// h.hostelList();
		// mainList();
		 
		 
		 String choice="yes";
		 while(choice.equalsIgnoreCase("yes"))
		 {
			 
			 System.out.println("1 . ENTER ONE FOR HOSTEL ADDITION INTO THE LIST");
			 System.out.println("2 . ENTER TWO FOR REMOVING HOSTEL FROM THE LIST");
			 System.out.println("3 . ENTER THREE FOR DISPLAYING HOSTELS IN THE LIST");
			 System.out.println("4 . ENTER FOUR TO BOOK HOSTEL FROM THE LIST");
			// System.out.println("5. Generate Excel");
			 System.out.println("ENTER YOUR CHOICE");
			 int pick =Integer.parseInt(br.readLine());
			 switch(pick)
			 {
			 case 1: h.add();
			           break;
			 case 2:h.remove();
			           break;
			 case 3:h.display();
			             break;
			 case 4:h.bookStart();
			          break;
			// case 5: 
			//	 Excel e =new Excel();
			 //		e.writefromExcel();
			 //		break;
			  default :System.out.println("INVALID ,CHOOSE CORRECT OPTION");
			          
			          break;
			  
			 }
			 System.out.println("IF YOU WANT TO CONTINUE ,TYPE YES ");
			 choice=br.readLine();
		 }
		 
	}
	
	
	
	
	/*public static void mainList() throws NumberFormatException, IOException
	{  
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		int option;
			System.out.println("ENTER YOUR CHOICE: ");
			option=Integer.parseInt(br.readLine());
			switch(option)
			{
			case 1:System.out.println("YOU HAVE SELECTED  VIVANTA GIRLS HOSTEL");
					System.out.println("SPACE VACANT IN THE HOSTEL");
					VivantaGirlsHstl k=new VivantaGirlsHstl();
		             k.count();
		             break;
			case 2: System.out.println("YOU HAVE SELECTED  MYHOME GIRLS HOSTEL");
					System.out.println("SPACE VACANT IN THE HOSTEL");
					MyHome j=new MyHome();
					j.count();
					break;
					
			default:System.out.println("INVALID ,CHOOSE CORRECT OPTION");
						break;
					
			}
			
		}
		*/
	}
