package data;

public interface BT<T> {
	boolean insert(T data);
	boolean delete(BTNode<T> node);
	boolean compare(T data1, T data2);//True when 1>2, false for less and error when equal
	BTNode<T> search(T data);
}
