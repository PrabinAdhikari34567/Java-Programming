package circumferenceofcircle;

import java.util.Scanner;

public class prabin {

	public static void main (String args []){
		Scanner buna =new Scanner (System.in);
		muna m1 = new muna ();
		System.out.println("Enter Diameter");
		double d = buna.nextDouble();
		
		double area = 3.14*d;
		
		System.out.println("Area of circle :"+m1.fMessage(area));
	}
	
	
	
	
}
