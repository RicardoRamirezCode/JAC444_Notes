
public class Week07 {
	/**
	 * Week 06  Functional Programming and Lambda Expressions in Java
	 * 
	 * W7P1 - Intro to Functional Programming in Java
	 * 		so far had eight (8) different primitive types in Java
	 * 		all else considered (references to) objects
	 * 
	 * 		for the 8 primitive we also added type wrapper classes so they behave like classes themselves
	 * 		all primitive types could be transformed into objects
	 * 
	 * 		therefore we can say Java is a pure OO language having only objects and one data type: references to objects
	 * 
	 * 		prior to Java 8 we had 'three dimensional' programming: procedural, object oriented and generic programming
	 * 
	 * 		however in java 8 can also treat methods as data (passed and returned value)
	 * 		therefore Java 8 allows functional programming (fourth dimensional)
	 * 
	 * 
	 * 		What is functional programming:
	 * 			ability top pass a method to another method
	 * 			ability to return a method from a method
	 * 			ability to assign a method and store it inside a variable
	 * 
	 * W7P2 - Button2
	 * 		in our Button2 example from last week:
	 * 		
	 * 	plainJButton.addActionListener(new ActionListener() {
	 * 		@Override
	 * 		public void actionPerformed(ActionEvent event) {
	 * 			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
	 * 				"You pressed: %s", event.getActionCommand());
	 * 		}
	 * 		});
	 * 		}
	 * 		it's a simple method which adds an action listener as an anonymous inner class 
	 * 
	 * 		if you view ActionListner it is an interface with just one abstract method (called ActionPerformed)
	 * 		and we implement the way it (abstract method) behaves inside this anonymous inner class
	 * 
	 * 		when in java you have an interface with just one abstract method, it is a functional interface
	 * 		here we can just get rid of all this boilerplate code and pass the behavior this method addActionListener
	 * 
	 * 		plainJButton.addActionListener((ActionEvent event) -> {
	 * 			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
	 * 				"You pressed: %s", event.getActionCommand());
	 * 		}
	 * 		});
	 * 		}
	 * 
	 * 		here we can just say we are getting an ActionEvent named event, then I will return a method which will behave as
	 * 		written above in the main body
	 * 
	 * 		to further clean it up, since we have only one argument and it is, from viewing addActionListener, of type
	 * 		ActionEvent, we can remove the type
	 * 
	 * 		plainJButton.addActionListener(event -> {
	 * 			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
	 * 				"You pressed: %s", event.getActionCommand());
	 * 		}
	 * 		);	 * 		
	 * 
	 * 		Finally you can also remove the {} as it is just one statement
	 * 
	 * 		Advantages is it is much more concise (get rid of extra boilerplate like private inner classes, anonymous inner classes)
	 * 			and just pass pure method, or behavior just using lambda expression
	 * 
	 * 
	 * 	W7P3 - PlayWithPoints
	 * 		see Week07_PlayWithPoints		- example where we passed a method using a method
	 * 			Action.java contains the functional interface
	 * 			@FunctionalInterface	// optional not mandatory, just makes compiler ensure it is a functional interface
	 * 
	 * 			in this example the interface is generic as well
	 * 
	 * 		PlayWithThings has all three options shown
	 * 
	 * 		Advantage with Functional Programming is do not need to say how things should be done, just what things should be done
	 * 
	 * 		with our example:
	 * 			playWithPoints.forEach(p -> p.move(10,10));
	 * 
	 * 			we know the type for p as:
	 * 				playWithPoints was based off Point, see this following line:
	 * 					PlayWithThings<Point> playWithPoints = new PlayWithThings<>();
	 * 
	 * 				as its based off Points, when we say forEach; this forEach takes Action<T> and T here is based off Points
	 * 
	 * 				this method, expressed as a lambda p_> p.move(10,10) takes a p and returns p.move(10,10)
	 * 				in the functional interface change method accepts something, does something and returns void
	 * 				which is what we have done here, taken a p, moved it and returned nothing
	 * 		!!!!!!!!!
	 * 		Take-away is wherever we need to pass something which is based off a functional interface, we can instead pass a lambda expression
	 * 		to recap, we are passing an object based off a class that is implementing functional interface so we can use a lambda
	 * 		!!!!!!!!!
	 * 			see public void forEach(Action<T> action)
	 * 
	 * 				  
	 * 	W7P4 - ConvertExample
	 * 		see Week07_ConvertExample for different lambda
	 * 		have another functional interface Convert; here change returns type V
	 * 
	 * 
	 * 		aside: what sorts of things does this lambda expression that is passed as an argument have access to?
	 * 				first this lambda expression can have access to the fields of the class
	 * 					(in this example ConvertExample has no fields)
	 * 				secondly, can access the local variables of the method which in that method it has been used
	 * 					(in this example int j we can access)
	 * 
	 * 			However, it must be final or 'effectively' final. If we attempt to change j after we declare and 
	 * 				define it:
	 * 
	 * 				int j = 3; 
	 * 				j++;
	 * 				we can not use in our lambda
	 * 
	 * 			so if you are trying to have access to local variables in enclosed lexical scope, then it must be final or effectively
	 * 				final (which means despite not saying it is final, we never changed it so it is effectively final)
	 * 
	 * 
	 *  W7P5 - ExamResult
	 *  	see Week07_ExamResult
	 * 			example one we declare our Exam using an anonymous inner class; new object based off class Exam and giving
	 * 			implementation of getExamResult
	 * 
	 * 			example two we have our lambda expression
	 * 
	 * 			example three is the same, just shorter and more concise
	 * 
	 * 	W7P6 - GenericOperator
	 * 		see Week07_GenericOperator
	 * 		have a generic functional interface GenericOperator 
	 * 		has one abstract that takes T... operands
	 * 			T... means as many operands as needed; same as T[] operands
	 * 
	 *  W7P7 - CircleProperty
	 *   
	 *   	functions/methods could be treated as data
	 *   	note, if we have objects we can have references to those objects
	 *   	if we are using functions as objects, then it follows we could have references to these methods/functions
	 *   
	 * 		see Week07_CircleProperty
	 * 		
	 * 		CircleProperty squareRootRadius = Math::sqrt;
	 * 		this is a method reference
	 * 		Math::sqrt  - this acts as a reference to the method sqrt inside Math class
	 * 		this way of doing it is more desired, sqrt takes and returns a double so it makes more sense to do it this way
	 */

}
