
public class Week10 {
	/*
	 Week 10 - URLs, Sockets, and Client/Server Networking in Java
	 
	 W10P1 - Introduction, InetAddress, and Local.java
	 
	 InetAddress class represents an Internet Protocol (IP) address
	 see Week10_Local
	 
	 W10P2 - URL, and ReadSites.java
	 URL is an acronym for Uniform Resource Locator
	 	is a reference (address) to a resource on the Internet
	 see Week10_ReadSites
	 
	 still need java.io.* as we still use streams [openStream] and readLine methods
	 means we the same ios streams that can be used to be connected to some input/output over IP
	 
	 W10P3 - Client-Server Programming Using Sockets, and EchoServer.java
	 Socket - class implementation CLIENT sockets
	 ServerSocket - class implementation SERVER sockets
	 
	 Useful Commands
	 ipconfig									// to determine IPv4 Address
	 telnet localhost SomeSocketNumber
	 netstat -a -n -o							// all ports and use and their PID
	 Taskkill /PID SomeProcessID /F				// to kill process from above
	 
	 see Week10_ReadFromSocket
	 in the situation we use:
	 Socket s = new Socket("localhost", 7777) and DO NOT have a server running on that port,
	 we receive an exception java.net.ConnectException of Connection refused as there is no server
	 
	 see Week10_EchoServer
	 
	 here we have EchoServer expecting to receive and echo back
	 but our ReadFromSocket is not sending anything
	 so echoserver will see connect and stop
	 
	 now if we run EchoServer, then use command prompt
	 	telnet localhost 7777		// note if you are using another machine you'd need to replace
	 								// localhost with correct ip address
	 								 
	 can now echo between server and client
	 loop is broken if we send null string or if client dies
	 
	 issue with our code is we also just have one threaded server, if we attempt two connects it will not work properly
	 (multi-thread would be good, for each client connecting should have a thread)
	 
	 
	 W10P4 - Implementing a Multi-Threaded Server, and ThreadedEchoServer.java
	 	difference with previous, it keeping alive until you manually terminate it - much like normal server behaviour
	 	and it's multi-threaded
	 	
	 	see Week10_ThreadedEchoServer
	 		should have both classes in separated into separated .java files but for simplicity put in same
	 		
	 W10P5 - Car Registration Problem
	 	see Week10_CarRegistration
	 	for example think of CarClient as the dealership, and CarServer as an agency that takes those cars
	 	and has to register them and sent back to client
	 	here we will be sending objects (not just text) of type Car
	 	
	 	from previous, we can simply implement Serializable on Car class
	 	it may not be writing to file or reading to file from local file system
	 	
	 	for CarServer, despite if we are using some local file or on server, we still use same type of ObjectOutputStream
	 	we get ObjectOutputStream from client, and read it and downcast to Car
	 	then we use hashCode (just returns an integer based on object) to register car
	 	
	 	for CarClient, after setup and creating 3 Cars (in an array called cars)
	 	I as the client, am sending the objects 3 times; which I can as all cars have implemented Serializable
	 
	 	to test this program:
	 	run server
	 	then run CarClient
	 	
	 	else we can:
	 	run server
	 	navigate to directory (bin) in cmd and run CarsClient
	 		java .\CarsClient.class   OR java CarsClient
	 		
	 	Not best practice, should be multi threaded as it dies when last car is complete
	 	
	 	
	 */
	

}
