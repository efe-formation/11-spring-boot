package fr.formation.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.model.Personne4;

@Configuration
public class Personne4Configuration {

	@Bean
	@ConditionalOnProperty(name = "usine", havingValue = "nantes")
	Personne4 getP41() {
		return new Personne4("Lechene", "Alex", 63);
	}
	

	@Bean
	@ConditionalOnProperty(name = "usine", havingValue = "paris")
	Personne4 getP42() {
		return new Personne4("Lechataignier", "Aline", 36);
	}
}
