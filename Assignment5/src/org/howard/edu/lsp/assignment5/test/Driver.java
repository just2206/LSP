package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;


public class Driver {

	public static void main(String[] args) {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		
		String ofSet1;
		String ofSet2;
		
		set1.add(1);
		set1.add(2);
		set1.add(3);

		set2.add(4);
		set2.add(5);
		set2.add(6);

		
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		
		//To show add function will not add same number to list
		set1.add(1);
		System.out.println("Value of Set1 is: " + set1.toString());
		
		
		System.out.println("Value of Set2 is: " + set2.toString());
		
		
		set3.isEmpty();
		
		set1.remove(2);
		System.out.println("Value of Set1 is: " + set1.toString());
		
		
		System.out.println("Union of set 1 and set 2: ");
		set1.union(set2);
		
		
		set3.add(3);
		System.out.println("Value of Set3 is: " + set3.toString());
		set3.clear();
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println("Smallest value in Set3 is: " + set3.smallest());
		
		
		
		
		
		
		

	}

}
