package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.sun.rowset.internal.Row;

import service.Booking;

public class Excel {
	
		
		  private static String[] columns = {"ROOM NO.", "COST","DATE"};
		  
		  private static List<Booking> booking = new ArrayList<Booking>();
		  
		
		  public void writefromExcel()  throws IOException{

			
//			  booking.add(new Booking("Abc","12345","JG hostel", 123, 450));
			  
			  //Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		
		//Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Hostels");
		
		// Create a Row
	    XSSFRow headerRow = sheet.createRow(0);

	    for (int i = 0; i < columns.length; i++) {
	      Cell cell = headerRow.createCell(i);
	      cell.setCellValue(columns[i]);
	    }
	    
	 // Create Other rows and cells with contacts data
	    int rowNum = 1;

	    for (Booking bookings : booking) {
	      XSSFRow row = sheet.createRow(rowNum++);
	      row.createCell(0).setCellValue(bookings.getRoomNo());
	      row.createCell(1).setCellValue(bookings.getCost());
	      row.createCell(2).setCellValue(bookings.getDate());
	
	    }
	    
	    // Resize all columns to fit the content size
	    for (int i = 0; i < columns.length; i++) {
	      sheet.autoSizeColumn(i);
	    }
	   
	    FileOutputStream out = new FileOutputStream(new File("Hostel.xlsx"));
	    workbook.write(out);
	    out.close();
	    workbook.close();
	    

	  }

	}



