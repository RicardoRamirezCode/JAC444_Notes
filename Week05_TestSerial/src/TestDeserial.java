import java.io.*;

public class TestDeserial {

	public static void main(String args[]) {

		Test testobj = null;

		try {

			FileInputStream fis = new FileInputStream("file.out");

			ObjectInputStream ois = new ObjectInputStream(fis);

			testobj = (Test)ois.readObject();		// read object will be returning an object
													// have to downcast to Test to access its fields (using methods from end lines)

			fis.close();

		} catch (Throwable e) {
			System.err.println(e);
		}
		System.out.println("Deserialization--readObject string: " + testobj.getString());
		System.out.println("Deserialization--readObject int: " + testobj.getInt());
	}
}

// not constructor of Test is not called, whole object will be read from memory
// object is alive in primary memory