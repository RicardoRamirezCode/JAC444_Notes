import java.io.*;

class FindChar {

	public static void main(String[] args) throws IOException {

		if (args.length != 2)
			throw new IllegalArgumentException("use: java FindChar char file");

		int match = args[0].charAt(0);
		// read character in first command line argument, since it is a string have to get back as character
		// saved as integer as later on we will be reading something as an integer and comparing
		
		FileReader fileIn = new FileReader(args[1]);

		LineNumberReader in = new LineNumberReader(fileIn);
		// this has methods which can be used to give line number
		int ch;
		while ((ch = in.read()) != -1) {
			if (ch == match) {
				System.out.println("'" + (char) ch + "' at line " + in.getLineNumber());
				in.close();
				return;	// as asked to return first occurrence
			}
		}
		System.out.println((char) match + " not found ");
		in.close();
	}
}
