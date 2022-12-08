package iut.bad;

public class Humain implements Consommation {
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public Humain(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = 0;
	}

	public Humain(String nom) {
		super();
		this.nom = nom;
		this.prenom = "";
		this.age = 0;
	}

	public Humain() {
		super();
		this.nom = "Adam";
		this.prenom = "";
		this.age = 3000;
	}
	
	/**
	 * Affiche le nom, le prenon et l'age
	 */
	public void details() {
		System.out.println("Nom : "+ this.nom + "\nPrenom : "+ this.prenom + "\nAge : "+ this.age);
	}

	@Override
	public void manger() {
		
	}

	@Override
	public void boire() {
		
	}

	@Override
	public void ami(Humain humain) {
		
		
	}

}
