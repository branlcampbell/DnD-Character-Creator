package dndcharactercreator.weapons;

public class Longbow implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Piercing";
	private int weight = 2;
	private String properties = "Ammunition (range 150/600), heavy, two-handed";
	
	public Longbow()
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