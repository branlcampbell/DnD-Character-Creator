package dndcharactercreator.weapons;

public class Greatsword implements Wieldable
{
	private String damageDie = "2d6";
	private String damageType = "Slashing";
	private int weight = 6;
	private String properties = "Heavy, two-handed";
	
	public Greatsword()
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