package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import sorting.BubbleSort;
import sorting.InsertSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.RQuick;
import sorting.SelectSort;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {5,5};
//		QuickSort qs = new QuickSort(array);
//		MergeSort ms = new MergeSort(array);
//		System.out.println(Arrays.toString(qs.getArray()));
//		System.out.println(Arrays.toString(ms.getArray()));
//		System.out.println(ms.comp);
//		System.out.println(qs.comp);
		String s = "qQq";
//		ComplementaryPairs cp = new ComplementaryPairs(array, 10);
//		List<Pair> pairs = cp.kComplementaryPairs();
		
//		Palindrome p = new Palindrome();
//		String[] arrayString = {"1221","2222","","qwQ","QQQQQQQIQQQQQQQ","QWQWQWQWQWQWQWQWQWQWQ","<(;'|';)>",null};
//		for (String s2:arrayString){
//		System.out.println(s2+"	"+p.IsPalindrome(s2));
//		}
//		System.out.println(Integer.MAX_VALUE);
//		String path = "/Users/rahulsoni/Documents/workspace/Algorithm/src/sorting/tes.txt";
//		try {
//			PrintWriter writer = new PrintWriter(path,"UTF-8");
//			
//			for(int i=0;i<100000 )
//		} catch (FileNotFoundException | UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		TopPhrases tp = new TopPhrases(path);
//		for(String phrase : tp.topPhrases){
//			if(phrase!=null)
//			System.out.println(phrase +" " + tp.map.get(phrase) );
//		}
		
		List<Integer>list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(56);
		list.add(65);
		list.add(45);
		list.add(34);
		list.add(43);
		list.add(32);
		
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(list);
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(list);
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list);

		List<Integer> list4 = new ArrayList<>();
		list4.addAll(list);
		List<Integer> list5 = new ArrayList<>();
		list5.addAll(list);

		SelectSort ss = new SelectSort();
		ss.sort( list3,new IntegerComparator());
		BubbleSort bs = new BubbleSort();
		bs.sort( list2,new IntegerComparator());
		InsertSort is = new InsertSort();
		is.sort( list1,new IntegerComparator());

		MergeSort ms = new MergeSort();
		ms.sort( list,new IntegerComparator());

		QuickSort qs=new QuickSort();
		qs.sort(list4, new IntegerComparator());
		RQuick rs = new RQuick();
		rs.sort(list5, new IntegerComparator());
		System.out.println(list.size());

		for(Integer i : list5){
			System.out.println(i);
		}
	}
	
	static class IntegerComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}
		
	}

}
