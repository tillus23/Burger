public class Bratling extends Zutat {
	int bratzeit;
	int hoehe;

	/**
	 * Initialisierungskonstruktor
	 *
	 * @param nummer      ID des Bratlings
	 * @param name        Bezeichnung des Bratlings
	 * @param preis       Preis des Bratlings
	 * @param klassisch   Ist es ein klassischer Bratling?
	 * @param vegetarisch Ist es ein vegetarischer Bratling?
	 * @param vegan       Ist es ein veganer Bratling?
	 * @param bratzeit    Bratzeit des Bratlings in Sekunden
	 * @param hoehe       Höhe des Bratlings in Milimeter
	 */
	public Bratling(int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan,
			int hoehe, int bratzeit) {
		super(nummer, name, preis, klassisch, vegetarisch, vegan);
		this.bratzeit = bratzeit;
		this.hoehe = hoehe;
	}

	/**
	 * @return Zeitaufwand in Sekunden
	 */
	public int zubereiten() {
		System.out.println(name + " von jeder Seite " + bratzeit / 2 + " Sekunden grillen.");
		return bratzeit;
	}

	public int berechneHoehe() {
		return 0;
	}

}
