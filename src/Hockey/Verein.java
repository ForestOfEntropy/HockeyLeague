package Hockey;

import java.util.Random;

public class Verein {
	private String name;
	private int punkte = 0;
	private double strength = new Random().nextDouble()*30;
	
	public Verein (String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPunkte() {
		return punkte;
	}
	public void setPunkte(int punkte) {
		this.punkte += punkte;
	}
	public int getStrength() {
		return (int)strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
}
