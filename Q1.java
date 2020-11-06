
public class Q1 {

	public static void main(String[] args) {
	       //Question 1: Create a program using 'while' loop
        //that will display the numbers 3-33 on screen
        //going up by 3´s
        //expected output: 3 6 9 ...33
        
        //declare and initialize an int as 3, because we need to add 3 to each result later
        int x=3;
     
        //while loop condition.while the x is lesser or equal to 33, the loop continues
        while(x <= 33 ){
            //print the x plus 3
         System.out.println(x);
         x = x + 3;
         
        }
    }
    
}
