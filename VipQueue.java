package Assignment_1;

public class VipQueue<T> {
	Stack<T> stack;
	Queue<T> queue;
	
	public VipQueue() {
		stack = new Stack();
		queue = new Queue();
	}
	
	//Is empty only if both the stack and queue are empty
	public boolean isEmpty() {
		return (stack.isEmpty() && queue.isEmpty());
	}
	
	//Returns the top element of the stack if possible
	//If not, returns the top element of the queue
	public T peek() {
		if(isEmpty()) { 
			return null;
		}
		else if (!stack.isEmpty()) { 
			return (T) stack.peek();
		}
		else {                       //The stack is empty
			return (T) queue.peek();  
		}
	}
	
	//Removes item from front of queue
	public T dequeue() {
		if(isEmpty()) {
			return null;
		}
		if (!stack.isEmpty()) {
			T removed = (T) stack.peek();
			stack.pop();
			return removed;
		}
		else {							//The stack is empty
			T removed = (T) queue.peek();
			queue.dequeue();
			return removed;
		}
	}
	
	//Adds item to rear of queue
	public void enqueue(T element) {
		queue.enqueue(element);
	}
	
	//Adds item to the front of the queue (through the stack)
	public void vipEnqueue(T element) {
		 stack.push(element);
	}
}
