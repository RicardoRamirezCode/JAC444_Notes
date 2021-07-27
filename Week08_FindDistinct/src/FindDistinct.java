//A program to print only distinct strings from the command line arguments of your program
import java.util.*;

public class FindDistinct {

	public static void main(String args[]) {
		Set<String> s = new HashSet<>();
		// again as before HashSet is a more specialized version of Set
		// hashed container of elements inside the set
		
		for (int i = 0; i < args.length; i++)
			if (!s.add(args[i]))		// if add returns true it means it is the first time it has been added
				System.out.println("Duplicate: " + args[i]);

		System.out.println(s.size() + " distinct arguments: " + s);
	}
}
