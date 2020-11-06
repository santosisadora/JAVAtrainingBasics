import java.util.Scanner;

public class LabQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int num1;
		int num2;
		
	   
	       //get input from user of both numbers
	       Scanner scan = new Scanner(System.in);
	      
	       System.out.println("Enter first number:");
	       num1=scan.nextInt();
	       System.out.println("Enter second number:");
	       num2=scan.nextInt();
	       
	       //determine the result as a sum of both inputs
	       result = num1+num2;
	       //print out the result
	       System.out.println("The result is:" + " "+ result);
	      
	       
	}

}
