package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * This class has 2 fields, array of integer and int k. Method kComplementaryPair will return a list of pair.
 * The average time complexity id O(n)
 * The basic idea is array2[j]=k-array1[i]
 * So the intersection of array2 and array1 are the complementary pairs
 * 
 */
public class ComplementaryPairs {

	private int[] array;
	int k;

	public ComplementaryPairs(int[] array, int k) {

		this.array = array;
		this.k = k;
	}

	public List<Pair> kComplementaryPairs() {
		List<Pair> pairs = new ArrayList<Pair>();
		int length = array.length;
		// This will have key as the array[i] and value as the list of index i
		// with value i
		HashMap<Integer, List<Integer>> hm = new HashMap<>();
		// For loop to load the above hashMap
		for (int i = 0; i < length; i++) {
			if (!hm.containsKey(array[i])) {
				List<Integer> l = new ArrayList<>();
				l.add(i);
				hm.put(array[i], l);
			} else {
				hm.get(array[i]).add(i);
			}
		}
		// In this for loop we are getting the intersection
		for (int i = 0; i < length; i++) {
			if (hm.containsKey(k - array[i])) {
				for (Integer j : hm.get(k - array[i])) {
					Pair pair = new Pair(i, j);
					pairs.add(pair);
				}
			}
		}
		if (pairs.isEmpty()) {
			System.out.println("No Pair found");
		} else {
			for (Pair pair : pairs) {
				System.out.println(pair.toString());
			}
		}
		return pairs;
	}

	/*
	 * Inner class of pair
	 */
	public class Pair {
		int i;
		int j;

		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}

		@Override
		public String toString() {
			return "(" + i + "," + j + ")";
		}

	}

}
