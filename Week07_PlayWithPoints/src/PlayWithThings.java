public class PlayWithThings<T> {			// generic

	public T[] things;				// private T array named things

	public void forEach(Action<T> action) {
		for (T t : things)
			action.change(t);
	}
	// above is a forEach method that takes an Action<T> then goes through all elements applying method change
	// Action<T> is our functional generic interface; many ways to pass : private inner classes,  inner classes or
	// starting java 8 or pass action using lambda expression

	public String toString() {
		String result = "";
		for (T t : things)
			result += t.getClass().getName() + ": " + t.toString() + "\n";
		return result;
	}

	public static void main(String[] args) {
		PlayWithThings<Point> playWithPoints = new PlayWithThings<>();
		// here we have a PlayWithThings of type Point (already defined Points in Points.java)

		playWithPoints.things = new Point[] { new Point(0, 0), new Point(1, 1) };
		
		// forEach takes as arguments Action<T> object
		// Action<T> is an interface; you can create an object of type Action<T>
		// if there is a class that implements Action<T> OR
		// if you build an instance of this class as an anonymous class OR
		// if you use lambda expressions
		// here are the possible implementations:
		
		//imp1:	
		// inner class inside our PlayWithThings with name MoveAction;
		// we say T extends Points so we can call method move
		// and implements our functional interface Action<T>
		// and then we provide override for abstract method change
		
//		class MoveAction<T extends Point> implements Action<T> {
//
//			@Override
//			public void change(T p) {
//				p.move(10, 10);
//			}
//			
//		}
//		
//		MoveAction<Point> innerClassImp = new MoveAction<>();
//		playWithPoints.forEach(innerClassImp);
		
		//imp2:
		// here we have a playWithPoints object and call method forEach, then we have an anonymous inner class
//		playWithPoints.forEach(new Action<Point>() {
//			public void change(Point p) {
//				p.move(10,10);
//			}		
//		});
		
		//imp3:
		// functional programming method of doing things
//		playWithPoints.forEach((Point p) -> {
//											 p.move(10, 10);
//		                                     return;
//		                                    });

		// Shortened version:
		playWithPoints.forEach(p -> p.move(10, 10));
		
		System.out.println(playWithPoints);
	}
}
