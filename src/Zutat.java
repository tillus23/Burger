public class Zutat {

	static Zutat[] zutaten = { 
			new Broetchen(10, "Hamburger (Standard)", 0.85f, true, true, false, 27, 90),
			new Broetchen(11, "Hamburger Sesam", 0.95f, true, true, false, 28, 90),
			new Broetchen(12, "Vegan-Brötchen", 0.55f, false, true, true, 34, 240),
			new Broetchen(13, "Ciabatta", 0.45f, false, true, false, 41, 330),
			new Bratling(20, "Rindfleisch (Original)", 1.85f, true, false, false, 25, 270),
			new Bratling(21, "Hähnchenfleisch gegrillt", 1.15f, false, false, false, 11, 180),
			new Bratling(22, "Falafel-Bratling", 1.45f, false, true, true, 21, 210),
			new Bratling(23, "Gemüse-Bratling", 1.75f, false, true, false, 25, 240),
			new Salat(30, "Eisbergsalat", 0.18f, true, true, true),
			new Salat(31, "Rucolasalat", 0.25f, false, true, true),
			new Gemuese(40, "Tomate", 0.25f, true, true, false, 3, 3),
			new Gemuese(41, "Salzgurke", 0.15f, true, true, false, 2, 4),
			new Gemuese(42, "Rote Zwiebelringe", 0.08f, false, true, true, 2, 5),
			new Gemuese(43, "Jalapeno-Ringe", 0.08f, false, true, true, 2, 5),
			new Sauce(50, "Ketchup", 0.10f, true, true, true, 5, "normal"),
			new Sauce(51, "Sandwich-Sauce", 0.15f, true, true, false, 10, "normal"),
			new Sauce(51, "Chili-Sauce", 0.25f, false, true, true, 8, "scharf"),
			new Sauce(51, "Honig-Senf-Sauce", 0.18f, false, true, false, 8, "süß"), 
	};

	int nummer;
	String name;
	float preis;
	boolean klassisch;
	boolean vegetarisch;
	boolean vegan;

	/**
	 * Initialisierungskonstruktor
	 * 
	 * @param nummer      ID der Zutat
	 * @param name        Bezeichnung der Zutat
	 * @param preis       Preis der Zutat
	 * @param klassisch   Ist es eine klassische Zutat?
	 * @param vegetarisch Ist es eine vegetarische Zutat?
	 * @param vegan       Ist es eine vegane Zutat?
	 */
	public Zutat(int nummer, String name, float preis, boolean klassisch, boolean vegetarisch, boolean vegan) {
		this.nummer = nummer;
		this.name = name;
		this.preis = preis;
		this.klassisch = klassisch;
		this.vegetarisch = vegetarisch;
		this.vegan = vegan;
	}

	/**
	 * Sucht anhand von Eingabe nach Zutat
	 *
	 * @param commandName Kommando
	 * @return Gefundene Zutat
	 */
	static Zutat zutatNachNummerFinden(String commandName) {
		for (int i = 0; i < zutaten.length; i++) {
			if (zutaten[i] != null && Integer.parseInt(commandName) == (zutaten[i].getNummer())) { // verglichen werden
				return zutaten[i];
			}
		}
		return null;
	}

	/**
	 * @return Zeitaufwand
	 */
	public int zubereiten() {
		return 0;
	}

	/**
	 * @return Höhe der Zutat
	 */
	public int berechneHoehe() {
		return 0;
	}

	/**
	 * @return Bezeichnung der Zutat
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return ID der Zutat
	 */
	public int getNummer() {
		return nummer;
	}

	/**
	 * @return Ist die Zutat vegetarisch?
	 */
	public boolean isVegetarisch() {
		return vegetarisch;
	}

	/**
	 * @return Ist die Zutat vegan?
	 */
	public boolean isVegan() {
		return vegan;
	}

	/**
	 * toString Methode
	 */
	@Override
	public String toString() {
		return nummer + " " + name + " (" + preis + "€)";
	}

}
