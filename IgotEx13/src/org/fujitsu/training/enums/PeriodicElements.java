package org.fujitsu.training.enums;

public class PeriodicElements {

	public void callElement(String input) {
		input = input.toUpperCase();
		
		//check if element entered exists in Alkali
		for(AlkaliElements ae : AlkaliElements.values()) {
			if(ae.name().equals(input)) {
				System.out.printf("Name: %s\n",ae.getElement());
				System.out.printf("Symbol: %s\n",ae.getSymbol());
				System.out.printf("Atomic Number: %d\n",ae.getAtomicN());
				System.out.println("Alkali Metal Element");
			}
		}
		
		//check if element entered exists in Basic Metal
		for(MetalElements me : MetalElements.values()) {
			if(me.name().equals(input)) {
				System.out.printf("Name: %s\n",me.getElement());
				System.out.printf("Symbol: %s\n",me.getSymbol());
				System.out.printf("Atomic Number: %d\n",me.getAtomicN());
				System.out.println("Basic Metal Element");
			}
		}
		
		//check if element entered exists in Transition Metal
		for(TransitionMetal tm : TransitionMetal.values()) {
			if(tm.name().equals(input)) {
				System.out.printf("Name: %s\n",tm.getElement());
				System.out.printf("Symbol: %s\n",tm.getSymbol());
				System.out.printf("Atomic Number: %d\n",tm.getAtomicN());
				System.out.println("Alkali Metal");
			}
		}
		
	}
}

