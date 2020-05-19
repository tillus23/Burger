public class Salat extends Zutat {
	
	/**
	 * Initialisierungskonstruktor
	 * 
	 * @param nummer      ID des Salates
	 * @param name        Bezeichnung des Salates
	 * @param preis       Preis des Salates
	 * @param klassisch   Ist es ein klassischer Salat?
	 * @param vegetarisch Ist es ein vegetarischer Salat?
	 * @param vegan       Ist es ein veganer Salat?
	 */
	public Salat (int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan) {
		super(nummer, name, preis, klassisch, vegetarisch, vegan);
	}
	
	/**
	 * @return Zeitaufwand in Sekunden
	 */
	public int zubereiten() {
		System.out.println(name + " wird geschüttelt.");
		return 0;
	}

	public int berechneHoehe() {
		return 0;
	}

}
