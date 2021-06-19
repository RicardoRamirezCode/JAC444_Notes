import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;		// to buffer whatever we are going to be reading from IO
												// will increase efficiency as we do not have to go access IO for every individual character
												// read or write (in this case read)
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(args[0]));	// BufferedReader takes in its constructor a reader
																		// anything that inherits reader can be pass (polymorphism)
			// here we have arg[0] the first command line argument as a string
			// wrapped in a file reader so it gives back a file reader which could be used as a reader (inheritance)
			// use whole thing in constructor of BufferedReader
			
			
			outputStream = new PrintWriter(new FileWriter(args[1]));

			String l;
			while ((l = inputStream.readLine()) != null) {		// we actually read lines from buffer (making program more efficient) as not
																// accessing secondary memory for each and every character it wants to read
				outputStream.println(l);	// whatever we have read write to this output target
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
