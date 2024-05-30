package Hockey;

import java.util.Random;

public class Club {
	private String name;
	private int points = 0;
	private double strength;

	public Club(String name)
	{
		setName(name);
		setStrength(new Random().nextDouble() * 30);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) {
		if (name.length()<=25) {
			this.name = name;
		}
	}

	public int getPoints()
	{
		return points;
	}

	public void addPoints(int points)
	{
		if (points>0)
		{
			this.points += points;
		}
	}

	public int getStrength()
	{
		return (int)strength;
	}

	public void setStrength(double strength)
	{
		if(strength>0)
		{
		this.strength = strength;
		}
	}
}
