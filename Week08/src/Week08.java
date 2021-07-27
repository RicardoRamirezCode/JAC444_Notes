import java.util.Collections;

public class Week08 {
	/**
	 Week 08 - Discovering Java Collections Framework and Iterators
	 
	 W8P1 - Intro to Collectio Framework in Java
	 
	 Before tackling any problem you should consider:
	 	what kinds of algorithms you will need
	 	what types of data structures
	 
	 
	 Collection
	 	an object that contains a group of objects or groups multiple elements into a single unit
	 	sometimes called a data structure
	 	can be nested (can be collections of collections; containers composed of other containers)
	 	
	 Collection Framework
	 	unified architecture for representing and manipulating collections
	 	composed of interfaces, implementations and algorithms
	 	
	 	
	 W8P2 - Why to Use Iterators When Working with Collections (Arraylist as example)
	 
	 The Collection<E> Interface
	 	a generic interface
	 
	 	each implementation of this generic interface should be able to handle its basic operations,
	 	such as returning its size, adding an element, removing an element, etc
	 	
	 	see Week08_FilterStudents
	 	
	 	List<Student> myStudents = new ArrayList<Student>();		optional to indicate Student in ArrayList<>	
		here your reference variable, myStudents, is of type a more generic one such a List, List<Students>
		but is 'new'ed using a more specific one, such as an ArrayList<>
		this is possible because of inheritance
		
		useful as now we can pass ArrayList to any method that expects a List
		makes the code a bit more general to use 
		
	W8P3 - Lists, LinkedLists, and a bit of Functional Programming
	
		All Collections inherit from Iterable
		LinkedList useful when we need to insert/remove elements in any place (middle, at end, etc)
		ArrayList would differ as when you insert/remove an element from a ArrayList all the elements after shift
		
		ListIterator that extends Iterator; recommended way of traversing
			has methods:
				hasNext, next, hasPrevious, previous and others
			Useful if you also need to go backwards
		
		see Week08_ListExample
		here in example we have:
			Iterator<String> it = strList.iterator();
			which goes 'forward' for our example but if we needed to go 'back' we could
			
		strList.removeIf(s -> s.length() <= 5); 
			passing lambda expression to method removeIf called upon strList
			so no need for a loop, or iterators
		 
		This above is the power of functional programming, calling just functions and passing functions to other functions
		to accomplish this task
		no need to say 'how' things should be done, just 'what' should be done; no if, if  else, loop, while, etc we managed to do it cleanly
		
	
	W8P4 - Introduction to Sets, HashSets, and TreeSets
	
		may be cases where order does not matter, we have Sets in these cases
		Sets is a collection that CANNOT contain duplicate elements
		
		see Week08_FindDistinct
		
		common bulk operations on sets
			union, intersection, difference and symmetric difference
			
			Union
				Set union = new HashSet(s1);
				union.addAll(s2);
				
			Intersection
				Set intersection = new HashSet(s1);
				intersection.retainAll(s2);		// keep everything inside of s2, forget the rest
				
			Difference
				Set difference = new HashSet(s1);
				difference.removeAll(s2);
			
			Symmetric Difference (remove the overlapping elements)
			
				Set symmetricDiff = new HashSet(s1);
				symmetricDiff.addAll(s2);
				
				Set tmp = new HashSet(s1);
				tmp.retainAll(s2);	// this leaves us with the intersection, which we then remove
				symmetricDiff.removeAll(tmp);
			
		see Week08_FindUnique
			When you need non-duplicated elements, or unique, should use Set (as its a container that does not allow
			duplicated elements)
			If you do not care about ordering use HashSet (better performance) else use TreeSet to order them automatically
			
	W8P5 - Introduction to Map and Some of its Methods
	
		Maps are collections that map keeps to values
		
		public interface Map<K,V> {...
		
		basic methods:
			Object put (K key, V value)
			V get (Object key)
			Object remove(Object key)
			boolean containsKey(Object key)
			boolean containsValue(Object value)
			int size()
			boolean isEmpty()
			
		Map can not contain duplicate keys
		keySet method returns the Set of keys contained in the Map
		entrySet method returns teh Set of key-value pairs contained in the Map	(uses nested interface Map.Entry)
		
		see Week08_Rate
		
		here we used String as the key and integers as the values, then reads the array of command line
		arguments and puts the strings into the map
		nice thing about map is if it finds the string in the map, it increases the value of that key (string)
			
	W8P6 - Introduction to Algorithms in Class Collections, and Using Comparable and Comparator Interfaces
		
		recall Collection Frameworks is composed of interfaces, classes that implement those interfaces and some
		algorithms
		
		to know about ordering we need two other interfaces, Comparable interface (natural ordering, such as alphabetical, etc)
		other interface is Comparator
		
		this interface has compareTo method which returns:
			negative integer, zero, or positive integer
			if object is:
			less than, equal to, or greater than
			specified object
			
		see Week08_ComparingStudents
		
		Student implements Comparable (which is generic)
		public class Student implements Comparable<Student> {....
		which has just one method compareTo
		
		Collections.sort(list)
		can do this as our list is based off of Students and that has implemented compare
		
		Comparator interface defines comparison function (compare method)
		see CollegeStudent.java
		
		using comparator need to pass two objects to method compare
		
		Collections.sort(list, STUDENT_ORDER)
		here we use an overload of method, that takes our list and comparator as second argument
		
		if we used:
		Collections.sort(list)
		then it would be based on natural methods of sorting, calling sort method using what was implemented in class Student
		
	 	
	 */
}
