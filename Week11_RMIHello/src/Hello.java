//RMI interface
import java.rmi.Remote; 
import java.rmi.RemoteException; 

// recall this Remote is tagging interface (exploring it shows that it is empty)
// just tells JVM this could be used as remote interface inside some RMI program
public interface Hello extends Remote { 
	String sayHello(int timeOfDay) throws RemoteException; 
}

// this interface needs to be shared by both client and server 
// client at minimum needs to know sayHello (what is passed, what it returns)