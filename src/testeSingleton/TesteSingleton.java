package testeSingleton;

import facade.Facade;
import strategy.Comportamento;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class TesteSingleton {
	public static void main ( String[]args) {
		
		//Singleton 
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager =SingletonEager.getInstancia();
		System.out.println(eager);
		
		
		// Strategy 
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo zequinha = new Robo();
		zequinha.setComportamento(normal);
		zequinha.mover();
		zequinha.mover();
		zequinha.setComportamento(defensivo);
		zequinha.mover();
		zequinha.mover();
		zequinha.mover();
		
		//facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Joao", "456560040");
	}
	

}
