package dndcharactercreator.weapons;

public class Blowgun implements Wieldable
{
	private String damageDie = "1";
	private String damageType = "Piercing";
	private int weight = 1;
	private String properties = "Ammunition (range 25/100), loading";
	
	Blowgun()
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