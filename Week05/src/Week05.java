
public class Week05 {
	/**
	 * I/O Streams, File I/O, and Serialization
	 * 
	 * W5P1 - Introduction to IO Streams in Java
	 * 
	 * IO streams are directed pipes transferring information from an input to an output
	 * in other words, Streams are a way of transferring and filtering information
	 * 
	 * In Java there are two types of streams:
	 * 	byte based - never change data in background; they just read raw bytes and write raw bytes
	 *  char based - does some conversion in the background (ends with reader or writer)
	 *  		read bytes and then merge them to make characters
	 * 
	 * W5P2 - CopyBytes
	 * 		will be reading and writing (raw or binary files), so using first category which is byte based
	 * 		see Week05_CopyBytes
	 * 
	 * 		FileInputStream, FileOutputStream or anything else ending with Stream in Java works/deals with bytes
	 * 			they don't do any conversion in background. They might return or take an integer but at end of day
	 * 			they only read/write a byte
	 * 
	 * 		for our java project we create a input.txt file and the program outputs new text file
	 * 		note this also works with jpgs (binary file)
	 * 
	 * W5P3 - CopyCharacters
	 * 		see Week05_CopyCharacters
	 * 		reading/copying characters; needs to use character based strings and always have some sort of conversion happening
	 * 		
	 * 		here if we use a text file with simple text there is no issue
	 * 		if we use an image, if we use character based streams for reading raw bytes, since there is some conversion happening in the
	 * 		background it will not match (data loss/distortion)
	 * 
	 * W5P4 - CopyLines
	 * 		see Week05_CopyLines
	 * 		our input file contains three lines (third is empty)
	 * 
	 * 		here we wrapped around streams by other streams to add functionality
	 * 			adding more features to the lower level steams to make them higher level streams 
	 * 
	 * W5P5 - CopyTextFile
	 * 		see Week05_CopyTextFile
	 * 		only new things are System.exit(0) and File
	 * 		
	 * W5P6 - CountBytes
	 * 		see Week05_CountBytes
	 * 		how to count bytes from console or file
	 * 		characters in Java are not always two bytes
	 * 
	 * 		when we run the code on an input.txt file containing 'abc'
	 * 		we assume since each is 2 bytes it will print out 6 bytes
	 * 		instead it prints out 3 bytes
	 * 
	 * 		reason is in these special cases java tries to save space and since this is asci code, and since
	 * 		asci is subset of unicode, it tries to represent in one byte
	 * 
	 * 		so even though java uses unicode it does not mean it saves them always as two bytes
	 * 
	 * W5P7 - CountSpace
	 * 		see Week05_CountSpace
	 * 
	 * W5P8 - Echo
	 * 		see Week05_Echo
	 * 		here we are trying to read lines from console and echo them
	 * 
	 * W5P9 - EchoFile
	 * 		see Week05_EchoFile
	 * 		here we are echoing lines read from text file
	 * 
	 * W5P10 - FindChar
	 * 		see Week05_FindChar
	 * 
	 * W5P11 - Serialization
	 * 		if you want to store your object (by object we mean object state) into file, and then read back into memory
	 * 		see Week05_TestSerial
	 * 
	 * 		Serializable - 
	 * 			without tagging your class Serializable prevents objects based off this class to be written to memory
	 * 			these kind of interfaces do not have anything you should implement in your inherited/extended code
	 * 			these kind of interfaces are called tagging interfaces (or marker interfaces)
	 * 
	 * 			tagging interfaces (marker interfaces) just tag (mark) your classes that implement these kind of 
	 * 				interfaces be treated differently
	 * 
	 * 		in our Test.java which implements Serializable the objects based off these class would now have the potential to be 
	 * 			written / read into the file
	 * 
	 * 		TestSerial will output a file.out which is in binary
	 * 
	 * 		TestDeserial will take that file.out binary file, use readObject which returns an object and downcast
	 * 			to Test (so we may use the getters)
	 * 			not constructor of Test is not called, whole object will be read from memory
 	 *			object is alive in primary memory
 	 *
 	 *		Again, whatever you have written would be read (if nothing then null/0 would be read).
 	 *		When you do deserialization you just read from the file, you never call the constructor to create the objects back to the 
 	 *			primary memory
 	 *
 	 *		To make certain fields not readable but still have class readable:
 	 *			can make field static. statics are meant just to be used for class, not going to be any memory for the object
	 * 			can use keyword transient where you do not want them to be static yet still not have them written to the disc when saving state of object
	 *  
	 *  
	 *  W5P12 - Average
	 *  	see Week05_Average
	 *  
	 *  	Scanner - has useful methods to read what you like from any source including files
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */	
	
}
