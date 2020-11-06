
import java.util.Scanner;
public class Question1 {
	



		public static void main(String[] args) {
			//here goes the String variables because it´s a text input
			String firstName;
			String lastName;
		
			//create a scanner to get the input from the user
			//print the questions
			//print the result of input
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first name: ");
			firstName=scan.next();

			
			System.out.println("Enter last name:");
			lastName=scan.next();
			
			
			System.out.println("My name is"+" "+ firstName + " " + lastName);
			
			
			
			}

		}
