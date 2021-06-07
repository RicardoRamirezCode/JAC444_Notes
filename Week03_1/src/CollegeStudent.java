public class CollegeStudent extends Student {
	private String collegeName;
	
	public static void main(String[] args) {
		CollegeStudent collegeStudent1 = new CollegeStudent();
		// here calling subclass no-arg constructor (default constructor) [we don't have any constructor in CollegeStudent]
		// that in turn calls superclass constructor [if it doesn't exist will result in error]
	}
}
