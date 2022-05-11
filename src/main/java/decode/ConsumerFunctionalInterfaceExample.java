package decode;

import java.util.*;
import java.util.function.*;

public class ConsumerFunctionalInterfaceExample{

	public static void main(String[] args) {

		
		//List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
		Consumer<Integer> consumerobj= (t) -> System.out.println(t);
		consumerobj.accept(10);
		
		List<String> strList = Arrays.asList("Vikash", "Deepak", "Suraj");
		strList.stream().forEach(
				(t) -> {System.out.println(t);}
				);
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
		intList.stream().forEach(t -> System.out.println(t));

	}

	
	  //@Override 
	  //public void accept(Object t) { 
	//	  System.out.println(t);
		//  }
	 

}
