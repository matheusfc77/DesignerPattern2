package com.classes.main;

import com.classes.prototype.NoruegaPrototype;
import com.classes.prototype.PaisPrototype;

public class Main {

	public static void main(String[] args) {
		
		NoruegaPrototype prototipo = new NoruegaPrototype();
		
		PaisPrototype noruega = prototipo.clonar();
		noruega.setMoraAtualmente(true);
		
		PaisPrototype noruega1 = prototipo.clonar();

		System.out.print(noruega.info());
		System.out.print(noruega1.info());
	}

}
