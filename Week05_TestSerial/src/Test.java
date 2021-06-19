public class Test implements java.io.Serializable {		// alternative could import java.io.Serializable and implement

	private String str;				// can make transient (wont be written to file)
	private int ivalue;				// can make static (wont be written to file)


	public Test(String s, int i) {
		str = s;
		ivalue = i;
	}

	public String getString() {
		return str;
	}

	public int getInt() {
		return ivalue;
	}
	
	// note this class is read only (no setters)
}
