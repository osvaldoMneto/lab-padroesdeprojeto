package testeSingleton;

public class SingletonLazyHolder {
	
	/** Singleton pregui�oso"
	 * 
	 * @atutor Osvaldo
	 * n�o pode ser instanciado
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


