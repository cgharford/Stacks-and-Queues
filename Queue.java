package Assignment_1;

public class Queue<T> {
	
	protected Node front, rear;
	
	public Queue() {
		front = null;
		rear = null;
	}

	public boolean isEmpty() {
		//Both front and rear are null or not null; no need to check both
		return (front == null);   
	}
	
	//Returns the top element of the queue
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		else {
			return (T) front.getData();
		}
	}
	
	//Removes an element from the front of a queue
	public T dequeue() {
		if (isEmpty()) {
			return null;
		}
		else {
			T removedFront = (T) front.getData();
			front = front.getNext();
			//If list is now empty
			if (front == null) {
				rear = null;
			}
			return removedFront;
		}
	}
	
	//Adds an element to the rear of the queue
	public void enqueue(T element) {
		Node temp;
		if (isEmpty()) {
			front = rear = new Node(element, null);
		}
		else {
			temp = rear;
			rear = new Node(element, null);
			temp.setNext(rear);
		}		
	}
}
