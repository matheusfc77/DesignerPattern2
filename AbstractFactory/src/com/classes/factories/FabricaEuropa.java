package com.classes.factories;

import com.classes.paises.Noruega;
import com.classes.paises.Servia;

public class FabricaEuropa implements IFabricaDePais {

	@Override
	public IPaisDesenvolvido criarPaisDesenvolvido() {
		return new Noruega();
	}

	@Override
	public IPaisSubdesenvolvido criarPaisSubdesenvolvido() {
		return new Servia();
	}

}
