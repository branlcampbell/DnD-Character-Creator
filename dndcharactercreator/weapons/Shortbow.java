package dndcharactercreator.weapons;

public class Shortbow implements Wieldable
{
	private String damageDie = "1d6";
	private String damageType = "Piercing";
	private int weight = 2;
	private String properties = "Ammunition (range 80/320), two handed";
	
	public Shortbow()
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