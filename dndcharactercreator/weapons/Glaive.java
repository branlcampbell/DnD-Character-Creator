package dndcharactercreator.weapons;

public class Glaive implements Wieldable
{
	private String damageDie = "1d10";
	private String damageType = "Slashing";
	private int weight = 6;
	private String properties = "Heavy, reach, two-handed";
	
	public Glaive()
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