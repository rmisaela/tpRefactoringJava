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
	
	/**
	 * Indique une amitié entre 2 humains avec une autre paramètre durré de l'amitié
	 * 
	 * @param humain L'amie
	 * @param durre_amitie La durée de l'amitié
	 */
	public void ami(Humain humain, int durre_amitie);
}
