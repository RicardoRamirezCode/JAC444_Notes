import java.util.*;

public class FilterStudents {
	List<Student> myStudents = new ArrayList<>();
	// List<Student> myStudents = new ArrayList<Student>();		optional to indicate Student
	
	// here your reference variable, myStudents, is of type a more generic one such a List, List<Students>
	// but is 'new'ed using a more specific one, such as an ArrayList<>
	// this is possible because of inheritance

	public FilterStudents() {
		myStudents.add(new Student("John", 55));
		myStudents.add(new Student("Mary", 75));
		myStudents.add(new Student("Wei", 80));
	}

	public void filter(Collection<Student> coll) {		
		for (Iterator<Student> it = coll.iterator(); it.hasNext();)			
			if (!cond(it.next()))
				it.remove();
	}
	// here we remove the element using the iterator
	// difference with iterator vs for loop is iterator uses indexes that sit before the element and there is no it++ !!!
	
	// so in example where we are filtering out under 80; the iterator sits before the first element John, it 
	// removes that one but the iterator still is sitting before the 0th element (as no it++)
	// now it checks mary and it removes that one as well
	// now it checks Wei, Wei passes; now it goes past wei and nothing else to be read so loop is over
	
	
	
//	public void wrongFilter(List<Student> coll) {
//		for (int i = 0; i < coll.size(); i++) {
//			if (!cond(coll.get(i))) {
//				coll.remove(i);
//			}
//		}
//	}
	// above is a more 'traditional' method to traverse array using a for loop
	// reason it is 'wrong' is problem of using traditional for loops or while loops of a collection one by one
	// is unlike an array, when we get rid of 'first element', in our case john, it shifts everything back automatically
	// as it is a dynamically re-sizable array
	// if we changed this example to exclude under 80 instead it would produce incorrect results
	
	// first time would check john and remove him, then i would increase but next time it wouldn't be checking mary
	// but rather wei who is the 'new' i=1 and size has been changed to 2

	private static boolean cond(Student s) {
		return (s.getMark() < 70) ? false : true;
	}

	public String toString() {
		return "Students who got more than or equal to 70: " + myStudents;
	}

	public static void main(String[] args) {
		FilterStudents filteredStudents = new FilterStudents();
		filteredStudents.filter(filteredStudents.myStudents);
//		filteredStudents.wrongFilter(filteredStudents.myStudents);// test for marks below 80		
		System.out.println(filteredStudents);		
	}
}
