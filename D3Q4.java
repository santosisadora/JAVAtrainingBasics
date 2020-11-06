import java.util.Scanner;

public class D3Q4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first age: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter the second age ");
		num2 = scan.nextInt();
		
		System.out.println("Enter the third age: ");
		num3 = scan.nextInt();
		
		
		if ( num1 > num2 &&  num1> num3 ) {
			System.out.println("The oldest is: ");
			System.out.println(num1);
		}
		
		if ( num2 > num1 && num2> num3) {
			System.out.println("The oldest is: ");
			System.out.println(num2);
		}
		if ( num3 > num1 && num3> num2) {
			System.out.println("The oldest is: ");
			System.out.println(num3);
			
		if ( num1 < num2 &&  num1< num3 ) {
				System.out.println("The youngest is: ");
				System.out.println(num1);
		}
		
		if ( num2 < num1 && num2< num3) {
			System.out.println("The youngest is: ");
			System.out.println(num2);
		}
		
		if ( num3 < num1 && num3< num2) {
			System.out.println("The youngest is: ");
			System.out.println(num3);
		}
		}
		}
	}
	
		

	


