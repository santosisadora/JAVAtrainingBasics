import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//here goes the variable
		int score;
		
		//create a scanner to get the input from the user
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
		score=scan.nextInt();
		
		//if statements to classify the user´s input according to the specific grade
		if(score>=90) {
			System.out.println("Wohoo. It´s A");
		}
		if(score>=80 && score<90) {
			System.out.println("B");
		}
		if(score>=70 && score<80) {
			System.out.println("C");
		}
	    if(score>=60 && score<70) {
	    	System.out.println("D");
	    }
	    if(score<=59) {
	    	System.out.println("F");
	    }
		}

	}

