import java.util.Scanner;

public class Day3Q2 {


	public static void main(String[] args) {
     
		String fName;
		String lName;
		int yearsOfservice;
		int x;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first and last name: ");
		fName= scan.next();
		lName=scan.next();
		
		
		System.out.println("Enter your salary: ");
		x = scan.nextInt();
		
		
		System.out.println("Enter years of service: ");
	    yearsOfservice = scan.nextInt();
		
		if(yearsOfservice > 5) {
			System.out.println ("Your bonus is: ");
			System.out.println(x + 0.5 );
		
		}
		else {
			System.out.println("The years of service are less than 5");
			
		}
	}

}
