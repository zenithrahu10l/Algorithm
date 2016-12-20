package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MergeSort extends AbstractSorting {
	private int NoOfSwaps = 0;
	private int NoOfCompare = 0;
	List list;
	Comparator c;

	// Complexity of this is nlogn we would not see any differnece when the list
	// size is small but if the list size is high this is quite efficient
	// The basic idea comes form divide and conquer we divide list the mist and
	// the merge
	@Override
	public <E> void sort(List<E> list, Comparator c) {
		// mergeSort(list, c);
		this.list = list;
		this.c = c;
		mergeSort(0, list.size() - 1);
		System.out.println("No of Set operation in Merge sort = " + NoOfCompare);
		System.out.println("No of Compare operation in Merge sort = " + NoOfCompare);
	}

	private void mergeSort(int start, int end) {
		if (end > start) {
			int middle = ((start + end) / 2);
			mergeSort(start, middle);
			mergeSort(middle + 1, end);
			merge(start, middle, end);
		}

	}

	private <E> void merge(int start, int middle, int end) {
		List<E> tempList1 = new ArrayList<E>();
		List<E> tempList2 = new ArrayList<E>();
		tempList1.addAll(list.subList(start, middle + 1));
		tempList2.addAll(list.subList(middle + 1, end + 1));
		int add = start;
		int l1 = 0;
		int l2 = 0;
		int s1 = tempList1.size();
		int s2 = tempList2.size();
		int size = end - start + 1;
		for (int i = 0; i < size; i++) {
			this.NoOfCompare++;
			if (l1 < s1 && (l2 >= s2 || (c.compare(tempList1.get(l1), tempList2.get(l2)) < 0))) {
				list.set(add, tempList1.get(l1));
				l1++;
				add++;
			} else {
				list.set(add, tempList2.get(l2));
				add++;
				l2++;
			}
		}

	}
}

// private int array[];
// private int length;
// public int comp=0;
//
// public MergeSort(int[] array) {
// this.array = array;
// this.length = array.length;
// quicksort(0, length - 1);
// }
//
// public int[] getArray() {
// return array;
// }
//
// public void setArray(int[] array) {
// this.array = array;
// }
//
// public int getLength() {
// return length;
// }
//
// public void setLength(int length) {
// this.length = length;
// }
//
// public void quicksort(int i, int j) {
//
// if(array[i]>array[j]){
// swap(i, j);
// }
//
// this.comp++;
// int n =(i/2)+(j/2);
// if (n-i > 0) {
// quicksort(i, n);
// }
// if (j-(n+1) > 0) {
// quicksort( n+ 1, j);
// }
// }
//
// private void swap(int i, int k) {
// if (i != k) {
// int temp = array[i];
// array[i] = array[k];
// array[k] = temp;
// }
// }
