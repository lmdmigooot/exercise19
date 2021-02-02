package org.fujitsu.training.inner;

public class CoffeeCupIterator {

	private CoffeeCup myCup;
	
	CoffeeCup cc = new CoffeeCup() {
		@Override
		public void add(Object o) {
			super.add(o);
		}
		
	};
	
	public boolean hasNext() {
		return false;
		
	}
	
	public Object next() {
		return myCup;}
	
	public void remove() {}
}
