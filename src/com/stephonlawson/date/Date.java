package com.stephonlawson.date;

public class Date {

	public static void main(String[] args) {
		
		// Date in American Standard Format
		
		
		int year = 2017;
			
		String weekday = "Friday, ";
		String weekday2 = "Friday ";
		String date = "15, ";
		String date2 = "15 " ;
		String month = "December ";
	    
		System.out.println("Date in American Standard Format: ");
		System.out.print(weekday + month + date + year);
	    System.out.println(".");  
	                              // output is Friday, December 15, 2017.
	    
	    System.out.println();    // break
		
        System.out.println("American format:");  
        System.out.println(weekday + month + date + year);
        
        System.out.println();      // break 
        
        System.out.println("European format:");   // European format: 
        System.out.println(weekday2 + date2 + month + year);  // Friday 15 December 2017 
        
	    
	}

}
