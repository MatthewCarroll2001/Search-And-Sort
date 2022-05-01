//	AUTHOR: MATTHEW CARROLL

package main;

import java.util.ArrayList;

/*
 * 
 * MAIN CLASS USED FOR TESTING THE ALGORITHMS
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		//	Call tests for search and sort methods
		
		System.out.println("TESTING SORT ALGORITHMS:\n");
		testSort();
		
		System.out.println("\n");
		
		System.out.println("TESTING SEARCH ALGORITHMS:\n");
		testSearch();
		
	}
	
public static void testSort() {
		
		//	TESTING OUT SELECTION SORT
		ArrayList<Node> list1 = new ArrayList<>();
		
		list1.add(new Node(6));
		list1.add(new Node(3));
		list1.add(new Node(-2));
		list1.add(new Node(9));
		list1.add(new Node(1));
		list1.add(new Node(-5));
		list1.add(new Node(-7));
		list1.add(new Node(4));
		list1.add(new Node(3));
		
		System.out.println("Selection Sort:");
		
		System.out.println("\tStarting Values:");
		System.out.println("\t" + list1);
		
		SortAlgorithms.selectionSort(list1);
		
		System.out.println("\tSorted Values:");
		System.out.println("\t" + list1);
		
		
		//	TESTING OUT INSERTION SORT
		ArrayList<Node> list2 = new ArrayList<>();
		
		list2.add(new Node(7));
		list2.add(new Node(2));
		list2.add(new Node(-3));
		list2.add(new Node(-7));
		list2.add(new Node(-9));
		list2.add(new Node(15));
		list2.add(new Node(6));
		list2.add(new Node(11));
		list2.add(new Node(-11));
		
		System.out.println("\nInsertion Sort:");
		
		System.out.println("\tStarting Values:");
		System.out.println("\t" + list2);
		
		SortAlgorithms.insertionSort(list2);
		
		System.out.println("\tSorted Values:");
		System.out.println("\t" + list2);
		
		
		//	TESTING OUT QUICK SORT
		ArrayList<Node> list3 = new ArrayList<>();
		
		list3.add(new Node(4));
		list3.add(new Node(-4));
		list3.add(new Node(-3));
		list3.add(new Node(9));
		list3.add(new Node(5));
		list3.add(new Node(-8));
		list3.add(new Node(7));
		list3.add(new Node(-7));
		list3.add(new Node(10));
		
		System.out.println("\nQuick Sort:");
		
		System.out.println("\tStarting Values:");
		System.out.println("\t" + list3);
		
		SortAlgorithms.quickSort(list3);
		
		System.out.println("\tSorted Values:");
		System.out.println("\t" + list3);
	}
	
	public static void testSearch() {
		
		//	TESTING LINEAR SEARCH
		ArrayList<Node> list1 = new ArrayList<>();
		
		list1.add(new Node(5));
		list1.add(new Node(4));
		list1.add(new Node(3));
		list1.add(new Node(2));
		list1.add(new Node(1));
		list1.add(new Node(0));
		list1.add(new Node(-1));
		list1.add(new Node(-2));
		list1.add(new Node(-3));
		
		System.out.println("List to be searched through using linear search:\n\t" + list1);
		
		int targetVal = -3;
		int index = SearchAlgorithms.linearSearch(list1, new Node(targetVal));
		
		if (index >= 0)
			System.out.println("\t" + targetVal + " is at index " + index);
		else
			System.out.println("\t" + "Target value " + targetVal + " not found in list");
		
		//	TESTING BINARY SEARCH
		ArrayList<Node> list2 = new ArrayList<>();
		
		list2.add(new Node(5));
		list2.add(new Node(-3));
		list2.add(new Node(1));
		list2.add(new Node(7));
		list2.add(new Node(2));
		list2.add(new Node(-9));
		list2.add(new Node(11));
		list2.add(new Node(3));
		list2.add(new Node(6));
		
		//	Sort the list in order for binary search to work
		SortAlgorithms.quickSort(list2);
		
		System.out.println("\nList to be searched through using binary search:\n\t" + list2);
		
		targetVal = 2;
		index = SearchAlgorithms.binarySearch(list2, new Node(targetVal));
		
		if (index >= 0)
			System.out.println("\t" + targetVal + " is at index " + index);
		else
			System.out.println("\t" + "Target value " + targetVal + " not found in list");
	}
}
