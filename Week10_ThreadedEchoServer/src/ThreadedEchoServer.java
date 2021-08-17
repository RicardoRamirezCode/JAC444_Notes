import java.io.*;
import java.net.*;

public class ThreadedEchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket s = null;
		try {
			s = new ServerSocket(7777);
			int i = 0;
			// this time this runs forever, no breaks
			for (;;) {
				Socket incoming = s.accept();
				System.out.println("Spawning " + ++i);
				new ThreadedEchoHandler(incoming, i).start();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			s.close();
		}
	}
}

class ThreadedEchoHandler extends Thread {
	private Socket incoming;
	private int clientNumber;
	// assigning a number to each client coming in

	public ThreadedEchoHandler(Socket s, int c) {
		incoming = s;
		clientNumber = c;
	}
	
	// working with a thread so need a run method
	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
			// incoming is our client socket, that is connected to us as a server
			PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);
			// second argument, is boolean for autoflush
			// outgoing stream is flushed as soon as you try to print to client

			out.println("Hello! Enter BYE to exit.");

			boolean done = false;
			while (!done) {
				String str = in.readLine();
				if (str == null)
					done = true;
				else {
					out.println("Echo (" + clientNumber + "): " + str);
					System.out.println("Received from (" + clientNumber + "): " + str);
					if (str.trim().equals("BYE"))
						done = true;
				}
			}
			incoming.close();		// only thread dies not server
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
