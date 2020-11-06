import java.util.Scanner;

public class Day3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1;
        int num2;
        
		Scanner pergunta = new Scanner(System.in);
        
		System.out.println("Enter the first number: ");
		num1 = pergunta.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = pergunta.nextInt();
		
		System.out.println("The greater number is:");
		
		if( num1 > num2 ) {
			System.out.println(num1);
		}
			else{
				System.out.println(num2);
			}
			
			
		}
		
		
	}


