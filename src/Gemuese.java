public class Gemuese extends Zutat {
	int scheibenDicke;
	int scheibenAnzahl;

	/**
	 * Initialisierungskonstruktor
	 *
	 * @param nummer      ID des Gemüses
	 * @param name        Bezeichnung des Gemüses
	 * @param preis       Preis des Gemüses
	 * @param klassisch   Ist es ein klassisches Gemüse?
	 * @param vegetarisch Ist es ein vegetarisches Gemüse?
	 * @param vegan       Ist es ein veganes Gemüse?
	 * @param scheibenDicke  Dicke der Gemüsescheiben
	 * @param scheibenAnzahl Anzahl der Gemüsescheiben
	 */
	public Gemuese(int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan,
			int scheibenDicke, int scheibenAnzahl) {
		super(nummer, name, preis, klassisch, vegetarisch, vegan);
		this.scheibenDicke = scheibenDicke;
		this.scheibenAnzahl = scheibenAnzahl;
	}

	/**
	 * @return Höhe des Gemüses in Milimeter
	 */
	public int berechneHoehe() {
		int hoehe = scheibenDicke * scheibenAnzahl;
		return hoehe;
	}

	/**
	 * @return Zeitaufwand in Sekunden
	 */
	public int zubereiten() {
		int step = 1;
		System.out.println(name + " wird gewaschen.");
		for (int i = 0; i < scheibenAnzahl; i++) {
			System.out.println(step + ". Scheibe mit " + scheibenDicke + " mm schneiden.");
			step++;
		}
		return scheibenAnzahl;
	}

}
