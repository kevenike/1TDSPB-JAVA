package br.com.fiap.program;

import java.io.IOException;
import java.util.List;

import br.com.fiap.model.localidades.Localidade;
import br.com.fiap.service.LocalidadesIbgeService;

public class Teste {

	public static void main(String[] args){
		
		LocalidadesIbgeService localidadeService = new LocalidadesIbgeService();
		
	    try {
			System.out.println("Nome de todas as mesoregião do Brasil\n\n");
			List<Localidade> localidades = localidadeService.getLocalidades();
			
			for(Localidade localidade : localidades) {
				System.out.println(localidade.getNome());
			}
			
		} catch (IOException e) {
			System.out.println("ERRO no serviço de llocaidade");
			e.printStackTrace();
		}
	}

}
