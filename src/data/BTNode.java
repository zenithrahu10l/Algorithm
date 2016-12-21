package data;

public class BTNode<T> {

	private BTNode<T> left ;
	private BTNode<T> right;
	private T data;
	
	 BTNode(T data){
		this.left=null;
		this.right=null;
		this.data = data;
		
	}

	public BTNode<T> getLeft() {
		return left;
	}

	public void setLeft(BTNode<T> left) {
		this.left = left;
	}

	public BTNode<T> getRight() {
		return right;
	}

	public void setRight(BTNode<T> right) {
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
