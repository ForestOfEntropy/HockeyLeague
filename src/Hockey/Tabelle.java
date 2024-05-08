package Hockey;

public class Tabelle 
{
	static private Verein[] tabelle;
	static public void tabelle(Verein[] liga)
	{
		tabelle = new Verein[liga.length];
		for (int i = 0; i < liga.length;i++)
		{
			tabelle[i] = liga[i];
		}
		int n = tabelle.length-1;
	    for (int i = 0; i < n; i++) 
	    {
	        for (int j = 0; j < n-i; j++) 
	        {
	            if (tabelle[j].getPunkte() < tabelle[j+1].getPunkte()) 
	            {
	                // Vertausche die Elemente, falls sie in falscher Reihenfolge sind
	                Verein temp = tabelle[j];
	                tabelle[j] = tabelle[j+1];
	                tabelle[j+1] = temp;
	            }
	        }
	    }
	}
		static public void printTabelle() {
		int counter = 1;
		for (Verein verein: tabelle)
		{   
			System.out.println(counter++ + ": " + verein.getName() + ", hat " + verein.getPunkte() + " Punkte.");
		}

}
}
