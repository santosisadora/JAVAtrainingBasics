import java.util.Scanner;

public class D4Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number between 1-7");
	        i = scanner.nextInt();
	        
	        switch(i)
	        {
	            case 1:
	                System.out.println("It�s Sunday");
	                break;
	                
	            case 2:
	                System.out.println("It�s Monday");
	                break;
	                
	                        
	            case 3:
	                System.out.println("It�s Tuesday");
	                break;
	                
	            case 4:
	                System.out.println("It�s Wednesday");
	                break;
	            case 5:
	                System.out.println("It�s Thursday");
	                break;
	                
	            case 6:
	                System.out.println("It�s Friday");
	                break;
	            case 7:
	                System.out.println("It�s Saturday");
	                break;
	        }
	        
	    }
	}

