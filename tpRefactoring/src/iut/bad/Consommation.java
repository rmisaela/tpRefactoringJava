package iut.bad;

public interface Consommation {
	public void manger();
	public void boire();
	
	/**
	 * Indique une amitié entre 2 humains
	 * 
	 * @param humain
	 */
	public void ami(Humain humain);
}
