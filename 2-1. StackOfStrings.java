/*
//Stack : Linked list 
public class StackOfStrings {

	private Node first = null;
	
	private class Node {
		String item;
		Node next;
	}
	public boolean isEmpty() {
		return first == null;
	}
	
	public void push(String item)
	{
		Node second = first;
		first = new Node();
		first.item = item;
		first.next = second;
	}
	
	public String pop()
	{
		String item = first.item;
		first = first.next;
		return item;
	}
}
*/

//stack : Array implementation
public class StackOfStrings {
	private String[] s;
	private int N = 0;
	
	public StackOfStrings(int capacity) {
		s = new String[capacity];
	}
	
	public boolean isEmpty() {
		return N ==0;
	}
	
	public void push(String item) {
		s[N++] = item;
	}
	
	public String pop() {
		String item = s[N-1];
		s[N-1] = null;	// avoid loitering
		N--;
		return item;
	}
}


