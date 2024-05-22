package br.com.fiap.service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.fiap.model.localidades.Localidade;
import br.com.fiap.model.localidades.LocalidadeResponse;

public class LocalidadesIbgeService {
	
	public List<Localidade> getLocalidades() throws IOException {
		
		List<Localidade> localidades = null;
		
		HttpGet resquest = new HttpGet("https://servicodados.ibge.gov.br/api/v1/localidades/mesorregioes");
		
		try (CloseableHttpClient httpCient = HttpClientBuilder.create().disableRedirectHandling().build();
				CloseableHttpResponse response = httpCient.execute(resquest)){
			
			HttpEntity entity = response.getEntity();
			
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				
				Gson gson = new Gson();
				
				Type listType = new TypeToken<List<Localidade>>() {}.getType();
				
				localidades = gson.fromJson(result, listType);
				
			}
		}
		
		return localidades;
	}
}
