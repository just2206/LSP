package org.howard.edu.lsp.assignment6.integerset;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


/**
 * This class takes an integer set and uses arraylist functions with them
 * @author burns
 *
 */
public class IntegerSet {
	
		private List<Integer> set = new ArrayList<Integer>();

		/**
		 * Default constructor
		 */
		public IntegerSet() {
			
		}

		/**
		 * This method clears the data inside the set
		 */
	public void clear() {
		set.clear();
	};

	/**
	 * This method 
	 * @return the length of the string
	 */
	public int length() {
		int length = set.size();
		return length;
	}; 

	/**
	 *This method
	 * @return true the sets are equal, false otherwise
	 * @param intSetb is the integer set  from the driver
	 */
	public boolean equals (IntegerSet intSetb) {
		boolean isEqual = true;
		if (intSetb.length() == set.size())
		{
			for (int i = 0; i < set.size(); i++)
			{
				for (int k = 0; k < intSetb.length(); k++)
				{
					if (set.get(i) == intSetb.set.get(k))
					{
						isEqual = true;
					}
					else 
					{
						isEqual = false;
					}
				}
			}
		}
		else
		{
			isEqual = false;
		}
		return isEqual;
	}; 

	/** 
	 * This method 
	 * 
	 * @param value is the specific number of the set
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		int number = value;
		boolean has = set.contains(number);
		if (has)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	};    

	/** 
	 * This method
	 * @return the largest item in the set; Throws a IntegerSetException if the set is empty 
	 */
	public int largest()  
	{
		int maxNumber = 0;
		boolean empty = set.isEmpty();
		if (empty == true)
		{
			throw new RuntimeException("The set is empty.");
		}
		else
		{
			for (int temp : set) 
			{
				int maxNumber1= set.get(0);
				if (maxNumber1 < temp) 
				{	
					maxNumber1 = temp;
					
				}
				maxNumber = maxNumber1;
			}
		}
		return maxNumber;
	}; 

	/** 
	 * This method
	 * @return the smallest item in the set; Throws a IntegerSetException if the set is empty
	 */
	public int smallest()  
	{
		int minNumber = 0;
		boolean empty = set.isEmpty();
		if (empty == true)
		{
			throw new RuntimeException("The set is empty.");
		}
		else
		{
			for (int temp : set) 
			{
				int minNumber1= set.get(0);
				if (minNumber1 > temp) 
				{	
					minNumber1 = temp;
					
				}
				minNumber = minNumber1;
			}
		}
		return minNumber;
	};


		/** Adds an item to the set or does nothing it already there
		 * 	
		 * @param item the value being added to the integer set
		 */
	 	public void add(int item) {
	 		boolean there = set.contains(item);
	 		if (there == false)
	 		{
	 			set.add(item);
	 		}	
	 		else
	 		{
	 			return;
	 		}
	 	}; 

		/** Removes an item from the set or does nothing if not there
		 * 
		 * @param item the integer being removed from the set
		 */
	public void remove(int item) {
		boolean there = set.contains(item);
		if (there == true)
		{
			set.remove(item);
		}	
		else
		{
			return;
		}
	};  

	/** Set union
	 * 
	 * @param intSetb the 2nd integer set being sent in
	 */
	public void union(IntegerSet intSetb) 
	{
		HashSet<String> newSet = new HashSet<>(); 
		String string1 = set.toString();
		String string2 = intSetb.toString();
		
		string1 = string1.replaceAll("[\\[\\](){}]","");
		string2 = string2.replaceAll("[\\[\\](){}]","");
		
		newSet.add(string1);
		newSet.add(string2);
		
		
		System.out.println(newSet);
		return;
	
	};

	/** Set intersection
	 * 
	 * @param intSetb the 2nd integer set being sent in
	 */
	public void intersect(IntegerSet intSetb) 
	{
		
	}
	/** Set difference, i.e., s1 –s2
	 * 
	 * @param intSetb the 2nd integer set being sent in
	 */
	public void diff(IntegerSet intSetb) {}; 

	/** 
	 * This method
	 * @return true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		boolean empty = set.isEmpty();
		if(empty == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}; 

	/** 
	 * This method
	 *@return string representation of your set
	 */
	public String toString() {
		String ofArray = set.toString();
		return ofArray;
	};	

}
