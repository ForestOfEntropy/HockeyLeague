package Hockey;
import java.util.Random;

public class Spiel
{	
	static final int spiele = 30;
	static final int randoFaktor = 30;


	public void play(Verein v1, Verein v2) 
	{
		double str  = v1.getStrength() + new Random().nextInt(randoFaktor)+1;
		double str2 = v2.getStrength() + new Random().nextInt(randoFaktor)+1;
		if (str<str2)
		{
		System.out.println(" wurde von "+v2.getName() + " gewonnen.");
		v2.setPunkte(3);
		}
	if (str>str2)
		{
		System.out.println(" wurde von "+v1.getName() + " gewonnen.");
		v1.setPunkte(3);
		}
	if (str == str2)
		{
		System.out.println(" ging unentschieden aus.");
		v1.setPunkte(1);
		v2.setPunkte(1);
		}
	}
	
	public void play(Verein[] v) {
		double str  = v[0].getStrength() + new Random().nextInt(randoFaktor)+1;
		double str2 = v[1].getStrength() + new Random().nextInt(randoFaktor)+1;
		System.out.print("Die Partie zwischen " + v[0].getName() + " und " + v[1].getName());
		if (str<str2)
			{
			System.out.println(" wurde von "+v[1].getName() + " gewonnen.");
			v[1].setPunkte(3);
			}
		if (str>str2)
			{
			System.out.println(" wurde von "+v[0].getName() + " gewonnen.");
			v[0].setPunkte(3);
			}
		if (str == str2)
		{
			System.out.println(" ging unentschieden aus.");
			v[0].setPunkte(1);
			v[1].setPunkte(1);
		}
	}


	
}
