package fr.formation.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import fr.formation.model.Personne5;

@Configuration
@Profile("default")
public class Personne5GeneriqueConfiguration {

	@Bean
	Personne5 getP5() {
		return new Personne5("generique", "G", 44);
	}

}
