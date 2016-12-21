package data;

public abstract class AbstractBST<T> implements BT<T> {
	private BTNode<T> root;

	@Override
	public boolean insert(T data) {
		if (root == null) {
			root = new BTNode<T>(data);
			return true;
		}
		BTNode<T> n = root;
		while (true) {
			if (compare(data, n.getData())) {
				if (n.getLeft() == null) {
					n.setLeft(new BTNode<T>(data));
					return true;
				} else {
					n = n.getLeft();
				}
			} else {
				if (n.getRight() == null) {
					n.setRight(new BTNode<T>(data));
					return true;
				} else {
					n = n.getRight();
				}
			}
		}
	}

	@Override
	public BTNode<T> search(T data) {
		if (root == null || data == null) {
			return null;
		}
		BTNode<T> n = root;
		while (data != n.getData() || n != null) {
			if (compare(data, n.getData())) {
				n = n.getLeft();
			} else {
				n = n.getRight();
			}
		}

		return n;
	}

	@Override
	public boolean delete(BTNode<T> node) {
		return false;
	}

	public BTNode<T> getRoot() {
		return root;
	}

	public void setRoot(BTNode<T> root) {
		this.root = root;
	}

}
