package sorting;

import java.util.Comparator;
import java.util.List;

public class InsertSort extends AbstractSorting {

	@Override
	public <E> void sort(List<E> list, Comparator c) {
		int NoOfSwaps = 0;
		int NoOfCompare = 0;
		int size = list.size();
		int insert = 0;

		for (int i = 0; i < size; i++) {
			insert = i;
			E element = list.get(i);
			for (int j = i-1; j > 0; j--) {
				NoOfCompare++;
				if (c.compare(element, list.get(j)) > 0) {
					list.set(j+1, element);
					break;
					
				}else{
					list.set(j+1,list.get(j));
					NoOfSwaps++;
				}
			}
		}
		System.out.println("No of Swap operation in insert sort = " + NoOfSwaps);

		System.out.println("No of Compare operation in insert sort = " + NoOfCompare);
	}

}
