package org.fujitsu.training.enums;

public enum TransitionMetal {
	SCANDIUM("Scandium","Sc", 21), TITANIUM("Titanium", "Ti", 22), 
	VANADIUM("Vanadium","V",22),CHROMIUM("Chromium","Cr",24), 
	MANGANESE("Manganese","Mn",25), IRON("Iron","Fe",26), COBALT("Cobalt","Co",27),
	NICKEL("Nickel","Ni",28), COPPER("Copper","Cu",29), ZINC("Zinc","Zn",30),
	YTTRIUM("Yttrium","Y",39), ZIRCONIUM("Zirconium","Zr",40), 
	NIOBIUM("Niobium","Nb",41), MOLYBDENUM("Molybdenum","Mo",42), 
	TECHETIUM("Techetium","Tc",43), RUTHENIUM("Ruthenium","Ru",44),
	RHODIUM("Rhodium","Rh",45), PALLADIUM("Palladium","Pd",46), SILVER("Silver","Ag",47),
	CADMIUM("Cadmium","Cd",48), HAFNIUM("Hafnium","Hf",72), TANTALUM("Tantalum","Ta", 73),
	TUNGSTEN("Tungsten","W",74), RHENIUM("Rhenium","Re",75), OSMIUM("Osmium","Os",76),
	IRIDIUM("Iridum","Ir",77), PLATINUM("Platinum","Pt",78), GOLD("Gold","Au",79), 
	MERCURY("Mercury","Hg",80), RUTHERFORDIUM("Rutherfordium","Rf",104), 
	DUBNIUM("Dubnium","Db",105), SEABORGIUM("Seaborgium","Sg",106), 
	BOHRIUM("Bohrium","Bh",107), HASSIUM("Hassium","Hs",108), 
	MEITNERIUM("Meitnerium","Mt",109), DARMSTADTIUM("Darmstadtium","Ds",110),
	ROENTGENIUM("Roentgenium","Rg",111), COPERNICIUM("Copernicium","Cn",112);
	
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
	
	private TransitionMetal(String element, String symbol, int atomicN) {
		this.element = element;
		this.symbol = symbol;
		this.atomicN = atomicN;
	}
	@Override
	public String toString() {
		return String.join(element + " " + "symbol" + " " + atomicN);
	}
	
	
}
