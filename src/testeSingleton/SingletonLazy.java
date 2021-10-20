package testeSingleton;

public class SingletonLazy {
	
	/** Singleton preguiçoso"
	 * 
	 * @atutor Osvaldo
	 * não pode ser instanciado
	 * 
	 */
	
	private static SingletonLazy instancia;
	
		private SingletonLazy() {
			super();
			
		}
		
		public 	static  SingletonLazy getInstancia() {
			
			if( instancia == null ) {
				
				instancia = new SingletonLazy();
			}
			
			return instancia;
		}
			
		}


