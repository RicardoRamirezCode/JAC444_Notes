class ExampleTwo {
	public static void main(String[] args) {
		Student student = new Student("John");
		Exam exam = s -> s + ": Passed";					// assigned lambda as some anonymous method to exam of type Exam (our functional interface) 
		System.out.println(ExampleOne.result(student, exam));
							// result is static, so we can call (by invoking on ExampleOne class) and passing the
							// above student and exam
	}
}