import java.io.*;

public class Echo {

	public static void main(String[] args) {

		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		// System.in is an input stream, could be used to read raw bytes
		// wrapped by InputStreamReader which enables me to read characters
		// then wrapped by BufferedReader which enables to read something into the buffer and be more efficient

		String s;
		try {
			while ((s = d.readLine()).length() != 0)
				System.out.println(s);
			// An empty line terminates the program
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
