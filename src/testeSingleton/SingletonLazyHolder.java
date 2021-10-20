package testeSingleton;

public class SingletonLazyHolder {
	
	/** Singleton preguiçoso"
	 * 
	 * @atutor Osvaldo
	 * não pode ser instanciado
	 * 
	 */

		public static class InstanciaHolder{
			public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		}
	
		
		private SingletonLazyHolder() {
			super();
			
		}
		
		public 	static  SingletonLazyHolder getInstancia() {
			
			return InstanciaHolder.instancia;
		}
			
		}


