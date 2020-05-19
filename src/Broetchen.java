public class Broetchen extends Zutat {
	int hoehe;
	int backzeit;

	/**
	 * Initialisierungskonstruktor
	 * 
	 * @param nummer      ID des Brötchens
	 * @param name        Bezeichnung des Brötchens
	 * @param preis       Preis des Brötchens
	 * @param klassisch   Ist es ein klassisches Brötchen?
	 * @param vegetarisch Ist es ein vegetarisches Brötchen?
	 * @param vegan       Ist es ein veganes Brötchen?
	 * @param hoehe       Höhe des Brötchens in Milimeter
	 * @param backzeit    Backzeit des Brötchens in Sekunden
	 */
	public Broetchen(int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan,
			int hoehe, int backzeit) {
		super(nummer, name, preis, klassisch, vegetarisch, vegan);
		this.hoehe = hoehe;
		this.backzeit = backzeit;
	}

	/**
	 * @return Zeitaufwand in Sekunden
	 */
	public int zubereiten() {
		System.out.println(name + " " + backzeit + " Sekunden rösten.");
		return backzeit;
	}

	/**
	 * @return Höhe des Brötchens in Milimeter
	 */
	public int berechneHoehe() {
		int backzeitInMinuten = (backzeit / 60);
		float aufbackHoeheProMinuten = (hoehe / 100) * 2;
		float aufbackHoeheGesamt = backzeitInMinuten * aufbackHoeheProMinuten;
		int gesamtHoehe = (int) (hoehe + aufbackHoeheGesamt);
		return gesamtHoehe;	
	}

}
