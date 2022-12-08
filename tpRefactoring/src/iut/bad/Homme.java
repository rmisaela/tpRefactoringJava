package iut.bad;

public class Homme extends Humain {
	
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Homme(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Homme(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = 0;
	}

	public Homme(String nom) {
		super();
		this.nom = nom;
		this.prenom = "";
		this.age = 0;
	}


	public Homme() {
		super();
		this.nom = "Adam";
		this.prenom = "";
		this.age = 3000;
	}
	
	
}
