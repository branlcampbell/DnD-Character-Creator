package dndcharactercreator.weapons;

public class Greataxe implements Wieldable
{
	private String damageDie = "1d12";
	private String damageType = "Slashing";
	private int weight = 7;
	private String properties = "Heavy, two-handed";
	
	public Greataxe()
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