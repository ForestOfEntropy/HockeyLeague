package Hockey;

import java.util.Arrays;

public class Tabelle
{
	static private Club[] tabelle;
	static public void tabelle(Club[] league)
	{
		tabelle = Arrays.copyOf(league, league.length); //Tabelle mit Clubs füllen

// 		Tabellensortierung anhand der Punkte in absteigender Reihenfolge
        Arrays.sort(tabelle, (club1, club2) -> Integer.compare(club2.getPoints(), club1.getPoints()));
	}
		static public void printTabelle()
		{
		int counter = 1;
        int nameWidth = 25; // Feste Breite für die Clubnamen
			String format = "%-3d %-" + nameWidth + "s %d Punkte.%n";
			System.out.println("Der Endstand der aktuellen Saison!");
			for (Club club : tabelle) {
				System.out.printf(format, counter++, club.getName(), club.getPoints());
		}

}
}
