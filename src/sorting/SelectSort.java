package sorting;

import java.util.Comparator;
import java.util.List;

public class SelectSort extends AbstractSorting {
//If swaps are expensive than selection sort is better that bubble sort as in bubble we do more swaps but here only N
//Comparison wise both are nearly the same
	@Override
	public <E> void sort(List<E> list, Comparator c) {
		int size = list.size();
		int NoOfSwaps=0;
		int NoOfCompare=0;
		int sortedElements=0;
		do {
			int minimum=sortedElements;
			for (int i = sortedElements; i < size; i++) {
				NoOfCompare++;
				if (c.compare(list.get(minimum), list.get(i )) > 0) {
					minimum=i;
					
				}
			}
			swap(minimum, sortedElements, list);
			NoOfSwaps++;
			sortedElements++;
		} while (sortedElements<size-1);

		System.out.println("No of Swap operation in select sort = "+NoOfSwaps);

		System.out.println("No of Compare operation in select sort = "+NoOfCompare);
	}

}
