package Hockey;

public class GameOverview {
// 	Die Spielplan-Matrix, die alle Spiele enthält
	private final Club[][] gamePlan;
	private int gameCounter = 0;

	public GameOverview(Club[] liga) {
		int numberOfTeams = liga.length;
		int otherTeams = numberOfTeams -1; //Anzahl der anderen Teams, aus der Perspektive eines Teams
		int totalGames = numberOfTeams * otherTeams;
		int matchCount = numberOfTeams / 2;


		gamePlan = new Club[totalGames][2];
//		Schleife für den Zugriff auf die einzelnen Spieltage
		for (int round = 0; round <= numberOfTeams; round++)
		{
//			Schleife für den Zugriff auf die einzelnen Spiele
    		for (int matchIndex = 0; matchIndex < matchCount; matchIndex++)
    		{
        		int homeIndex  = (round + matchIndex) % otherTeams;
       			int guestIndex = (otherTeams - matchIndex + round) % otherTeams;
//				Wenn es das erste Spiel an diesem Spieltag ist, ist das letzte Team Gast
				if (matchIndex == 0)
				{
					guestIndex = otherTeams;
				}
//		Spielplan update mit den entsprechenden Teams
        gamePlan[round * (matchCount) + matchIndex][0] = liga[homeIndex];
        gamePlan[round * (matchCount) + matchIndex][1] = liga[guestIndex];
    }
		}


	}

	public int length()
	{
		return this.gamePlan.length;
	}

	public Club[][] getGamePlan()
	{
		return gamePlan;
	}

	@Override
	public String toString()
	{
		StringBuilder re = new StringBuilder();
		for (Club[] opposingTeams : gamePlan)
		{
			for (Club club : opposingTeams)
			{
				re.append(club.getName()).append(" ");
			}
			re.append("\n");
		}
		return re.toString();
	}
//
	public Club[] getGame()
	{
		while (gameCounter < this.gamePlan.length)
		{
			Club[] spiel = this.gamePlan[gameCounter];
//			Kontrolliert ob 2 Teams vorhanden sind
			if (spiel.length == 2 && spiel[0] != null && spiel[1] != null)
			{
				System.out.println(spiel[0].getName() + " vs " + spiel[1].getName());//Kontrahentenausgabe
				gameCounter++;
				return spiel;
			}
			gameCounter++;//Nächstes Spiel, falls das aktuelle ungültig ist
		}
    return null; //Rückgabe, falls alle Spiele bereits gespielt wurden
	}
//	Spielabruf, basierend auf der Reihenfolge
	public Club[] getGame(int spiel)
	{
		return this.gamePlan[spiel];
	}
//	Spielabruf, basierend auf den Teamnamen als String
	public int findGame(String heim, String gast)
	{
		for (int i = 0; i < this.gamePlan.length; i++)
		{
			if (this.gamePlan[i][0].getName().matches(heim) && this.gamePlan[i][1].getName().matches(gast))
			{
				return i;
			}
		}
		return -1;
	}
//	Spielabruf, basierend auf den Objekten
	public int findGame(Club heim, Club gast)
	{
		for (int i = 0; i < this.gamePlan.length; i++)
		{
			if (this.gamePlan[i][0] == heim && this.gamePlan[i][1] == gast)
			{
				return i;
			}
		}
		return -1;
	}
}
