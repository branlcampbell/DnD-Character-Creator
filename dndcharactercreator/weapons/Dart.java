package dndcharactercreator.weapons;

public class Dart implements Wieldable
{
	private String damageDie = "1d4";
	private String damageType = "Piercing";
	private int weight = 1/4;
	private String properties = "Finesse, thrown (range 20/60)";
	
	public Dart()
	{
		
	}
	
	public String getDamageDie()
	{
		return this.damageDie;
	}
	
	public String getDamageType()
	{
		return this.damageType;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public String getProperties()
	{
		return this.properties;
	}
}