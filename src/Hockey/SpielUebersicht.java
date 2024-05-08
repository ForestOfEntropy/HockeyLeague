package Hockey;

import java.util.Scanner;

public class SpielUebersicht 
{
	private Verein[][] spielplan;
	private int gameDay = 0;	
	public SpielUebersicht(Verein[] liga)
	{		
		int anzTeams=liga.length;
		spielplan = new Verein[anzTeams*(anzTeams-1)][2];
		int counter = 0;
		for(int i = 0; i < anzTeams ; i++)
		{		
			for(int j = 0; j < anzTeams; j++)
			{
				if (liga[i] != liga[j]) 
				{
						spielplan[counter][0]  = liga[i];	
						spielplan[counter++][1]= liga[j];	
				}
			}
		}
	}
	public int length()
	{
		return this.spielplan.length;
	}
	
	public Verein[][] getSpielplan() 
	{
		return spielplan;
	}

	@Override
	public String toString() 
	{
		String re = "";
		for (Verein[] tag :spielplan)
		{
			for (Verein verein: tag)
			{
				re += verein.getName() + " ";
			}
			re += "\n";
		}
		return re;
	}
	public Verein[] getGame()
	{
		if(gameDay > this.spielplan.length) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Liga is durch. Nochmal? Y/N");
			String userInput = scanner.next();
			scanner.close();
			if (userInput.contains("Yy")) gameDay=0;
			return null;
			
		}
		return this.spielplan[gameDay++];
			
	}
	public Verein[] getGame(int spiel)
	{
		return this.spielplan[spiel];
			
	}
	public int findGame(String heim, String gast)
	{
		for (int i = 0 ;i < this.spielplan.length; i++)
		{
			if (this.spielplan[i][0].getName().matches(heim) && this.spielplan[i][1].getName().matches(gast))
			{
				return i;
			}
		}
		return -1;
	}	
	public int findGame(Verein heim, Verein gast)
	{
		for (int i = 0 ;i < this.spielplan.length; i++)
		{
			if (this.spielplan[i][0] == heim && this.spielplan[i][1]==gast)
			{
				return i;
			}
		}
		return -1;
	}
	
	}