package dndcharactercreator.weapons;

public class Morningstar implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Piercing";
	private int weight = 4;
	private String properties = null;
	
	Morningstar()
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