import java.util.Scanner;

public class LabQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int rows;
    
    //ask for input from user of number of rows 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    rows=scan.nextInt();
   
    //for loop according to the number of rows
    for(int i=1; i<=rows; i++) {
    	for(int j=1; j <=i; j++) {
    		System.out.print(j + " ");
    	}
    	System.out.println();
    }
	}

}
