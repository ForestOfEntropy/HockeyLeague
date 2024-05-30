package Hockey;

public class Main
{
		public static void main(String[] args)
		{
		Club[] league =//Array mit allen mitgliedern der Liga
			{
					new Club("Crocodiles Hamburg"),
					new Club("Fishtown Penguins"),
					new Club("Kölner Haie"),
					new Club("Eisbären Berlin"),
					new Club("Augsburger Pantherkiste"),
					new Club("Schwenninger Wild Wings"),
					new Club("Goldfische Glücksstadt"),
					new Club("Koblenzer Kasuare"),
                    new Club("Mighty Ducks"),
                    new Club("Plöner Puck Piraten"),
                    new Club("Inkognito Isotops"),
                    new Club("Regensburger Regenwürmer"),
                    new Club("Rodedendron Ranger"),
                    new Club("Bostoner Banausen"),
                    new Club("EC Sankt Pauli"),
                    new Club("Champignon Champions")
			};

		GameOverview spielplan = new GameOverview(league);
		Game spiele = new Game();

		//Iteration über den Spielplan, um die Spiele zu spielen.
		for (int i = 0; i < spielplan.length(); i++)
			{
				spiele.play(spielplan.getGame());
			}

		Tabelle.tabelle(league);
		Tabelle.printTabelle();


		}
}
