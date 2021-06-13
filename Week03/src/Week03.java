
public class Week03 {

	public static void main(String[] args) {
		/**
		 * 
		 * W3P1 - Introduction to Inheritance and Polymorphism
		 * 
		 * Main reason for Inheritance:
		 * 	1 : Reuse of code (extending same code from parent class)
		 *  instead of repeating things in classes that may have 'things' in common, we can put it all into a 
		 *  parent class and that class can have children based off that common parent class
		 *  
		 *  Example: Loan as parent and Student Loan as a child class
		 *  
		 *  2 : polymorphism (happens at runtime) 
		 *  
		 *  Example: class shape as parent, with a draw method and all derived shapes will be extending class Shape
		 *  and inheriting method draw and override method draw based on their needs; so each has their own version
		 *  of draw
		 * 
		 * Our classes are implicitly extending from class Object
		 * it is from this class Object that we gain access to method equal (which compares two objects to see
		 * if they are the same)
		 * SO ANY CLASS IN JAVA EITHER DIRECTLY OR INDIRECTLY EXTENDS FROM CLASS OBJECT
		 * => when creating a class, Student for example, we can say 'Student extends Object' 
		 * => any method put inside this class Object would be inherited by all other classes in Java
		 * 
		 * 
		 * A : B // A extends from class B OR A inherits from class B
		 * 
		 * In Java we say 'A extends B'
		 * => class B is the parent; class A inherits from it directly
		 * So A extends B means it inherits what is in B and adds its own
		 * 
		 * Example:
		 * If we have B extends A; A can be called 'parent class', 'super class' or 'base class'
		 * B is called 'child class', 'soft class', or 'drive class' [derived class, extended class]
		 * 
		 * Mostly in Java it is super class and soft class that are used
		 * 
		 * B will be more 'specialized' than A; B is a A
		 * For example any college student is a student; and mortgage is a loan
		 * 
		 * nb. a lower case is used to denote a reference variable
		 * So we have here a (a reference variable of type A) gets a new value of A:		 * 
		 * A a = new A();
		 * B b = new B();
		 * 
		 * polymorphism allows:
		 * A a = new B();  // reference value of type A (of type super-class) referring at runtime to an actual object of type subclass
		 * HOWEVER the reverse is not true
		 * B b = new A(); is not allowed!
		 * 
		 * Easy way to see: B is a A
		 *  => a is 'pointing' to B which in turn is 'pointing' to A (the super class)
		 *  So in a sense a is pointing to itself
		 *   
		 * **********************
		 * PROTECTED vs PRIVATE
		 * 
		 * Example:
		 * if you have a class with 'something' that is protected (field, method) within a package A (which can be thought of
		 * as a namespace from C++)
		 * => then all derived classes in A package can access that protected as well as any class in another package B which is derived
		 * from the original superclass
		 * However also any other classes in package A can also access this protected item even if not derived from super class
		 * 
		 * nb may say that private things do not get inherited; which is both right and wrong
		 *   they do get inherited but you do not have access to them (would need some public method to access)
		 *   so they get inherited to the derived class (get the space) but not the access to them
		 *   
		 *   
		 * ********************** 
		 * Overriding in Java  
		 * 	happens with inheritance relationship and you inherit general version and you provide your own implementation
		 *   where you can have your class and override the parent class method; for example overriding Object's equal method
		 *   with your own specialized version
		 *   
		 *   Note Overridden methods CAN'T BE MORE RESTRICTIVE
		 *   - order is (public, protected, package, private) 
		 *   reason is polymorphism; for example having a draw method on a shape where in the parent its public but
		 *   in the derived class its been made protected, package or private
		 *   
		 *   
		 * **********************
		 * Abstract and Interfaces in Java
		 *  abstract if at least one method is abstract
		 *  abstract prevents user from creating an object based off that class
		 *  note that an abstract class can have constructors but if the class is declared as abstract the are not usable
		 *  and only there to be inherited to other classes in hierarchy
		 *   
		 *  interface - very general class, all abstract methods
		 * 
		 * ************************
		 * Declaring a class or method as final
		 * 	 final can be used before a class or method
		 *   means methods is in its final version; so derived classes cannot change the method body
		 *   => then cannot override the method in the superclass
		 *   
		 *   final before class name means class is final
		 *   => class can not be extended
		 *   a good example is String class
		 *   String is immutable because it is a final class; cannot extend class, change behavior, override its methods
		 *   => makes it secure, to be shared by many different threads at same time
		 *   
		 * 
		 * Difference between final and abstract
		 * 	final can be used for fields, methods and classes while abstract could be used for methods and classes 
		 * 	abstract class means class could be used for inheritance, extended by other soft classes but cannot create objects based off of abstract class
		 *  final class can make objects off final class but cannot extend
		 *  
		 * Difference between abstract vs interface
		 * 		in abstract might have at least one abstract method (could have concrete methods)
		 * 		in interface all will be abstract (is meant to be general)
		 * 
		 * 		as well:
		 * 		abstract class will be involved in some inheritance hierarchy; with some sort of relationship between them
		 * 		interface are too general, and could connect classes (extend or implemented) no logical relationship but the interface acts as a bridge
		 * 			where both are implementing (or extending) from this interface despite no logical connection between both derived classes
		 * 
		 * 
		 * 
		 * W3P2 - Relationships between Super and Sub Classes
		 * 		see Week03_0
		 * 
		 * W3P3 - Inheritance and Superclass Constructor Invocation
		 * 		see Week03_1
		 * 		superclass constructor is called
		 * 		Constructors are not inherited; we call them constructor chain or constructor invocation chain
		 * 
		 * W3P4 - Overriding Object Methods
		 * 		see Week03_2
		 * 
		 * W3P5 - Static Methods Can't be Overriden
		 * 		see Week03_3
		 * 
		 * W3P6 - Polymorphism Through an Example
		 * 		see Week03_4
		 * 
		 * 	in an interface all methods are by default public and abstract
		 * 
		 */
		

	}

}
