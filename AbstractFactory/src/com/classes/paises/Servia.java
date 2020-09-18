package com.classes.paises;

import com.classes.factories.IPaisSubdesenvolvido;

public class Servia extends Pais implements IPaisSubdesenvolvido {

	public Servia() {
		super("Servia", "Europeu", 6982000, "Belgrado");
	}
	
	@Override
	public String exibirInfoSubdesenvolvido() {
		return "País subdesenvolvido: " + super.toString();
	}

}
