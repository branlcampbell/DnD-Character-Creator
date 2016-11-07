package dndcharactercreator.weapons;

public class LightHammer implements Wieldable
{
	private String damageDie = "1d4";
	private String damageType = "Bludgeoning";
	private int weight = 2;
	private String properties = "Light, thrown (range 20/60)";
	
	LightHammer()
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