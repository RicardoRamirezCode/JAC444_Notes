@FunctionalInterface			// optional not mandatory, just makes compiler ensure it is a functional interface
public interface Action<T> {		// interface is generic
	void change(T t);				// so takes an argument lowercase t of type T
}
