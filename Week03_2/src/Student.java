//Override equals() and toString() methods (from class Object), whenever possible
public class Student {
	private long id;
	private String firstName;
	private String lastName;
	//setters and getters needed

	public Student(long id, String firstName, String lastName) {
		super();//it happens even if you don't say it!
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override//pay attention to this annotation! It helps you prevent unwanted overloading instead of overriding!
	// ensures overriding same method same as declared in class Object
	public String toString() {
		return String.format("This is %s %s with StID: %d", firstName, lastName, id);
		// String.format acts same as System.out.printf
	}

	@Override
	public boolean equals(Object obj) {
		// if 'this' reference and obj reference passed are referring to same 'thing'/object
		if (this == obj)
			return true;
		
		// obj is a reference variable, if it is referring to null it is not pointing to anything
		// 'this' object is not null, it is pointing to this current object
		if (obj == null)
			return false;		
		
		// we check if null first before this as obj.getClass() would return an error
		// getClass returns runtime class of this object 
		// would return false if for example this class is of class Student and obj is of class Teacher
		if (getClass() != obj.getClass())
			return false;
		
		// now with above we know obj is not null, and obj and this are of same type; so we can safely downcast
		
		Student other = (Student) obj;
		// have to downcast first to be able to access fields such as id
		
		if (id != other.id)
			return false;
		
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))	// comparing two Student object contents (so == not available)
			return false;
		
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		Student student1 = new Student(1, "Reza", "Khojasteh");
		Student student2 = new Student(1, "Reza", "Khojasteh");
		
		System.out.println(student1 == student2);		// two new objects referring to two different places
		System.out.println(student1.equals(student2));	// note if you do not have the override of equals this will return false; best to have override
		
		System.out.println(student1.toString());//Try this line with/without overriding toString()
		System.out.println(student2);//Try this line with/without overriding toString()
		
		// here we try to print object implicitly and explicitly
		// if you do not have override of toString it will print to console Student@someHashCode
		
	}

}