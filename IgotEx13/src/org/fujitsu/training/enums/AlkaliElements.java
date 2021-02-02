package org.fujitsu.training.enums;

public enum AlkaliElements {
	LITHIUM("Lithium", "Li", 3), SODIUM("Sodium", "Na", 11), POTASSIUM("Potassium", "K", 19),
	RUBIDIUM("Rubidium", "Rb", 37), CESIUM("Cesium", "Cs", 55), FRANCIUM("Francium", "Fr", 87);

	
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

	private AlkaliElements(String element, String symbol, int atomicN) {
		this.element = element;
		this.symbol = symbol;
		this.atomicN = atomicN;
	}

	@Override
	public String toString() {
		return String.join(element + " " + "symbol" + " " + atomicN);
	}

}
