package sorting;

public class Palindrome {

	/*
	 * The time complexity is O(n) where n is the lenght of the string. Here the
	 * idea is we are comparing start point and end point of char array than
	 * start point +1 and endpoint -1 till startPoint < endPoint.
	 */
	public boolean IsPalindrome(String string) {
		if (string==null || string.isEmpty()) {
			return false;
		}
		int i = 0;
		int j = string.length() - 1;
		while (i < j) {
			if (string.charAt(i) != string.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

}
