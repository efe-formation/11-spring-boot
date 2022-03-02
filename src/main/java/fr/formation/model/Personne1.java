package fr.formation.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Personne1 {

	@Value("${nomp1}")
	private String nom;
	
	@Value("${prenomp1}")
	private String prenom;
	
	@Value("${agep1}")
	private int age;
	
	public Personne1() {
	}

	
	public Personne1(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne1 [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
