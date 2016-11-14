package dndcharactercreator.weapons;

public class Trident implements Wieldable
{
	private String damageDie = "1d6";
	private String damageType = "Piercing";
	private int weight = 4;
	private String properties = "Thrown (range 20/60), versatile (1d8)";
	
	public Trident()
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