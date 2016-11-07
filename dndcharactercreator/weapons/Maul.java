package dndcharactercreator.weapons;

public class Maul implements Wieldable
{
	private String damageDie = "2d6";
	private String damageType = "Bludgeoning";
	private int weight = 10;
	private String properties = "Heavy, two-handed";
	
	Maul()
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