package fr.formation.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import fr.formation.model.Personne5;

@Configuration
@Profile("renault")
public class Personne5RenaultConfiguration {

	@Bean
	Personne5 getP5() {
		return new Personne5("Renault", "G", 44);
	}

}
