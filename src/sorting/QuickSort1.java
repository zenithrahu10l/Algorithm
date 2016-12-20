package sorting;

public class QuickSort1 {

	private int array[];
	private int length;
	public int comp=0;

	public QuickSort1(int[] array) {
		this.array = array;
		this.length = array.length;
		quicksort(0, length - 1);
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void quicksort(int i, int j) {
		int pivot = array[j];
		int wall = i;
		for (int k = i; k <= j; k++) {
			if (array[k] < pivot) {
				swap(wall, k);
				wall++;
			}
			this.comp++;
		}
		swap(wall, j);
		if (i < wall - 1) {
			quicksort(i, wall - 1);
		}
		if (j > wall + 1) {
			quicksort(wall + 1, j);
		}
	}

	private void swap(int i, int k) {
		if (i != k) {
			int temp = array[i];
			array[i] = array[k];
			array[k] = temp;
		}
	}

}
