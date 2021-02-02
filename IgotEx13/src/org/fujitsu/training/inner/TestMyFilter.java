package org.fujitsu.training.inner;

import java.util.ArrayList;
import java.util.List;

public class TestMyFilter {

	public static void main(String[] args) {
		MyFilter mf = new MyFilter();
		List inputs = new ArrayList();
		inputs.add("Hello");
		inputs.add("SAs");
		inputs.add("1qwr");
		inputs.add("civic");
		inputs.add("kayak");
		inputs.add("2414");
		inputs.add("we2e");
		inputs.add("tgdw");
		inputs.add("fsdfs");
		inputs.add("qwecaas");
		mf.filter(inputs.toString(),);

	}

}
