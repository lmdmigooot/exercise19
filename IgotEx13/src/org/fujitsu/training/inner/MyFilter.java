package org.fujitsu.training.inner;

import java.util.ArrayList;
import java.util.List;

public class MyFilter {

	private static List filterred1 = new ArrayList();

	public static String[] filter(String[] a, Filter f) {
		
		Filter1 f1 = new Filter1() {

			@Override
			public boolean filters1() {
				return false;
			}
		
		};
		for (String look : a) {
			boolean decision1 = Filter.filter1(look);
			boolean decision2 = Filter.filter2(look);
			boolean decision3 = Filter.filter3(look);
			boolean decision4 = Filter.filter4(look);
			boolean decision5 = Filter.filter5(look);
			if (decision1 = true) {
				filterred1.add(a);
			}

			if (decision2 = true) {
				filterred1.add(a);
			}
			if (decision3 = true) {
				filterred1.add(a);
			}
			if (decision4 = true) {
				filterred1.add(a);
			}
			if (decision5 = true) {
				filterred1.add(a);
			}
			
		}
		
		return (String[]) filterred1.toArray();
	}
}
