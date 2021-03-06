
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
		
		/////////////////////////
		// W2P8 - Static
		
		// every object has its own instance of its fields
		// each object has their own copies, their own spaces for these
		// to share some field/class variable through all object instances
		
		// with static in Java every instance of the class shares a class variable which is in one fixed
		// location in memory
		
		// any object can change the value of a class variable
		// but class variables can also be manipulated without creating an instance of the class
		
		// declared and defined at time your class is loaded (before your program starts to run your classes
		// will be loading into memory by a java class loader)
		
		// we make methods static means we can call them even if we don't have any objects at the time
		
		// NOTE STATIC METHODS DO NOT HAVE ACCESS TO 'this' - as you don't have access to the space of any specific object
		// Note that static methods can just access static var.s 
		// but non-static methods could access both statics and non-statics!
		// as at the time you created the object you can access the static variable/field could be accessed by all the object
		// because they all share the same static space for the class
		
		// Also note that static methods could just call other static methods
		
		// why is main static?
		// main is void, it doesn't return anything
		// public because it should be accessible outside its class (because JRE wants to run the code so otherwise
		// it can't be called outside its class by JRE to run your code)
		// static because it needs to be called from outside right at the beginning before we have
		// any objects; JRE cannot call the main otherwise 
		
		
		//What if we want to define a final var. in our class. Which one is a better option?
		//		1- public final String COLLEGE = "Seneca";
		//		OR
		//		2- public static final String COLLEGE = "Seneca";
		
		// here all the objects are going to have this field COLLEGE and its final (so constant)
		// meaning it cannot be changed yet each object will have a copy of this; so its best to be declared
		// static final
		
		// so to recap if a field is final its best to make it static
		
		
		//////////////////
		// W2P9 - Math
		
		// all its methods are static; its a helper class
		// since the methods are static, you do not have to create a class to use:
		// SomeClass.abs(...) for example
		// you can use:
		// Math.abs()
		
		///////////////////
		// W2P10 - Arrays
		
		// arrays are passed as an object, so we have access to its length and do not need to pass its length
		// as a parameter
		
		//////////////////
		// W2P11 - Strings
		
		// String class if final; meaning if you create objects based off that class you cannot change 
		// the object/state
		// meaning any changes will mean a new object needs to be created
		
		// Differences between String, StringBuilder and StringBuffer
		// String is the most efficient (if you dont need to change the content that much)
		// StringBuilder is mutable but with no guarantee of synchronization (no worry about multiple threads accessing it)
		// StringBuffer is mutable but safer (guarantee of synchronization)
		
		// default value of String is null (as it is a reference value)
		// when we pass a method to a String we are passing a copy of a reference value pointing to String
		// but String are immuatable so it does not make a difference
		
		///////////////////
		// W2P12 - Final Notes
		
	}
	
}
