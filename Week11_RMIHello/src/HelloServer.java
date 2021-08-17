//RMI Server
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
	public static void main(String args[]) {
		try {
			// Create the object implemtation
			Hello obj = new HelloImpl();
			// obj is of type interface, we can do as our implementation is a child of both 
			// Hello and UnicastRemoteObject [inheritance and polymorphism]

			// Bind this object instance to the name "HelloService"
			// Remember to run rmiregistry first!
			Naming.rebind("rmi://localhost:1099/HelloService", obj);
			// use rebind, as bind is for first time
			// it will bind this 'obj'
			// to this service name 'HelloService'
			// on rmi protocol
			// on this machine 'localhost'
			// at this port number 1099
			
			// And here's the second solution (without the need of running rmiregistry)
			// this is prefered as we do not need to run in cmd rmiregistry
//			Registry registry = LocateRegistry.createRegistry(1099);	// automaticall on localmachine
//			registry.rebind("HelloService", obj);

			System.out.println("HelloService bound in registry");
			System.out.println("HelloService is running");
		} catch (Exception e) {
			System.err.println("Problem: " + e);
			System.exit(1);
		}
	}
}