package iut.bad;

public class Femme extends Humain {

	public Femme() {
		super();
		this.nom = "Eve";
	}

	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}

	public Femme(String nom, String prenom) {
		super(nom, prenom);
	}

	public Femme(String nom) {
		super(nom);
	}
	
}
