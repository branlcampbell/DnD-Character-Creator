package dndcharactercreator.weapons;

public class Club implements Wieldable
{
	private String damageDie = "1d4";
	private String damageType = "Bludgeoning";
	private int weight = 2;
	private String properties = "Light";
	
	Club()
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