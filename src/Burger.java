public class Burger {
	String name;
	int hoehe;
	float preis;
	int zubereitungszeit;
	boolean klassisch;
	boolean vegetarisch;
	boolean vegan;
	Zutat[] zutatenliste = new Zutat[11];
	int cntZutaten = 0;
	boolean hatBroetchen = false;

	/**
	 * Initialisierungskonstruktor
	 */
	public Burger() {
		System.out.println(
				"Du stellst einen neuen Burger zusammen. Du kannst maximal 11 Zutaten wählen (Brötchen zählt nicht).");
		System.out.println("Mit „ok“ kannst du deine Zusammenstellung abschließen.");
	}

	public void bauen(String command) {
		Zutat aktuelleZutat = Zutat.zutatNachNummerFinden(command);
		if (aktuelleZutat == null) {
			System.out.println("Es gibt keine Zutat mit dieser Nummer.");
		} else if (hatBroetchen && aktuelleZutat instanceof Broetchen) {
			System.out.println("Es kann nur ein Brötchen geben.");
		} else if (cntZutaten == 10 && !hatBroetchen && !(aktuelleZutat instanceof Broetchen)) {
			System.out.println("Du hast die maximale Menge an Zutaten erreicht. Bitte wähle noch ein Brötchen aus.");
		} else if (command.length() > 1) {
			if (aktuelleZutat instanceof Broetchen) {
				hatBroetchen = true;
			}
			zutatenliste[cntZutaten] = aktuelleZutat;
			System.out.println(aktuelleZutat + " wurde hinzugefügt.");
			System.out.println("Diese Zutaten sind bisher auf deinem Burger:");
			for (int j = 0; j < zutatenliste.length; j++) {
				if (zutatenliste[j] != null) {
					System.out.println("- " + zutatenliste[j]);
				}
			}
			cntZutaten++;
			if (cntZutaten == 11) {
				controller.speicherBurger();
			}
		}
	}

	/**
	 * @return Höhe des Burgers
	 */
	public int berechneHoehe() {
		int hoehe = 0;
		for (int i = 0; i < cntZutaten; i++) {
			hoehe += zutatenliste[i].berechneHoehe();
		}
		return hoehe;
	}

	/**
	 * @return Zeitaufwand des Burgers
	 */
	public int berechneZeit() {
		int zeit = 0;
		for (int i = 0; i < zutatenliste.length; i++) {
			zeit += zutatenliste[i].zubereiten();
		}
		return zeit;
	}

	/**
	 * @return Preis des Burgers
	 */
	public float berechnePreis() {
		int preis = 0;
		for (int i = 0; i < zutatenliste.length; i++) {
			preis += zutatenliste[i].preis;
		}
		return preis;
	}

	/**
	 * @return Ist der Burger vegetarisch?
	 */
	public boolean istVegetarisch() {
		for (int i = 0; i < zutatenliste.length; i++) {
			if (!zutatenliste[i].isVegetarisch()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @return Ist der Burger vegan?
	 */
	public boolean istVegan() {
		for (int i = 0; i < zutatenliste.length; i++) {
			if (!zutatenliste[i].isVegan()) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Rezept des Burgers
	 */
	public void rezeptAusgeben() {
		System.out.print("Rezept - " + toString());
		System.out.println();
		System.out.print("Zutaten: ");
		for (int i = 0; i < cntZutaten; i++) {
			System.out.print(zutatenliste[i].getName());

			if (i < zutatenliste.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Und so gehts: ");
		for (int i = 0; i < cntZutaten; i++) {
			System.out.print(zutatenliste[i].zubereiten());
		}
	}

	/**
	 * toString Methode
	 */
	@Override
	public String toString() {
		return name + " (" + berechneHoehe() + "mm) - " + preis + "€";

	}

}
