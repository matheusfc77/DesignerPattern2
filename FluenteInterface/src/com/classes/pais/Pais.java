package com.classes.pais;

public class Pais {

	private String nome;
	private String continente;
	private int numHabitante;
	private String capital;
	
	public Pais chamado(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Pais localizadoNoContinente(String continente) {
		this.continente = continente;
		return this;
	}
	
	public Pais comNumeroDeHabitantes(int numHabitantes) {
		this.numHabitante = numHabitantes;
		return this;
	}
	
	public Pais possuiComoCapital(String capital) {
		this.capital = capital;
		return this;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public int getNumHabitante() {
		return numHabitante;
	}
	public void setNumHabitante(int numHabitante) {
		this.numHabitante = numHabitante;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Pais [nome=" + nome + ", continente=" + 
				continente + ", numHabitante=" + 
				numHabitante + ", capital="
				+ capital + "]";
	}
	
	
}
