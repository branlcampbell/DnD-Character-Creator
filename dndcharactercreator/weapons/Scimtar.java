package dndcharactercreator.weapons;

public class Scimtar implements Wieldable
{
	private String damageDie = "1d6";
	private String damageType = "Slashing";
	private int weight = 3;
	private String properties = "Finesse, light";
	
	Scimtar()
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