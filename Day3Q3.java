import java.util.Scanner;

public class Day3Q3 {

	public static void main(String[] args) {

		 int num1;
	     int num2;
	     
	     
	     Scanner pergunta = new Scanner(System.in);
	        
			System.out.println("Enter the length: ");
			num1 = pergunta.nextInt();
			
			System.out.println("Enter the breadth: ");
			num2 = pergunta.nextInt();
			
			if ( num1 == num2 ){
				System.out.println("It´s a square");
			}
		
			else {
				System.out.println("It´s not a square!");
			}
				
			}
	}
