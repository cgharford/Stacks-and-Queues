package Assignment_1;

public class Stack<T> {

	private Node top; 
	
	public Stack() {
		top = null; 
	}
	
	public boolean isEmpty() {
		return (top == null); 
	}
	
	//Returns top element of stack
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		
		else {
			return (T) top.getData();
		}
	}
	
	//Removes top element from stack
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		else {
			T removedTop = (T) top.getData();
			top = top.getNext();
			return removedTop;
		}
	
	}
	
	//Adds element to top of stack
	public void push(T element) {
		top = new Node(element, top);
	}
}
