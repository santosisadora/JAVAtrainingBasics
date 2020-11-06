import java.util.Scanner;

public class LabQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		//ask the input from user
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year:");
        year=scan.nextInt();
        
        //if the year is divisable by 4 it is a leap year
        if(year%4==0) {
        	System.out.println("It´s a Leap year!");
        }
        //display a message in case it´s not a leap year
        else {
        	System.out.println("It´s not a leap year.");
        }
	}

}
