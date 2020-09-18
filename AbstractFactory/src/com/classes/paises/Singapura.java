package com.classes.paises;

import com.classes.factories.IPaisDesenvolvido;

public class Singapura extends Pais implements IPaisDesenvolvido {

	public Singapura() {
		super("Singapura", "Asiático", 5639000, "Singapura");
	}
	@Override
	public String exibirInfoDesenvolvido() {
		return "País desenvlvido: " + super.toString();
	}

}
