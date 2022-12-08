package iut.bad;

public class Homme extends Humain {

	public Homme() {
		super();
	}

	public Homme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}

	public Homme(String nom, String prenom) {
		super(nom, prenom);
	}

	public Homme(String nom) {
		super(nom);
	}

	@Override
	public String toString() {
		return "Homme [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}
