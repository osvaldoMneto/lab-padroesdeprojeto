package testeSingleton;

public class SingletonEager {
	
	/** Singleton apressado"
	 * 
	 * @atutor Osvaldo
	 * n�o pode ser instanciado
	 * 
	 */
	
	private static SingletonEager instancia = new SingletonEager();
	
		private SingletonEager() {
			super();
			
		}
		
		public 	static  SingletonEager getInstancia() {
			
			return instancia;
		}
			
		}


