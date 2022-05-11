package decode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import decode.Interface.Lambda;

public class Decode4uRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lambda lambda=()->{
			System.out.println("Lambda");
		};
		lambda.test();
		
		List<String> l1=new ArrayList<>();
		
		List<String> l2=new LinkedList<>();
		
		List<Integer> v = new Vector<Integer>(10);
		v.add(9);
		v.add(2,9);
		System.out.println(v);
		List<Integer> v2 = new Stack<Integer>();
		//Comparator comp= 
		//Consumer cons
		//Predicate pred
		//Supplier supl
		
		

	}

}
