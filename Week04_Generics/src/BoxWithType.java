/** Generic Box class. */ 

class BoxWithType<T> { // T is called type parameter, it is T by convention

	private T t; 

	public void add(T t) { 
		this.t = t; 
	} 

	public T get() { 
		return t; 
	} 
}
