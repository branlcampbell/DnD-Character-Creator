package dndcharactercreator.weapons;

public class Warhammer implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Bludgeoning";
	private int weight = 2;
	private String properties = "Versatile (1d10)";
	
	public Warhammer()
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