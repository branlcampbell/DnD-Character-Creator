package dndcharactercreator.weapons;

public class LightCrossbow implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Piercing";
	private int weight = 5;
	private String properties = "Ammunition (range 80/320, loading, two-handed";
	
	LightCrossbow()
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