public class controller {

	private static Burger[] burger = new Burger[4];
	private static int burgerPos = -1;

	public static void main(String[] args) {
		String line;
		String command[];
		
		
		
		System.out.println("You’ll never burger alone - Create your best Burger 2020");
		System.out.println("Mit „menu“ kannst du dir alle zur Verfügung stehenden Zutaten anzeigen lassen.");
		System.out.println("Mit „zutat“ und der jeweiligen Nummer kannst du eine Zutat auswählen.");
		System.out.println("Mit „meineBurger“ kannst du deine bisher erstellten Burger einsehen.");
		System.out.println("Mit „einreichen“ reichst du deine erstellten Burger beim Gewinnspiel ein.");

		do {
			System.out.println();
			System.out.print("Bitte deine Eingabe: ");
			line = StaticScanner.nextString();
			command = line.split(" ");
			doCommand(command);

		} while (!line.equals("einreichen"));

	}

	/**
	 * Führt Kommando aus
	 *
	 * @param command Kommando
	 */
	private static void doCommand(String[] command) {
		switch (command[0]) {
		case "menu":
			menu();
			break;
		case "zutat":
			if (burgerPos == -1 || burger[burgerPos].name != null) {
				neuerBurger();
			}
			burger[burgerPos].bauen(command[1]);
			break;
		case "meineBurger":
			zeigeBurger();
			break;
		case "einreichen":
			einreichen();
			break;
		case "ok":
			speicherBurger();
			break;
		default:
			System.out.println("Diesen Befehl gibt es nicht.");
			break;
		}
	}

	/**
	 * Erstellt einen neuen Burger
	 */
	private static void neuerBurger() {
		burgerPos++;
		burger[burgerPos] = new Burger();
	}

	/**
	 * Ruft das Menü auf
	 */
	public static void menu() {
		System.out.println("Diese Zutaten stehen zur Verfügung:");
		for (int i = 0; i < Zutat.zutaten.length; i++) {
			System.out.println(Zutat.zutaten[i]);
		}
	}

	/**
	 * Ruft die Burger auf
	 */
	public static void zeigeBurger() {
		if (burger[0] == null) {
			System.out.println("Du hast noch keine Burger erstellt.");
		} else {
			System.out.println("Diese Burger hast du bereits erstellt:");
			for (int i = 0; i < burger.length; i++) {
				if (burger[i] != null) {
					System.out.println(burger[i]);
				}
			}
		}
	}

	/**
	 * Speichert den aktuellen Burger
	 */
	public static void speicherBurger() {
		if (burger[burgerPos].hatBroetchen) {
			System.out.print("Wie soll dein Burger heißen? ");
			burger[burgerPos].name = StaticScanner.nextString();
			System.out.println(burger[burgerPos].name + " wurde gespeichert.");
			if (burgerPos > 4) {
				einreichen();
			}
		} else {
			System.out.println("Dein Burger braucht noch ein Brötchen.");
		}
	}
	
	/**
	 * Reicht Burger ein und gibt Rezepte aus
	 */
	public static void einreichen() {
		if (burger[0] == null) {
			System.out.println("Es wurden keine Burger eingereicht.");
		} else {
			System.out.println("Vielen Dank für deine Teilnahme! Das hier sind deine Einreichungen:");
			for (int i = 0; i < burger.length; i++) {
				if (burger[i] != null) {
					burger[i].rezeptAusgeben();
				}
			}
		}
	}

}
