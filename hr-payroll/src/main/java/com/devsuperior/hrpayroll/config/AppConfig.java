package com.devsuperior.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	// registrar uma instância única (Singleton) do tipo RestTemplate
	// disponivel para injetar em outros componentes
	// ou seja, criar um componente através de uma chamada de método
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
