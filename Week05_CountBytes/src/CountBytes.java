import java.io.*;

class CountBytes {

	public static void main(String[] args) throws IOException {

		InputStream in;				// dealing with byte based Streams not character based
		if (args.length == 0)
			in = System.in;			// either set to System.in which by default is the keyboard
		else
			in = new FileInputStream(args[0]);	// or set to file stream 

		int total = 0;
		while (in.read() != -1)
			total++;

		System.out.println(total + " bytes ");
	}
}
