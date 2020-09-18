package com.classes.paises;

import com.classes.factories.IPaisSubdesenvolvido;

public class Nepal extends Pais implements IPaisSubdesenvolvido {

	public Nepal() {
		super("Nepal", "Asiático", 28090000, "Katmandu");
	}
	
	@Override
	public String exibirInfoSubdesenvolvido() {
		return "País subdesenvolvido: " + super.toString();
	}
	
}
