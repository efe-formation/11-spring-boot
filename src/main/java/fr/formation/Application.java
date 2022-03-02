package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.model.Personne1;
import fr.formation.model.Personne2;
import fr.formation.model.Personne3;
import fr.formation.model.Personne4;
import fr.formation.model.Personne5;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private Personne1 p1;

	@Autowired
	private Personne2 p2;

	@Autowired
	@Qualifier("directeur")
	private Personne3 directeur;

	@Autowired
	@Qualifier("violette")
	private Personne3 rh;
	
	@Autowired
	private Personne4 p4;
	
	@Autowired
	private Personne5 p5;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Coucou");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(directeur);
		System.out.println(rh);
		System.out.println(p4);
		System.out.println(p5);
		
	}

	
	// Ajouter -Dspring.profiles.active=peugeot
	
}
