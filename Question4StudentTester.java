public class Question4StudentTester {

	public static void main(String[] args) {
	//object of the Student class to be able to use the method 
		Question4Student student1 = new Question4Student();
		//call the setters
		student1.setfirstName("Radhika");
		student1.setlastName("Sharma");
		student1.setaddress("123 Amy Lane");
		student1.setphoneNumber("6476784526");
		student1.setemailAddress("Radhika.Sharma@georgiancollege.ca");
		student1.setage(30);
		//print the outputs using the getters
		System.out.println("First name: "+student1.getfirstName());
		System.out.println("Last name: "+student1.getlastName());
		System.out.println("Address: "+student1.getaddress());
		System.out.println("Ph number: "+student1.getphoneNumber());
		System.out.println("Email: "+student1.getemailAddress());
		System.out.println("Age: "+student1.getage());
		
		

	}

}
