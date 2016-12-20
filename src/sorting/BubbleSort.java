package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BubbleSort extends AbstractSorting{

	public <E> void sort(List<E> list, Comparator c) {
		boolean swap = true;
		int NoOfSwaps=0;
		int NoOfCompare=0;
		int size = list.size()-1;
		do {
			swap = false;
			for (int i = 0; i < size; i++) {
				NoOfCompare++;
				if (c.compare(list.get(i), list.get(i + 1)) > 0) {
					swap(i, i + 1, list);
					NoOfSwaps++;
					swap = true;
				}
			}
			size--;
		} while (swap);
		System.out.println("No of Swap operation in bubble sort = "+NoOfSwaps);

		System.out.println("No of Compare operation in bubble sort = "+NoOfCompare);
	}

}