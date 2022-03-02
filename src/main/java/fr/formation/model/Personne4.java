package fr.formation.model;

public class Personne4 {

	private String nom;
	private String prenom;
	private int age;
	
	public Personne4() {
	}

	
	public Personne4(String nom, String prenom, int age) {
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
		return "Personne4 [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
