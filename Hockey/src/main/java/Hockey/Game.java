package Hockey;
import java.util.Random;

public class Game
{

	static final int tagesformFaktor = 30;
//	Methode für die Nutzung im Array
	public void play(Club[] c) {
		if (c != null)
		{
			double str  = c[0].getStrength() + new Random().nextInt(tagesformFaktor) + 1;
			double str2 = c[1].getStrength() + new Random().nextInt(tagesformFaktor) + 1;
//			Spielauswertung und Ergebnisausgabe
// 			Gewinner erhält 3 Punkte, bei unentschieden beide 1, verlierer geht leer aus
			System.out.print("Die Partie zwischen " + c[0].getName() + " und " + c[1].getName());
			if (str < str2)
			{
				System.out.println(" wurde von " + c[1].getName() + " gewonnen.");
				c[1].addPoints(3);
			}
			if (str > str2)
			{
				System.out.println(" wurde von " + c[0].getName() + " gewonnen.");
				c[0].addPoints(3);
			}
			if (str == str2)
			{
				System.out.println(" ging unentschieden aus.");
				c[0].addPoints(1);
				c[1].addPoints(1);
			}
		}
	}
//	Overloaded methode, für die Manuelle eingabe von Vereinen
	public void play(Club c1, Club c2)
	{//				Basisstärke der Teams + Tagesform
		double str  = c1.getStrength() + new Random().nextInt(tagesformFaktor)+1;
		double str2 = c2.getStrength() + new Random().nextInt(tagesformFaktor)+1;

		if (str<str2)
		{
			System.out.println(" wurde von "+c2.getName() + " gewonnen.");
			c2.addPoints(3);
		}
		if (str>str2)
		{
			System.out.println(" wurde von "+c1.getName() + " gewonnen.");
			c1.addPoints(3);
		}
		else if (str == str2)
		{
			System.out.println(" ging unentschieden aus.");
			c1.addPoints(1);
			c2.addPoints(1);
		}
	}





}
