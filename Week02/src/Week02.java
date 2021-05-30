
public class Week02 {

	// Main Method:
	public static void main(String[] args) {
		
		/////////////////////////
		// W2P1	- Creating Objects
		
		// Class declarations
		// -class names should be upper CamelCase
		// 
		// objects life cycle is determined by elements of class as follows:
		/**
		 * objects initializations - Constructors
		 * objects states - Fields (instance variables was old name for them)
		 * class and its objects behaviors - Methods
		 * 
		 */
		
		// How we instanciate / create an object
		// Student s = new Student();
		
				// 1. declare s as a reference variable of type Student (as it's type /class)
				// 2. based on memory that type needs, we have new operator that allocates the memory for that actual object
				// 		NOTE: s resides on Stack; actual object is on heap
				//				So OBJECTS ARE ON THE HEAP
				//				REFERENCE VARIABLES ARE ON THE STACK
				// 3. next will be calling the constructor - initializing values onto your object
				// 4. = , assigning that address to your reference variable;
				// 		reference variable will be pointing to your object
		
		// SO s IS NOT THE ACTUAL OBJECT, just a reference value that points to an actual object at run-time
		// s is a reference variable which refers to an object of type Student
		// constructors - only methods with same name as class
		// does two things this statement:
		// -declaration an instance variable of type class (in this case class Student)
		// -assigning a value that refers to an object
		
		// Student s; declaration of Student as reference variable of type Student
		
		////////////////////////////
		// W2P2	- Student1 example
		
		// 'this' - reference that always refers to object we are currently talking about
		// not declaring any assess modifier means the fields will have 'package access' and thus accessible by all
		// the classes in the same package 
		
		////////////////////////////
		// W2P6	- Checking Equality
		// Object Equality
		
		// 2 special kinds of classes: Strings and Arrays
		// new is optional for these, as they are special cases
		String x = "1";
		String y = new String ("1");
		
		// above x and y are two different reference variables to two different actual objects
		
		if (x == y) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		// although the contents are the 'same' they are not equal
		// here we are comparing x and y which are reference variables which refer to the actual objects in memory
		// we are comparing two addresses, and they are not equal because they are put into different parts
		// in the stack (even though content is the same)
		
		if (x.equals(y)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		// so comparing objects should use equal
		
		/////////////
		// However if we don't use 'new' explicitly; trying to assign same value to object of type String
		// in just this case Java tries to save memory by creating an object of type String the value "1"
		// and set both x and y to refer to same address
		
		
		///////////////////////
		// W2P7	- Pass by Value and Garbage Collection
		
		// in Java EVERYTHING is pass by value
		// even in cases you pass arrays or objects
		
		// if you pass an object, array, string, etc..., you are copying the value of the reference variable
		// pointing to the actual object
		// what actually happens behind scenes is different
		
		// finalize method
		// acts like destructors in C++
		
		
	}
	
}
