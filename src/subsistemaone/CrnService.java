package subsistemaone;

public class CrnService {
	
	private CrnService() {
		super();
		
	}
	public static void gravarCliente( String nome,String cidade, String cep, String estado) {
		System.out.println( "Cliente Salvo no Sistema CRN");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
	}
}