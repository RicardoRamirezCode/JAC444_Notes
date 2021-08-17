import java.io.*;
import java.net.*;

public class ReadFromSocket {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 7777);
			// make a new (client) socket and connect it to our local host [could be replaced by 
			// any IP address] and and on that server look on that port number
			
			InputStream is = s.getInputStream();					// byte stream
			InputStreamReader isr = new InputStreamReader(is);		// turn into char stream
			BufferedReader br = new BufferedReader(isr);			// wrap by buffered reader
			
			String theLine = br.readLine();			// reads only first line
			System.out.println(theLine);
			
			s.close();
		} catch (IOException e) {
			System.out.println("Exception: " + e);
		}
	}
}

