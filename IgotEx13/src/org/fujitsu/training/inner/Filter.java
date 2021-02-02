package org.fujitsu.training.inner;

public interface Filter {
	static boolean accept(String x) {return true;}
	
	

	public static boolean filter2(String x) {
		// String that ends with s
		int n = x.length();
		if (x.charAt(n - 1) == 's' || x.charAt(n - 1) == 'S') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean filter3(String x) {
		// palindrome
		int n = x.length();
		String palindrome = "";
		for (byte i = (byte) (n - 1); n >= 0; n--) {
			palindrome = palindrome + x.charAt(i);
		}
		if (x.equalsIgnoreCase(palindrome)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean filter4(String x) {
		// if starts with number
		if (Character.isDigit(x.charAt(0))) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean filter5(String x) {
		// check if odd characters count
		if (x.length() % 2 == 0) {
			return false;
		} else { 
			return true;
		}
	}
}
