package dndcharactercreator.weapons;

public class Sling implements Wieldable
{
	private String damageDie = "1d4";
	private String damageType = "Bludgeoning";
	private int weight = 0;
	private String properties = "Ammunition (range 30/120)";
	
	public Sling()
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