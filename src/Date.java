//==========================================//
// Author: Dennis Khounviengxay             //
// Name:   DayofWeek - Date                 //
// Class:  Computer Programming 2 COMP-2240 //
// Date:   10-03-2018                       //
//==========================================//

/**************************************************************
 * A class called Date that does things using a provided date *
 **************************************************************/

import static java.lang.System.out;

class Date
{
	private int month = 0;
	private int day   = 0;
	private int year  = 0;	
	
	/*****************
	 *    Getters    *
	 *****************/
/*	protected int getMonth() {
        return month;
    }
	protected int getDay() {
        return day;
    }
	protected int getYear() {
    	return year;
    }
    
    /*****************
     *    Setters    *
     *****************/
/*	protected void setMonth(int x) {
    	month = x;
    }
	protected void setDay(int y) {
    	day = y;
    }
	protected void setYear(int z) {
    	year = z;
    }
    
	/******************************
	 * Constructors of class Date *
	 ******************************/
    // Default
	protected Date()
	{
		month = 1;
		day   = 1;
		year  = 1900;
	}

	// Accepts inputs from DriverClass
	protected Date(int x, int y, int z)
	{
		month = x;
		day   = y;
		year  = z;
	}
	
/***************************************
 * Methods to be called by DriverClass *
 ***************************************/
	
	/**********************************************************************
	 * Method that displays the date and whether or not it is a Leap Year *
	 **********************************************************************/
	protected void display()
	{
		out.println();
		out.println("Month is: " + month);
		out.println("  Day is: " + day);
		out.println(" Year is: " + year);
		out.println( (calcLeapYear()) ? " " + year + " is a Leap Year!" : " " + year + " is not a Leap Year.");
	
	}	// End display()
	
	
	/***********************************************
	 * Method that checks if a year is a Leap Year *
	 ***********************************************/
	private boolean calcLeapYear()
	{
		boolean checkLY = false;
		
		if ((year % 400) == 0) {      // If divisible by 400, then Leap Year
			checkLY = true;
		}
		
		else if ((year % 100) == 0) { // If divisible by 100 (and not 400), then not Leap Year
			checkLY = false;
		}
		
		else if ((year % 4) == 0) {   // If divisible by 4, then Leap Year
			checkLY = true;
		}
		
		else {                        // Not a Leap Year
			checkLY = false;
		}
		
		return checkLY;
		
	}	// End calcLeapYear()
	
	
	/**************************************************************************************
	 * Method that determines the amount of days between 1/1/1900 and some arbitrary date *
	 **************************************************************************************/
	private int totalofDays()
	{
		int totalDays = 0;  // Total days from 1900 to target date	
		int setYear = year; // Copies "year" into "setYear" to save the target year.
		
		
		// Array that holds the amount of days in each month (excluding December)
		// (0 at index 0 since there is no month 0;  January = month 1)
		
		final int monthDay[] = {0,31,28,31,30,31,30,31,31,30,31,30};
		
		//=======================================================//
		// Adds 365 or 366 days for each year starting from 1900 //
		//=======================================================//
		
		// Modifies "year" instead of "setYear" since "year" is used in calcLeapYear()
		// Loops, adding to "year" until target year (the "setYear") is reached
		
		for (year = 1900; year < setYear; ++year)
		{
			if (calcLeapYear() != true) {
				totalDays += 365; // Non-Leap Years have 365 days
			}
			
			else {
				totalDays += 366; // Leap Years have 366 days
			}
		}
		
		//===============================================================//
		// Adds each individual month for the target year (via an array) //
		//===============================================================//
		
		// "count" is representative of each month (excluding December) of the year
		
		// {count = 1} means {monthDay[1]} which then means {add January (31) to totalDays}
		
		for (int count = 0; (count < month); count++)
		{
			
			totalDays += monthDay[count];             // Adds each individual month's total days by going up the array
			
			if (count == 2 && calcLeapYear() ) {      // Adds 1 if the target year is a Leap Year
				totalDays += 1;
			}
			
		}
		
		//===============================//
		// Adds the current month's days //
		//===============================//
		totalDays += day;
		
		
		return totalDays;
		
	}	// End totalofDays
	
	/*****************************************************************************************************
	 * Method that takes the total days from totalofDays() and determines which day it is, then prints it *
	 *****************************************************************************************************/
	protected void dayofWeek()
	{
		
		out.printf("%d/%d/%d was a ",month,day,year);
		
		switch ( (totalofDays() % 7) )
		{
		case 0:
			out.print("Sunday");
			break;
			
		case 1:
			out.print("Monday");
			break;
			
		case 2:
			out.print("Tuesday");
			break;
			
		case 3:
			out.print("Wednesday");
			break;
			
		case 4:
			out.print("Thursday");
			break;
			
		case 5:
			out.print("Friday");
			break;
			
		case 6:
			out.print("Saturday");
			break;	
		}
		
		out.println("\n");
		
	}	// End dayofWeek()
	
	
}		// End class Date




