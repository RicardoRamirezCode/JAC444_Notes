
public class Student1 {
	// fields not set to private to they are package access fields
	long id;
	String firstName;
	String lastName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student1 = new Student1();	// uses default constructor
		
		System.out.println(student1.id);
		System.out.println(student1.firstName);
		System.out.println(student1.lastName);
		
		// above prints out default values for each as we never declared a constructor

	}

}
