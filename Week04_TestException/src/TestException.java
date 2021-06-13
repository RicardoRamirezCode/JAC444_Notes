public class TestException {

	public static void test(int k, int[] intArray, String string) {
		int j = 1 / k;
		int len = intArray.length + 1;
		char c;

		try {
			c = string.charAt(0);
			if (k == 10)
				j = intArray[3];
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index Out Of Bounds Exception");

		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception");

		} catch (NullPointerException ex) {
			System.out.println("NullPointer Exception");

		} finally {
			System.out.println("Finally Clause");
		}

		System.out.println("Exit Try Block");
	}

	public static void main(String[] args) { 

		int k = 0;
		int[] ia = {1, 2, 3};
		String s = "jac444";
//		test(k, ia, s); //1
		// here this will cause an exception when in the first line of test method it attempts to divide by 0
		// its not caught as its outside of any try block
		// here no check to see if k is not zero nor any exception handling thus it will crash our code

		k = 10; s = "";
//		test(k, ia, s); //2
		// string s is empty, when it attempts to set c to string.charAt(0) string index out of bounds exception
		// none of the catch conditions catches this exception
		// this will mean it will crash however finally block will run
		
		s = "Reza";
//		test(k, ia, s); //3

		s = null;
//		test(k, ia, s); //4
		// here we have null.charAt(0) which gives us a nullpointerexception which does have a catch block
	}
}