
public class Q2 {

	public static void main(String[] args) {
	      //Question 2: create a program using any loop that will
        //display the numbers 33-3 on the screen, going down by 3´s
        //expected output: 33,30,27...6,3
        
        //declare and initialize the initial value, which is 33
        int x=33;
        
        //while loop runs as long as the numbers are between 33 and 3
        while(x <=33 && x >=3 ){
          //print the number - 3 in each iteration
          System.out.println(x);
          x = x-3;
        }
    }
   
}

