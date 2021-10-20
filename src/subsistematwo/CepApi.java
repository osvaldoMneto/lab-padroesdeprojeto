package subsistematwo;

import testeSingleton.SingletonEager;

public class CepApi {
	
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
		
	}
	
	public 	static  CepApi getInstancia() {
		
		return instancia;
	
	}
	
	public String recuperarCidade( String cep) {
		
		return "Ilheus";
	}
		
	public String recuperarEstado( String estado) {
		
		return "BA";
	}	
	
		
	}

	


