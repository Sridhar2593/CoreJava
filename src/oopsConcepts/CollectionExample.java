package oopsConcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<ClassA> mylist1 = new ArrayList<ClassA>();

		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Sri");
		mylist.add("Sridhar");
		mylist.add("Sridahr P");
		mylist.add("Rajamma");
		
		System.out.println("Before Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		System.out.println("After Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println("After Descending Order");
		System.out.println(mylist);
		
	    Stack<String> mystack = new Stack<String>();
	    mystack.push("abc");
	    mystack.push("def");
	    mystack.pop();
	    mystack.push("ghi");
	    System.out.println(mystack);
		
	}

}
