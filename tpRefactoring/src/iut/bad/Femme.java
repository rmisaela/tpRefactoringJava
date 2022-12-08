package iut.bad;

public class Femme {
	
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Femme(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Femme(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = 0;
	}

	public Femme(String nom) {
		super();
		this.nom = nom;
		this.prenom = "";
		this.age = 0;
	}


	public Femme() {
		super();
		this.nom = "Eve";
		this.prenom = "";
		this.age = 3000;
	}
	
	
}
