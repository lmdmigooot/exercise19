package org.fujitsu.training.enums;

public enum MetalElements {

	ALUMINUM("Aluminum", "Al", 13), GALLIUM("Gallium", "Ga", 31), 
	INDIUM("Indium", "In", 49), TIN("Tin", "Sn", 50),
	THALLIUM("Thallium", "Tl", 81), LEAD("Lead", "Pb", 82), 
	BISMUTH("Bismuth", "Bi", 83), UNUNTRIUM("Ununtrium", "Uut", 113), 
	FLEROVIUM("Flerovium", "Fl", 114), UNUNPENTIUM("Ununpentium", "Uup", 115),
	LIVERMORIUM("Livermorium", "Lv", 116);

	private String element;
	private String symbol;
	private Integer atomicN;

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getAtomicN() {
		return atomicN;
	}

	public void setAtomicN(Integer atomicN) {
		this.atomicN = atomicN;
	}

	private MetalElements(String element, String symbol, int atomicN) {
		this.element = element;
		this.symbol = symbol;
		this.atomicN = atomicN;
	}

	@Override
	public String toString() {
		return String.join(element + " " + "symbol" + " " + atomicN);
	}
}
