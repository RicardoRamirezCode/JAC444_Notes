
public class Student2 {
	// this time fields are set to private (as they should be) so not longer package access fields
			// as well object state is defined here (but better to use constructors)
	private long id =1;
	private String firstName = "Ricardo";
	private String lastName = "Ramirez";
	
	public static void main(String[] args) {
		// using default constructor
		// note object state is changed this time after its creation using above values
		Student2 student1 = new Student2();
		
		System.out.println(student1.id);
		System.out.println(student1.firstName);
		System.out.println(student1.lastName);
		
		// above works as while these values are private we are in same class and thus
		// can access them directly
		

	}

}
