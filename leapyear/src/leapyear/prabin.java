package leapyear;

import java.util.Scanner;

public class prabin {

	
	public static void main (String args []){
		muna m1 = new muna ();
		Scanner buna  =new Scanner (System.in);
		
		System.out.println("Enter Year \n");
		int year = buna.nextInt();
		
	// leap year
		
		if ((year % 400 == 0) || (year % 4 == 0)&& (year % 100!=0)){
			
			System.out.println("Year "+ year+" is a leap year ."+m1.check(year));
		}
		
		else {
			
			System.out.println("Year "+year+" is not a leap year.");
		}
		
		
		
		
		
		
	
	
	
	
	}
	
	
	
}
