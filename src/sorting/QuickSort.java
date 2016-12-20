package sorting;

import java.util.Comparator;
import java.util.List;

public class QuickSort extends AbstractSorting {

	private int NoOfSwaps = 0;
	private int NoOfCompare = 0;
	List list;
	Comparator c;

	// Complexity of this is nlogn we would not see any difference when the list
	// size is small but if the list size is high this is quite efficient
	// The basic idea comes form divide and conquer
	// This is better than merge Sort, Complexity of both the algo is same but
	// performance generally is better of QuickSort, Memory vice quite efficient
	// No extra Memory is required but a poor use of pivot can eventually reduce
	// the advantage, Also sometimes due to more number of same elements performance of this can go down
	@Override
	public <E> void sort(List<E> list, Comparator c) {
		
		this.list = list;
		this.c = c;
		quickSort(0, list.size() - 1);
		System.out.println("No of Set operation in Quick sort = " + NoOfSwaps);
		System.out.println("No of Compare operation in Quick sort = " + NoOfCompare);
	}

	@SuppressWarnings("unchecked")
	private void quickSort(int start, int end) {
		if (end > start) {
			
			int wall = partitionFunction(start,end);
			quickSort(start,wall-1);
			quickSort(wall+1,end);

		}

	}

	private int partitionFunction(int start, int end) {
		int pivot = end;
		int s = start;
		int e = end-1;
		int wall=s;//This variable is critical without this we cannot get the value of the partition
		while(e>s){
			if((c.compare(list.get(s), list.get(pivot)) <= 0)){
				this.NoOfCompare++;
				s++;
				wall++;
			}
			if((c.compare(list.get(e), list.get(pivot)) >= 0)){
				this.NoOfCompare++;
				e--;
			}
			if(((c.compare(list.get(s), list.get(pivot)) > 0)&& (c.compare(list.get(e), list.get(pivot)) < 0))){
				swap(s,e,list);
				this.NoOfSwaps++;
				this.NoOfCompare++;
				this.NoOfCompare++;
				s++;
				e--;
				wall++;
			}
		}
		swap(wall,end,list);
		this.NoOfSwaps++;
		return wall;
	}

}
