public class ConvertExample {

	// here in method transform takes Convert<Integer, String> [integer replacing U, String replacing V]
	// and f is of type this functional interface 
	public static void transform(Convert<Integer, String> f, Integer i, String s) {
		System.out.println(f.change(i, s));
		// then we are printing method change called upon f
	}

	public static void main(String[] args) {
//		int j = 3;
		
		// here we have called transform using lambda expression; we can do this as we are passing an object
		// based off a class that is implementing functional interface
		transform(
				(Integer i, String s) -> {return String.valueOf((char) (s.charAt(0) + i));}, 
				0, 		// we can hardcord 0; else this lambda has access to fields of this class ConvertExample AND variables such as j above
				"a"
				);
		// alternatively we can remove the return:
//		transform(
//				(Integer i, String s) -> String.valueOf((char) (s.charAt(0) + i)), 
//				0, 
//				"a"
//				);
		
	}
}
