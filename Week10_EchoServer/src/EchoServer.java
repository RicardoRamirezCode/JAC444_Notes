import java.io.*;
import java.net.*;

class EchoServer {
	public static void main(String[] args) {
		System.out.println("EchoServer started.");

		try {
			ServerSocket serverSocket = new ServerSocket(7777);
			// no need to set host as it will be running on this (so only port needed)
			Socket clientSocket = serverSocket.accept();
			// listens for a connection to be made to socket accepts

			System.out.println("Connected to port: " + clientSocket.getLocalPort());
			
			// best to have two streams (one for input and one for output)
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			// again take byte stream, make char, and then buffered
			PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

			// using this out; we do not print to system out (the console)
			out.println("Hello! This is Java EchoServer. Enter BYE to exit.");
			out.flush();	// as we are using buffered reader best to use flush

			// forever loop
			for (;;) {
				String str = in.readLine();

				if (str == null) {
					break;
				} else {
					// write (send) back to the client whatever was received
					// adding the Echo string in front of it
					out.println("Echo: " + str);
					out.flush();
					System.out.println("Received from Client: " + str);

					if (str.trim().equals("BYE"))
						break;
				}
			}
			
			clientSocket.close();
			serverSocket.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.println("EchoServer stopped.");
	}
}