import java.util.Scanner;

public class LabQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int rows;
      
     //ask for the input of how many rows the pyramid will contain 
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number of rows which needs to be printed");
     rows = scan.nextInt();
     
     //we use the for loop because we know exactly how many times the loop
     //will execute after asking the user  
     for (int i = 1; i <=rows; i++){
    	 //nested for loop to add space
        for (int j =rows; j >= i; j--){
           System.out.print(" ");
        }
        //another nested for loop to display the @ according with input
        for (int j = 1; j <= i; j++){
           System.out.print("@ ");
        }
        System.out.println();
      }
	}

}
