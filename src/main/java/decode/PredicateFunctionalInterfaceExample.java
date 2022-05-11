package decode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample {
	public static void main(String[] args) {

		// PredicateFunctionalInterfaceExample predicateFunctionalInterfaceExample= new
		// PredicateFunctionalInterfaceExample();
		// System.out.println("number is even :
		// "+predicateFunctionalInterfaceExample.test(45));
		// System.out.println("number is even :
		// "+predicateFunctionalInterfaceExample.test(4));

		/*
		 * Predicate<Integer> predicateFunctionalInterfaceExample = (t) -> { if (t % 2
		 * == 0) { return true; } else { return false; } };
		 * System.out.println(predicateFunctionalInterfaceExample.test(47));
		 */
		
		/*
		 * Predicate<Integer> predicateFunctionalInterfaceExample = t -> t % 2==0;
		 * System.out.println(predicateFunctionalInterfaceExample.test(78));
		 */
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
		intList.stream().filter(t -> t % 2==0).forEach(t->System.out.println(t));
	}

	/*
	 * @Override public boolean test(Integer t) { if (t % 2 == 0) { return true; }
	 * else { return false; } }
	 */

}
