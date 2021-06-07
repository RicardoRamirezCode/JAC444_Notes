class B extends A {
	// this is not overriding or giving new implementation; its just throwing shadow on that method in superclass
	public static void f() {
		System.out.println("f in B");
	}
	
	@Override
	public void g() {
		System.out.println("g in B");
	}
}