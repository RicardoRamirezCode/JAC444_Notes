/** Box class. */ 
// only option before java 5 to have a 'box' of anything:

public class Box { 

	private Object o;
	// Object is parent class of all objects in Java

	public void add(Object o) { 
		this.o = o; 
	} 

	public Object get() { 
		return o; 
	} 
} 
