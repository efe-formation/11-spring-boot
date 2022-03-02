package fr.formation.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.model.Personne3;

@Configuration
public class Personne3Configuration {

	@Bean
	Personne3 directeur() {
		return new Personne3("Larose", "Isa", 33);
	}

	@Bean("violette")
	Personne3 getP32() {
		return new Personne3("Laviolette", "Marie", 42);
	}
}
