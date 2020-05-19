public class Sauce extends Zutat {
	int menge;
	String geschmack;

	/**
	 * Initialisierungskonstruktor
	 *
	 * @param nummer      ID der Sauce
	 * @param name        Bezeichnung der Sauce
	 * @param preis       Preis der Sauce
	 * @param klassisch   Ist es eine klassische Sauce?
	 * @param vegetarisch Ist es eine vegetarische Sauce?
	 * @param vegan       Ist es eine vegane Sauce?
	 * @param menge       Menge der Sauce
	 * @param geschmack   Geschmack der Sauce
	 */
	public Sauce(int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan, int menge,
			String geschmack) {
		super(nummer, name, preis, klassisch, vegetarisch, vegan);
		this.menge = menge;
		this.geschmack = geschmack;
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
