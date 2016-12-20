package sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class RQuick extends AbstractSorting {

	private int NoOfSwaps = 0;
	private int NoOfCompare = 0;
	List list;
	Comparator c;

	// This is similar to QuickSort, we also use a nit of bubble sort 
	@Override
	public <E> void sort(List<E> list, Comparator c) {
		this.list = list;
		this.c = c;
		rQuickSort(0, list.size() - 1);
		System.out.println("No of Set operation in Quick sort = " + NoOfSwaps);
		System.out.println("No of Compare operation in Quick sort = " + NoOfCompare);

	}

	@SuppressWarnings("unchecked")
	private void rQuickSort(int start, int end) {
		if (end > start) {
			Random randomizer = new Random();
			int pivot = start + randomizer.nextInt(end - start);
			swap(start, pivot, list);
			int position = start + 1;
			boolean flag = false;
			for (int i = start + 1; i < end + 1; i++) {
				if (c.compare(list.get(start), list.get(i)) > 0) {
					swap(position, i, list);
					position++;
				}
			}
			;
			swap(position - 1, start, list);
			rQuickSort(start, position - 2);
			rQuickSort(position, end);
		}
	}
}
