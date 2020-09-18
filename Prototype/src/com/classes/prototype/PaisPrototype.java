package com.classes.prototype;

public abstract class PaisPrototype {

	protected boolean moraAtualmente;
	public abstract String info();
	public abstract PaisPrototype clonar();
	
	public boolean isMoraAtualmente() {
		return moraAtualmente;
	}
	public void setMoraAtualmente(boolean moraAtualmente) {
		this.moraAtualmente = moraAtualmente;
	}
	
}
