package testeSingleton;

public class SingletonEager {
	
	/** Singleton apressado"
	 * 
	 * @atutor Osvaldo
	 * não pode ser instanciado
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


