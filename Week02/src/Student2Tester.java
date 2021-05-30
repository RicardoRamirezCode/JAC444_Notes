
public class Student2Tester {

	public static void main(String[] args) {
		// this class has access to class Student2 and could create an object...
		//Student2 student1 = new Student2();
		
		// but this time it doesn't have direct access to its fields/properties as
		// we are outside the Student2 class
		// which is almost always desirable
		
		//student1.id = 10;
		//System.out.println(student1.id);
		
		// here I cannot set or get

	}

}
