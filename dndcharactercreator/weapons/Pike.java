package dndcharactercreator.weapons;

public class Pike implements Wieldable
{
	private String damageDie = "1d10";
	private String damageType = "Piercing";
	private int weight = 18;
	private String properties = "Heavy, reach, two-handed";
	
	public Pike()
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