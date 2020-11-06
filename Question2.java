import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
                  
		 //here goes the variables 
		int number1;
		int number2;
		int number3;
		 //create scanner to get input from the user
                 //ask for the numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1=scan.nextInt();
		
		System.out.println("Enter the second number:");
		number2=scan.nextInt();
		
		System.out.println("Enter the third number");
		number3=scan.nextInt();
		
                 //here goes the if statements to determine which number is the greatest
		if(number1>number2 && number1>number3) {
			System.out.println(number1+" "+"is the greatest number.");
		}
		if(number2>number1 && number2>number3) {
			System.out.println(number2+" "+"is the greatest number.");
		}
		if(number3>number1 && number3>number2) {
			System.out.println(number3+" "+ "is the greatest number.");
		}
		
		
	}

}
