//==========================================//
// Author: Dennis Khounviengxay             //
// Name:   DayofWeek - DriverClass          //
// Class:  Computer Programming 2 COMP-2240 //
// Date:   10-03-2018                       //
//==========================================//

/*********************************************************************************
 * A program that calls methods from class Date to determine various date things *
 *********************************************************************************/

//import static java.lang.System.out;
//import java.util.Scanner;

public class DriverClass
{
	public static void main(String[] args)
	{	
		/*******************
		 *     Objects     *
		 *******************/
		
		Date defaultDate  = new Date();            // Default date ( 1, 1,1900)
		
		/*
		// Leap-Year Assignment
		Date objectDate1  = new Date( 9,12,1997);  // First date - Not a Leap Year
		Date objectDate2  = new Date(12,12,2012);  // Second date - Is a Leap Year
		*/
		
		// Day-of-the-Week Assignment
		Date objectDate3  = new Date(10, 8,2018);  // (Today)
		Date objectDate4  = new Date( 7, 4,1976);  // Date 1
		Date objectDate5  = new Date( 1, 1,2000);  // Date 2
		Date objectDate6  = new Date( 9, 2,1945);  // Date 3
		Date objectDate7  = new Date( 8,26,1968);  // Date 4
		
		
		/***********************************************************************
		 * Calling methods from class Date to create objects and display stuff *
		 ***********************************************************************/
		/*
		defaultDate.display();
		objectDate1.display();
		objectDate2.display();
		*/
		
		objectDate3.dayofWeek();
		objectDate4.dayofWeek();
		objectDate5.dayofWeek();
		objectDate6.dayofWeek();
		objectDate7.dayofWeek();

	}	// End main()

}		// End class DriverClass



