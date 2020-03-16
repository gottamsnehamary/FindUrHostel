package service;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking 
{
	private String name;
	private String number;
	private String hostel;
	private int  roomNo;
	private  int cost;
	private LocalDate date;	public Booking(String name, String number, String hostel, int roomNo, int cost, LocalDate date) {
		//public Booking(String name, String number, String hostel, int roomNo, int cost) {

		super();
		this.name = name;
		this.number = number;
		this.hostel = hostel;
		this.roomNo = roomNo;
		this.cost = cost;
		this.date = date;
	}
	
	Hostel h= new Hostel();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getHostel() {
		return hostel;
	}
	public void setHostel(String hostel) {
		this.hostel = hostel;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void success( Booking  s)
	{
		System.out.println(s.getRoomNo()+"\t"+s.getCost()+"\t"+s.getDate());
			//System.out.println(s.getName()+"\t+"+s.getNumber()+"\t"+s.getHostel()+"\t"+s.getRoomNo()+"\t"+s.getCost()+"\t"+s.getDate());
}
	
	
	

}
