package com.classes.prototype;

public class NoruegaPrototype extends PaisPrototype {

	public NoruegaPrototype() {
		this.moraAtualmente = false;
	}
	
	public NoruegaPrototype(NoruegaPrototype noruegaPrototype) {
		this.moraAtualmente = noruegaPrototype.isMoraAtualmente();
	}
	
	@Override
	public String info() {
		return "\nPaís: Noruega\nCapital: Oslo\nMora atualmente: " + this.isMoraAtualmente();
	}

	@Override
	public PaisPrototype clonar() {
		return new NoruegaPrototype(this);
	}

}
