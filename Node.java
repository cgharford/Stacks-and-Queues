package Assignment_1;

public class Node<T> {

	private T data; 
	private Node<T> next;
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public T getData() {
		return (T) data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node<T> nextNode) {
		next = nextNode;
	}
}
