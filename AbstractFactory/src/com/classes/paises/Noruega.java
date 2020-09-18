package com.classes.paises;

import com.classes.factories.IPaisDesenvolvido;

public class Noruega extends Pais implements IPaisDesenvolvido {
	
	public Noruega() {
		super("Noruega", "Europeu", 5400000, "Oslo");
	}
	
	@Override
	public String exibirInfoDesenvolvido() {
		return "País desenvolvido: " + super.toString();
	}

}
