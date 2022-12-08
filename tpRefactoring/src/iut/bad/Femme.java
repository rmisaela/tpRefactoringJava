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

	@Override
	public String toString() {
		return "Femme [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	public void main() {
		Homme homme = new Homme();
		Femme femme = new Femme();
		
		homme.ami(femme);
	}
	
	
}
