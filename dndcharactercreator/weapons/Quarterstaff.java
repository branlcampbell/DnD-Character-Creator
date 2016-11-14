package dndcharactercreator.weapons;

public class Quarterstaff implements Wieldable
{
	private String damageDie = "1d6";
	private String damageType = "Bludgeoning";
	private int weight = 4;
	private String properties = "Versatile (1d8)";
	
	public Quarterstaff()
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