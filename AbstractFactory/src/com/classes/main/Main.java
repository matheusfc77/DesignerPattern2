package com.classes.main;

import com.classes.factories.FabricaAsia;
import com.classes.factories.FabricaEuropa;
import com.classes.factories.IFabricaDePais;
import com.classes.factories.IPaisDesenvolvido;
import com.classes.factories.IPaisSubdesenvolvido;

public class Main {

	public static void main(String args[]) {
		
		IFabricaDePais fabrica = new FabricaEuropa();
		
		IPaisDesenvolvido desenvolvido = fabrica.criarPaisDesenvolvido();
		IPaisSubdesenvolvido subdesenvolvido = fabrica.criarPaisSubdesenvolvido();
		
		System.out.println(desenvolvido.exibirInfoDesenvolvido());
		System.out.println(subdesenvolvido.exibirInfoSubdesenvolvido());
		
		fabrica = new FabricaAsia();
		
		desenvolvido = fabrica.criarPaisDesenvolvido();
		subdesenvolvido = fabrica.criarPaisSubdesenvolvido();
		
		System.out.println(desenvolvido.exibirInfoDesenvolvido());
		System.out.println(subdesenvolvido.exibirInfoSubdesenvolvido());
	}
}
