package fr.formation.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import fr.formation.model.Personne5;

@Configuration
@Profile("peugeot")
public class Personne5PeugeotConfiguration {

	@Bean
	Personne5 getP5() {
		return new Personne5("Peugeot", "G", 44);
	}

}
