//	AUTHOR: MATTHEW CARROLL

package main;

import java.util.ArrayList;

/*
 * 
 * CONTAINS A COLLECTION OF SEARCH ALGORITHMS ABSTRACTED FOR COMPARABLE NODES
 * 
 */

public class SearchAlgorithms {
	
	/*
	 * LINEAR SORT
	 * 
	 * SIMPLY SEARCHES THROUGH ALL ITEMS IN A LIST ONE AT A TIME
	 * AND RETURNS THE INDEX OF THE GIVEN VALUE AT ITS FIRST INSTANCE;
	 * THIS IS SLOW BUT DOES NOT REQUIRE A SORTED LIST
	 */
	public static int linearSearch(ArrayList<Node> list, Node target) {
		
		//	Search through all items and return index when target is found
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).compareTo(target) == 0)
				return i;
		}
		
		//	Return -1 if the target is not found
		return -1;
	}
	
	
	/*
	 * BINARY SEARCH
	 * 
	 * SEARCHES TO SEE IF A VALUE IS WITHIN THE FIRST OR SECOND
	 * HALF OF A LIST, AND CONTINUES TO DO THIS WITH EACH HALF
	 * UNTIL IT REACHES ITS GOAL AND THEN RETURNS THE INDEX OF THE
	 * GIVEN VALUE;
	 * THIS IS FASTER THAN LINEAR SEARCH BUT REQUIRES A SORTED LIST
	 */
	public static int binarySearch(ArrayList<Node> list, Node target) {
		
		//	Set up low and high bounds
		int low = 0;
		int high = list.size() -1;
		
		//	Search through the list until a value is found or not
		while (low <= high) {
			
			//	Define mid value in the current list
			int mid = (low + high) / 2;
			
			//	Compare the target to the mid node
			Node midNode = list.get(mid);
			int compareVal = target.compareTo(midNode);
			
			//	Return index if mid is the target
			if (compareVal == 0)
				return mid;
			//	Target is in the upper half; shift low up
			else if (compareVal == 1)
				low = mid + 1;
			//	Target is in the lower half; shift high down
			else
				high = mid - 1;
		}
		
		//	Return -1 if target is not found
		return -1;
	}
	
}
