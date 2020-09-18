package com.classes.factories;

import com.classes.paises.Nepal;
import com.classes.paises.Singapura;

public class FabricaAsia implements IFabricaDePais {

	@Override
	public IPaisDesenvolvido criarPaisDesenvolvido() {
		return new Singapura();
	}

	@Override
	public IPaisSubdesenvolvido criarPaisSubdesenvolvido() {
		return new Nepal();
	}

}
