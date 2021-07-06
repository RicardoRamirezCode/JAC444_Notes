
public class Week06 {
	/**
	 * Week 06 Inner Classes and Anonymous Classes in Java, Event Driven Programming Using Swing, and JavaFX
	 * 
	 * 
	 * W6P1 - Introduction to GUI in Java (AWT, Swing and Java FX)
	 * 
	 *  Issue with AWT is some graphical elements were called 'heavy weight'. They had been implemented based on resources of the operating system (ie window you see in Windows could differ from Mac counterpart)
	 *  Main purpose of Java was it was suppose to be cross platform and portable.
	 *  
	 *  Java 2 introduced Javax.swing, which was decoupled from the platform (not differing from platform to platform) and hence using less operating system resources (and more portable).
	 *  
	 *  Note JavaFX (starting Java 9) has been decoupled from Java.
	 *  
	 * W6P2 - Using JOptionPane
	 * 		see Week06 Addition
	 * 
	 * W6P3 - Using JLabel and FlowLayout
	 * 		see Week06_Label
	 * 		
	 * 		includes JFrame, which provides basic window features. basic frame we like to put our panels in
	 * 		JLabel that will be used as our graphical component
	 * 		will use Icon as an interface that will be implement by ImageIcon 
	 * 		FlowLayout specifies how components are arranged
	 * 
	 * 		Note LabelFrame will be a JFrame (extends); to show a frame need a second class LabelTest (best practice)
	 * 
	 * 		Note JFrame.EXIT_ON_CLOSE - even if you close frame will be still running, added this will exit when you close frame
	 * 
	 * W6P4 - Using JTextField and Intro to Event Driven Programming
	 * 
	 * 		see Week06_TextField
	 * 
	 * 		whole purpose of having the inner class TextFieldHandler is to handle the event of the outer class
	 * 		could have separate class, but since it only is handling the outer class it makes sense to have it as
	 * 		an inner class
	 * 
	 * 		it is a private inner class so can not be accessed outside the outer class
	 * 
	 * 		note that ActionListener is an interface (viewing it shows it has one virtual method)
	 * 		as such we need to override that method (actionPerformed)
	 * 
	 * W6P5 - Using JButton
	 * 		see Week06_Button
	 * 		note regardless of where you press button, will center dialog box on-top of parent window/frame
	 * 
	 * 		note we set centered as we set first argument to ButtonFrame.this; if we set to 'this' that would
	 * 		refer to THIS object and we want to set to center of parent object
	 * 
	 * 		so ButtonFrame.this is referring to current outer object
	 * 
	 * W6P6 - Using Anonymous Inner Class
	 * 		see Week06_Button2
	 * 		note in example we have the fancy button event handled the same as before
	 * 		for plain button we changed to anonymous inner class
	 * 		here called addActionListener as before but instead of passing object based off another (private inner) class
	 * 
	 *  
	 *		plainJButton.addActionListener(new ActionListener() {
	 *		// here despite ActionListener being an interface we are saying 'new' 	
	 *
	 *		whenever we say new Interface we are not actually calling 	the constructor for interface (as interface does
	 *		not have a constructor) - instead we are making a new object based off class which will be implementing
	 *		ActionListener like what is written in example
	 *		can do this as we have provided the implementation of our abstract method
	 *
	 *		only place this object should be used is here, that is the purpose of this anonymous inner class
	 *
	 * W6P7 - Using JTextArea
	 * 		see Week06_TextArea
	 * 
	 * 		here we need another component acting as event handler, as user may hit enter in a text area and we do no
	 * 		want to use that as event trigger 
	 *  
	 *  	here in this example we created a box container and directly added to it
	 *  		box.add(new JScrollPane(textArea1));
	 *  		and
	 *  		box.add(copyJButton);
	 *  
	 *  	then at end we add box itself to Jframe
	 *  		add(box);
	 *  
	 * W6P8 - MyJavaFX
	 * 		Installing:
	 * 		grab JavaFX SDK off site:
	 * 		https://gluonhq.com/products/javafx/
	 * 		extract files onto HD (I placed into my Java directory in Program Files)
	 * 		under Window/Preferences, create a new user library (named JavaFX##) and include jar files
	 * 		Creating new Java Project:
	 * 		open java project in Eclipse as usual
	 * 		open its properties and include JavaFX## into class path (found under Java Build Path)
	 * 		Select "Add Library..." and select user library, then JavaFX##
	 * 
	 * 		additionally, need to add VM arguments
	 * 			Run -> Run Configurations.... -> Java Application
	 * 		add:
	 * 			--module-path "C:\Program Files\Java\javafx-sdk-16\lib" --add-modules javafx.controls,javafx.fxml
	 * 
	 * 		see Week06_MyJavaFX
	 * 		here we import a Stage, Scene and some nodes (like Button) and an Application that could be basically your main program
	 * 		note we do not have a main method.
	 * 		main method is only needed for IDE with limited JavaFX support.
	 * 		Not needed for running from the command line.
	 * 
	 * 		start method could be acting as your main method in case you are extending an Application and running using JavaFX
	 * 		
	 * W6P9 - MultipleStageDemo
	 * 		see Week06_MultipleStageDemo
	 * 
	 * W6P10 - ButtonInPane
	 * 		see Week06_ButtonInPane
	 * 
	 * 
	 * 
	 */

}
