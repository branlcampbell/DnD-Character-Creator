package dndcharactercreator.weapons;

public class Greatclub implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Bludgeoning";
	private int weight = 10;
	private String properties = "Two-handed";
	
	Greatclub()
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