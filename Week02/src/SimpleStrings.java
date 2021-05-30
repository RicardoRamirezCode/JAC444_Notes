public class SimpleStrings {
	
	public static void main(String[] args) {
		System.out.println("abc");
		String cde = "cde";
		
		System.out.println("abc" + cde);
		System.out.println("abc" + cde.length());
		System.out.println(("abc" + cde).length());
		System.out.println("abc".charAt(2));//what if we say System.out.println("abc".charAt(3));
		
		String c = "abc".substring(2, 3);	// second param is exclusive, so from 2 to 2; so from second char to second char
		System.out.println(c);
		
		String d = cde.substring(1, 2);
		System.out.println(d);
	}
}
