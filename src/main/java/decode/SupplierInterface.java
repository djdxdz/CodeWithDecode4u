package decode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Supplier<Boolean> supplierInterface = ()-> { List<Integer> intList =
		 * Arrays.asList(1,2,3,4,5,6,7,8); if(intList.size()>0) return true; else return
		 * false; }; System.out.println(supplierInterface.get());
		 */
		List<Integer> intList1 = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(intList1.stream().findAny().orElseGet( () -> 5));
		
		List<String> strList = Arrays.asList("Vikash", "Deepak", "Suraj");
		System.out.println(strList.stream().findAny().orElseGet( () -> "not empty"));
	}

	/*
	 * @Override public Boolean get() { List<Integer> intList =
	 * Arrays.asList(1,2,3,4,5,6,7,8); if(intList.size()>0) return true; else return
	 * false; }
	 */

}
