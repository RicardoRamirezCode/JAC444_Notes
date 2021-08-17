import java.rmi.Naming;

public class Week11 {

	/*
	 Week 11 - Understanding Distributed Computation in Java using RMI
	 
	 W11P1 - Introduction to RMI in Java
	 
	 still in use, but other web services have taken over
	 having two objects on two different JVM
	 
	 RMI (Remote Method Invocation)
	 	action of invoking a method on a remote object
	 	one of the approaches to distributed computing in Java
	 	
	 remote object residing on a server side machine, running inside a second jvm on server side
	 
	 remote object is an object whose methods can be invoked from another JVM
	 
	 remote interface is an interface that declares a set of methods that may be implemented by a remote
	 	JVM
	 	this remote interface from java.rmi.Remote is one of those interfaces that has nothing to implement;
	 	its simply a tagging interface
	 	
	 note exceptions can occur on methods run in this interface (such as if server crashes)
	 
	 RECALL ALL METHODS INSIDE ANY INTERFACE ARE ALWAYS PUBLIC
	 
	 also, it needs to be an interfaces as, 
	 both need to be aware of the methods (services) exposed on the client-side /server-side
	 it is a bit like a contract between the two (it outlines the method, return type and params), we (client)
	 do not need to know its implementation on server side
	 
	 
	 Distributed Objects
	 	interfaces define behavior
	 	classes define implementation
	 	
	 	RMI Interfaces define methods for RMI interfaces
	 	RMI Server implements methods defined by Interfaces
	 	RMI Client invokes methods (after getting access to the remote object on server side) defined by Interfaces
	 
	 
	 Building an RMI System
	 	design and implement Java RMI interfaces
	 	develop Java code implementing classes defined by RMI interfaces
	 	develop code for Java RMI server program
	 	develop code for Java RMI client program
	 	install and run RMI system - registering those services, deploying those implementations on the server side
	 							so that client on client side can look up, access and call those remotely
	 							
	 							
	 Aside: what are the proxy objects for the client and the server?
	 			for the client side, we have proxy object name stub
	 			on the server side we have skeleton
	 			
	 			what happens behind scene, as client if there is an object running on server you think
	 			as client you are able to look up server registry and grab a reference to one of those remote
	 			objects (and pass arguments and call methods on that remote server side object)
	 			what actually happens behind scene (using these stub and skeleton proxy object)
	 			they do all these over TCP/IP
	 			
	 			so you may think you are calling these methods locally but are not
	 			All happens over TCP/IP; calling a method on an object you think is on the client side, but in reality
	 			is a reference to a remote object!!
	 			
	 W11P2 - First Example: Hello.java
	 	see Week11_RMIHello
	 	
	 	Steps to set up:
	 	
	 	1. Interface
	 	Hello.java is the interfaces
	 	
	 	2. Implementation
	 	HelloImpl.java is the implementation
	 		this needs to just be on server side, client does not need to know (or should know internal implementation)
	 		note as it extends UnicastRemoteObject it MUST have an explicit constructor 
	 		in order to declare the RemoteException exception
	 
	 		this subclass (HelloImpl) of this super class (UnicastRemoteObject) handles the same exception
	 		that might be thrown while we try to create the object
	 	3. Setting up server
	 	HelloServer.java is the server
	 	
	 		Naming.rebind("rmi://localhost:1099/HelloService", obj);
			// use rebind, as bind is for first time
			// it will bind this 'obj'
			// to this service name 'HelloService'
			// on rmi protocol
			// on this machine 'localhost'
			// at this port number 1099
			 
		note need to run rmiregistry in our bin directory (where we have access to all class files)
		
		at this point it is ready for the client
		
		4. the client
			initially we made an object on client side based on same Hello interface shared by both client and server
			set to null
			
			client needs to know two things:
				interface
				name of service
			it will return back a remote object (which we have to downcast)
			then we can call the method on this object
			
		after we are done we need to terminate the server and the rmiregistry
		
	 W11P3 - Second Example: Calculator.java
	 	see Week11_RMICalculator
	 	
	 All happens over TCP/IP; calling a method on an object you think is on the client side, but in reality
	 is a reference to a remote object!
	 
	 */
}
