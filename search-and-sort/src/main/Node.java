//	AUTHOR: MATTHEW CARROLL

package main;


/*
 * 
 * BASIC NODE FOR USING IN SORT ALGORITHMS
 * ALSO IMPLEMENTED IN OTHER PROJECTS BY MATTHEW CARROLL
 * 
 */


public class Node implements Comparable<Node>{

	private int value;
	
	public Node(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public int compareTo(Node o) {
		
		if (this.getValue() > o.getValue())
			return 1;
		else if (this.getValue() < o.getValue())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return Integer.toString(value);
	}
}
