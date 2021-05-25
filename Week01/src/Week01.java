
public class Week01 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.print("Hi\n");
		System.out.println("I am a new line");
		
		// shortcuts
		// sysout + ctrl + space for System.out.println
		// for IntelliJ sout + tab
		
		// variables
		/*
		 * data type	size	prim/ref	value
		 * boolean		1 bit	primitive	true or false
		 * byte			1 byte	primitive	-128 to 127
		 * short		2 bytes	primitive	-32,768 to 32,767
		 * int			4 bytes	primitive	~-2 billion to 2 billion
		 * long			8 bytes	primitive	~-9 quintillion to 9 quintillion 
		 * float		4 bytes	primitive	fractional number up to 6-7 digits
		 * double		8 bytes	primitive	fractional number up to 15 digits
		 * char			2 bytes	primitive	single character/letter/ASCII value (use single quotes)
		 * String		varies	reference	a sequence of characters
		 */
		
		// primitive vs reference
		/*
		 * 8 types 					vs 	unlimited
		 * stores data 				vs 	stores an address
		 * can only hold 1 value	vs	could hold more than 1 value
		 * less memory				vs	more memory
		 * fast						vs	slow
		 * 
		 */
		
		int x;			// declaration
		x = 123;		// assignment
		int y = 123;	// initialization
		System.out.println(x + y);
		
		// Segment 01 Notes
		// Method vs Method Signature
		// method is a collection of statements that are grouped together to perform an operation
		// method signature is the combination of the method name and the parameter list
		
		// Types of Methods
		// - Instance Methods
		//		object level methods
		//		invocation: ObjRef.methodName()
		// 		Affect object state
		// - Static Methods
		//		static keyword
		//		class level methods [ ie no access to state, can't access instance variables/methods]
		//		invocation: className.methodName()
		
		// Method Overloading
		// can overload a method in Java by:
		// changing number of arguments AND/OR changing the data type
		// CANNOT overload by changing return type as it leads to ambiguity
		
		// main can be overloaded BUT JVM calls main() method which receives string array as arguments only		
		
		//Segment 02 Notes
		
		// Single Dimension Arrays
		double [] myList = new double[10];	// all initialized to 0.0 
		//can use initialization list instead
		double [] secondList = {1.0,2.0};
		System.out.println(myList[1]);
		System.out.println(secondList[1]);
		
		// Default values for array once declared:
		// 0 for numeric primitive data types
		// 'u0000' for char types
		// false for boolean types
		
		
		// Copying an Array
		// 3 methods of copying an array:
		// use a loop to individual elements one by one
		// use a static arraycopy method in System class
		// use the clone method (introduced later)
		
		// System.arraycopy(sourceArray, src_pos, targetArray, tar_pos, length);
		
		
		// Passing Arrays to Methods
		// Java uses pass by value to pass arguments to a method
		// for parameter of primitive type value, actual value is passed; changing value of local parameter inside
		// method does not affect the value of the variable outside the method
		
		// for parameter of array type, value of parameter contains a REFERENCE to an array
		// this reference is passed to the method
		// any changes to the array that occur inside the method body will affect the original array that was passed
		// as an argument
		
		// Example
		int a = 1; // x represents an int value
		int[] b = new int[10]; // y represents an array of int values
		m(a, b); // Invoke m with arguments x and y
		System.out.println("a is " + a);
		System.out.println("b[0] is " + b[0]);	
		
		// Here:
		// x is 1
		// y[0] is 5555
		
		
		// Passing Arrays to Methods
		// printArray(new int[] {3,1,5});
		// valid to pass to a method called printArray as above where printArray takes an array of int[]
		
		// Returning an Arrays
		// when a method returns an array, the reference of the array is returned
		
		// Enhanced for Statement
		// iterates through elements of an array without using counter
		// syntax
		// for (parameter: arrayName)
		//			statement
		
		for (int number : b)
			System.out.println(number);
		
		// parameter has a type and an identifier
		// arrayName is the array through which we iterate
		// parameter type must be consistent with type of the elements in the array
		
		
		// Multi-Dimensional Arrays
		
		// combine declaration and creation in one statement
		// dataType[][] refVar = new dataType [10][10]
		
		// Alternative syntax
		// dataType refVar[][] = new dataType[10][10]		
		
		// Lengths of Two-dimensional Arrays
		
		// example:
		// int[][] x = new int[3][4]
		
		// x.length is 3 [ x[0], x[1], x[2] ]
		// x[0].length is 4
		// x[1].length is 4
		// x[2].length is 4		
		
		// Ragged Arrays
		// each row in a two-dimensional array itself is an array
		// so each row can have different lengths
		
		// Example:
		int[][] matrix = { 
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5},
				{3, 4, 5},
				{4, 5},
				{5}
				};

		System.out.println("The length of matrix is:");
		System.out.println(matrix.length);
		
		System.out.println("\nThe length of matrix[0] is:");
		System.out.println(matrix[0].length);
		
		System.out.println("\nThe length of matrix[1] is:");
		System.out.println(matrix[1].length);
		
		System.out.println("\nThe length of matrix[2] is:");
		System.out.println(matrix[2].length);
		
		System.out.println("\nThe length of matrix[3] is:");
		System.out.println(matrix[3].length);
		
		System.out.println("\nThe length of matrix[4] is:");
		System.out.println(matrix[4].length);
		
		
		// Segment 03 - Classes
		
		//Object Oriented Programming
		// An object:
		// has unique identity, state and behaviors
		// the state:
		// of an object consists of a set of data fields (properties) with their current values
		// the behavior:
		// of an object is defined by a set of methods
		
		// an object has both a state and behavior
		// the state defines the object
		// the behavior defines what the object does
		
		// Classes
		// constructs that define objects of the same type
		// Java class uses:
		// variables to define data fields
		// AND
		// methods to define behaviors
		// additionally provides special type of methods (constructors) which are invoked to
		// construct objects from the class
		
		// Class Declaration
		// in Java has format
		/*
		class ClassName {field(s)
			constructor(s)
			method declaration(s) other class
			declaration(s)
		}
		*/
		
		// objects life cycle determined by elements of the class as following:
		// object initializations - constructors
		// object states - fields
		// class and its object behaviors - methods
		
		// Constructors
		// special kind of methods that are invoked to construct objects
		// a constructor with no parameters is referred to as a no-arg constructor
		// constructor must have the same name as class itself
		// constructors do not have return type - not even void
		// constructors are invoked using the new operator when an object is created
		// they play the role of initializing objects
		
		// class may be declared without constructors
		// a no-arg constructor with empty body is implicitly declared in this class
		// default constructor is provided  automatically ONLY IF no constructors are explicitly declared in class
		
		// Syntax
		// ClassName objectRefVar = new ClassName();

	}
	
	public static void m(int number, int[] numbers) {
		number = 1001; // Assign a new value to number
		numbers[0] = 5555; // Assign a new value to numbers[0]
	}

}
