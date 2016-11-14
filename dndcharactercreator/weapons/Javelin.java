package dndcharactercreator.weapons;

public class Javelin implements Wieldable
{
	private String damageDie = "1d6";
	private String damageType = "Piercing";
	private int weight = 2;
	private String properties = "Thrown (range 30/120)";
	
	public Javelin()
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