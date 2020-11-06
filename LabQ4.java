import java.util.Scanner;

public class LabQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Write a java program that reads the user input
  //as integer and display natural numbers in reverse order
		int number=0;
		int reversenumber=0;
		
		//get the input from the user
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		number=scan.nextInt();
		
		//while loop to find the logic of reverse number
		while(number !=0) {
			reversenumber = reversenumber*10;
			reversenumber = reversenumber + number%10;
			number = number/10;
			}
		//print out the result
		System.out.println("The reverse is "+ reversenumber);
	}

}
