package dndcharactercreator.weapons;

public class Mace implements Wieldable
{
	private String damageDie = "1d6";
	private String damageType = "Bludgeoning";
	private int weight = 4;
	private String properties = null;
	
	Mace()
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