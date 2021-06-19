import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;		// needed since we are reading and writing there may be potential for (checked) exceptions raised

public class CopyBytes {

	public static void main(String[] args) throws IOException { // note normally would catch exceptions but main does not
																// note a good practice, just for demonstation purposes
		if (args.length < 2)
			return;
		// two (local) reference variables of type FileInputStream and FileOutputStream
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(args[0]);
			out = new FileOutputStream(args[1]);
			int c;

			while ((c = in.read()) != -1) {		// note read() returns an integer; in Java integer is 4 bytes
												// so it will prepend 3 bytes to beginning of that byte read
				
												// note if it reads and returns -1 it means it read a byte 8 bits of all 1s(2s complement)
												// which is different from -1 as an integer which is 4 bytes
				
				out.write(c);			// write takes an integer but writes a single byte (skips first three bytes and writes last byte)
			}

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
