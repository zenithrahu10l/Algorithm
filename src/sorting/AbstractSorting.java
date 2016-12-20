
package sorting;

import java.util.Comparator;
import java.util.List;

public abstract class AbstractSorting {
	public abstract <E> void sort(List<E> list, Comparator c);

	public <E> void swap(int i, int j, List<E> list) {
		E temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

}
