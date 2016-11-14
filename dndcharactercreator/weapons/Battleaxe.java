package dndcharactercreator.weapons;

public class Battleaxe implements Wieldable
{
	private String damageDie = "1d8";
	private String damageType = "Slashing";
	private int weight = 4;
	private String properties = "Versatile (1d10)";
	
	public Battleaxe()
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