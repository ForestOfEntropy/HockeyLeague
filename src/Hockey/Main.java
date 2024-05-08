package Hockey;

public class Main {
		public static void main(String[] args) 
		{
		Verein[] liga = 
			{
					new Verein("Crocodiles Hamburg"),
					new Verein("Fishtown Penguins"),
					new Verein("Kölner Haie"),
					new Verein("Eisbären Berlin"), 
					new Verein("Augsburger Pantherkiste"),
					new Verein("Schwenninger Wild Wings"),
					new Verein("Goldfische Glücksstadt"),
					new Verein("Koblenzer Kasuare")
			};
		SpielUebersicht spielplan = new SpielUebersicht(liga);
//		Verein[] partie;
//		partie = spielplan.getGame(spielplan.findGame(liga[0], liga[4]));
//		System.out.println(partie[0].getName() +" "+ partie[1].getName());
//		int[] teams = {0,1,5};
//		Spieltag day1 = new Spieltag(teams);
			
		Spiel spiele = new Spiel();
		for (int i = 0; i < spielplan.length(); i++)
			{
				spiele.play(spielplan.getGame());
			}

		Tabelle.tabelle(liga);
		Tabelle.printTabelle();
		}
}
