public class GenericBox {

	public static void withGeneric() {
		BoxWithType<Integer> myBox = new BoxWithType<>();
		// here we passed a type argument which will be 'replacing' all the T in BoxWithType with Integer
		// note prior to Java 7 we had to have type in both; now Java will infer
		// BoxWithType<Integer> myBox = new BoxWithType<Integer>();

		myBox.add(10);
		System.out.println(myBox.get());

		//This time, the following code DOES NOT COMPILE!
		//that would be the advantage of having generic code
//	    String s = (String) myBox.get();
//		System.out.println(s); 
	}
	
	public static void main(String[] args) {
		GenericBox.withGeneric();
	}
} 
