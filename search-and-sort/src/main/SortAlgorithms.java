//	AUTHOR: MATTHEW CARROLL

package main;

import java.util.ArrayList;

/*
 * 
 * CONTAINS A COLLECTION OF SORT ALGORITHMS ABSTRACTED FOR COMPARABLE NODES
 * 
 */

public class SortAlgorithms {

	
	/* 
	 * SELECTION SORT
	 * 
	 * SEARCHES THROUGH THE ARRAY AND SWAPS THE SMALLEST VALUE
	 * FOR THE CURRENT VALUE AFTER EACH ITERATION UNTIL THE LIST IS EXHAUSTED
	 * 
	 */
	public static void selectionSort(ArrayList<Node> list) {

		//	Outer loop iteration; every iteration will add the next
		//	smallest sorted value to the list
		for (int i = 0; i < list.size(); i++) {
			
			//	Initialize current minimum value to location i
			int min = i;
			//	Loop through all values that are not the current outer loop value
			for (int j = i + 1; j < list.size(); j++) {
				
				//	Check if value at location j is less than the current minimum;
				//	assign j as the new minimum if so
				if (list.get(j).compareTo(list.get(min)) == -1) {
					min = j;
				}
			}
			
			//	Swap the current outer loop value for the minimum value
			Node temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
	}
	
	
	/*
	 * INSERTION SORT
	 * 
	 * SEARCHES THROUGH THE ARRAY AND SWAPS THE CURRENT VALUE FOR
	 * THE ONE BEFORE IT UNTIL IT REACHES THE CORRECT SPOT
	 * 
	 */
	public static void insertionSort(ArrayList<Node> list) {
		
		//	Outer loop that moves through the whole array
		for (int i = 0; i < list.size() - 1; i++) {
			
			//	Store current index and next
			int currIndex = i;
			int nextIndex = i + 1;
			
			//	Keep moving back in the array until the beginning
			//	if the current value is more than the next value
			while (currIndex >= 0 && list.get(currIndex).compareTo(list.get(nextIndex)) == 1) {
				
				//	Swap current and next value
				Node temp = list.get(currIndex);
				list.set(currIndex, list.get(nextIndex));
				list.set(nextIndex, temp);
				
				//	Move back one space and make next value the previous current value
				currIndex--;
				nextIndex = currIndex + 1;
			}
		}
	}
	
	
	/*
	 * QUICK SORT
	 * 
	 * CREATES A PARTITION IN THE ARRAY WHERE VALUES BEFORE PARTITION ARE SMALLER
	 * AND VALUES AFTER ARE GREATER. CONTINUE THIS RECURSIVELY UNTIL THERE ARE
	 * NO MORE NODES TO SORT
	 * 
	 */
	public static void quickSort(ArrayList<Node> list) { quickSort(list, 0, list.size() - 1); }
	public static void quickSort(ArrayList<Node> list, int start, int end) {
		
		//	Only split array while the array has multiple values
		if (start < end) {
			
			//	Partition the current subsection of the array
			//	(subsection may be the whole array)
			int pivot = partition(list, start, end);
			
			//	Apply quick sort recursively for lower and upper partitions
			quickSort(list, start, pivot - 1);
			quickSort(list, pivot + 1, end);
		}
	}
	/*
	 * PARTITION
	 * 
	 * UTILITY METHOD FOR QUICK SORT ALGORITHM
	 */
	public static int partition(ArrayList<Node> list, int start, int end) {
		//	Initialize index for final pivot index
		int i = start;
		
		//	Grab node to be sorted
		Node pivotNode = list.get(end);
		
		//	Loop through all array values
		for (int j = start; j < end; j++) {
			
			//	Check if current node value is less than the partition value
			if (list.get(j).compareTo(pivotNode) == -1) {
				
				//	Swap values at j and i
				Node temp = list.get(j);
				list.set(j, list.get(i));
				list.set(i, temp);
				
				//	Increment final pivot index
				i++;
			}
		}
		
		//	Swap final pivot index node for pivot node
		list.set(end, list.get(i));
		list.set(i, pivotNode);
		
		//	Return pivot index
		return i;
	}
}
