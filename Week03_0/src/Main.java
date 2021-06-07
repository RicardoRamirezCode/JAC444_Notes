public class Main {
	
	public static void main(String[] args) {
		//relationships between subclasses and superclasses:
		
		//1
		Base b1 = new Base();
		System.out.println(b1.getI());
		
		//2
		Extended e1 = new Extended();
		System.out.println(e1.getI());//Pay attention to inheritance in here!
		System.out.println(e1.getJ());
		
		//3
		Base b2 = new Extended();//Inheritance relationship
		// here b2 from class base will be referring to an Extended object at runtime 
		System.out.println(b2.getI());//OK
//		System.out.println(b2.getJ());//Not allowed!
		// b2 can point to Extended but since b2 is of type Base; we cannot access specialized version of Extended

		//4
//		Extended e2 = new Base();//Not allowed!
		
//		Extended e3 = (Extended) b1;//Creates ClassCastException
		// here we tried to downcast b1 to Extended; but since b1 is pointing to object of type Base, it cannot be downcast
		
		Extended e4 = (Extended) b2;//This time OK! (you can downcast)
		System.out.println(e4.getI());
		System.out.println(e4.getJ());
		
		//but you could make it even safer:
		if (b2 instanceof Extended) {
			Extended e5 = (Extended) b2;
			System.out.println(e5.getI());
			System.out.println(e5.getJ());
		}
		
		
		if (b1 instanceof Extended) {
			Extended e6 = (Extended) b1;
			System.out.println(e6.getI());
			System.out.println(e6.getJ());
		} else {
			System.out.println("Did not run as it was not allowed because inheritance relationships are one-way");
		}
		
	}

}
