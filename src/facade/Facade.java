package facade;

import subsistemaone.CrnService;
import subsistematwo.CepApi;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado= CepApi.getInstancia().recuperarEstado(cidade);
		
		
		CrnService.gravarCliente(nome, cidade, cep, estado);
		
	}

			
}
