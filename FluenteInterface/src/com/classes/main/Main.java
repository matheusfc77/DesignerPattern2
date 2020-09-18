package com.classes.main;

import com.classes.pais.Pais;

public class Main {

	public static void main(String[] args) {
		
		Pais pais = new Pais()
				.chamado("Noruega")
				.localizadoNoContinente("Europeu")
				.comNumeroDeHabitantes(5400000)
				.possuiComoCapital("Oslo");
		
		System.out.print(pais);
	}
}
