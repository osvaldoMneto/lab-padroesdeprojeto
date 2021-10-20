package testeSingleton;

public class SingletonLazy {
	
	/** Singleton pregui�oso"
	 * 
	 * @atutor Osvaldo
	 * n�o pode ser instanciado
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


