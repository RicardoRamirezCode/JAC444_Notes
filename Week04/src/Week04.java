
public class Week04 {
	
	// Exception Handling, and Generic Programming in Java

	/**
	 * W4P1 - Introduction to Exception Handling in Java
	 * Exception:
	 * 		an event that occurs during the execution of a program that disrupts the normal flow of instruction
	 * 			for example attempting to use a object reference variable pointing to null gives a null pointer exception
	 * 			or accessing an index in a array that does not exist
	 * 
	 * 	Advantages of Exceptions:
	 * 		separating error handling code from 'regular code' - makes your code less cluttered feeling
	 * 		propagating errors up the call stack
	 * 		grouping error types and error differentiation
	 * 
	 * 	Java Exception:
	 * 		in java requires methods either:
	 * 			catch
	 * 			specify
	 * 		an exception (checked exceptions)
	 * 
	 * 	if an exception is not caught or specified by a method the program does NOT compile
	 * 
	 * 	Checked Exceptions:
	 * 		those exceptions that are forced by the compiler to be caught
	 * 		as such they are not runtime exceptions
	 * 
	 * 	Unchecked Exceptions:
	 * 		since they can be avoided by good programming you have the option to either have them in either
	 * 		catch/specify or can come up with your own solution
	 * 
	 * 	How to write exception handler:
	 * 		1. Write the try block
	 * 			block encloses statements that might throw exception
	 * 		2. write catch block(s)
	 * 			defines the associate with a try block by providing one or more blocks of statements
	 * 			directly after the try block
	 * 		3. write the finally block
	 * 			finally block provides a mechanism that allows your method to clean up after itself
	 * 			this finally block would be run regardless if you had an error in your try block or not
	 * 			could be used to clean up after opening a file to close it
	 * 
	 * 
	 * W4P2 - Test Exception
	 * 		see Week04_TestException
	 * 
	 * W4P3 - Custom Exceptions
	 * 		java has a lot of exception classes in place
	 * 		can write your own custom exception classes
	 * 
	 * W4P4 - Advantages of Using Generics
	 * 		see Week04_Generics
	 * 		prior to Java 5 when generics were introduced, only option to have a box that could contain anything 
	 * 		was to set up as in Box.java; anything being some soft class of Object
	 * 		this method did not offer strong type checking at compile time (see OldBox.java)
	 * 
	 * 		in this example of old method had no way of having box of everything, had to have box of Object and
	 *			and tried to save something like an integer and tried to get as a string you would have runtime exceptions
	 *
	 *		advantage of generic code, things happen at compile time and errors can be caught with mistypes
	 * 
	 * W4P5 - More on Generics in Java
	 * 		raw types - when you have your class declared as generics but you do not use it as a generic
	 * 			not good practice, if you have a generic class or interface you should use type arguments
	 * 		see Week04_GenericType
	 * 		see Week04_Pair
	 * 
	 * 
	 * 		note we if we have List<Object> ; String is an Object, Integer is an object, however it does not
	 *      mean that it is a child of List<Object> despite String and Integer being sub-classes of Object 
	 *      
	 *      List<?> using the wildcard ? will be a list of unknown type and could be interpreted a list of anything
	 *      and could be regarded as a parent of any other list of any type
	 */
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
