package data;

public class LinkedList<T> {
	LinkedListNode<?> head;
	LinkedListNode<?> tail;
	int size;

	public LinkedList(T data) {
		this.head = new LinkedListNode<T>(data);
		this.tail = this.head;
		this.size = 1;
	}

	public void append(T data) {
		if (this.head == null) {
			this.head = new LinkedListNode<T>(data);
			this.tail = this.head;
		} else {
			tail.setNext(new LinkedListNode<T>(data));
			tail.getNext().setPrevious(tail);
			tail = tail.getNext();
		}
		size++;
	}

	public void push(T data) {
		LinkedListNode<T> newHead = new LinkedListNode<T>(data);
		newHead.setNext(this.getHead());
		this.head.setPrevious(newHead);
		this.setHead(newHead);
	}

	public void pop() {
		this.setHead(this.getHead().getNext());
		this.getHead().setPrevious(null);
	}

	public void enqueue(T data) {
		this.append(data);
	}

	public void dequeue() {
		this.setHead(this.getHead().getNext());
		this.getHead().setPrevious(null);
	}

	public void delete(LinkedListNode<?> node) {
		node.getPrevious().setNext(node.getNext());
	}

	public LinkedListNode<?> getHead() {
		return head;
	}

	public void setHead(LinkedListNode<?> head) {
		this.head = head;
	}

	public LinkedListNode<?> getTail() {
		return tail;
	}

	public void setTail(LinkedListNode<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		LinkedListNode<?> n = head;
		if (n == null) {
			sb.append(" Null");
			return sb.toString();
		} else {
			while (n != null) {
				sb.append(n.getData() + " ");
				n = n.getNext();
			}
		}
		sb.append("}");
		return sb.toString();
	}

}
