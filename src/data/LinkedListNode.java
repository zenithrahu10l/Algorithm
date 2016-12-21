package data;

public class LinkedListNode <T> {
	
	private LinkedListNode<?> next ;
	private T data;
	private LinkedListNode<?> previous; 
	
	public LinkedListNode(T data) {
		this.setData(data);
		this.setPrevious(null);
		this.setNext(null);
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LinkedListNode<?> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<?> next) {
		this.next = next;
	}

	public LinkedListNode<?> getPrevious() {
		return previous;
	}

	public void setPrevious(LinkedListNode<?> previous) {
		this.previous = previous;
	}
}
