package dndcharactercreator.weapons;

public class Net implements Wieldable
{
	private String damageDie = null;
	private String damageType = null;
	private int weight = 3;
	private String properties = "Special, thrown (range 5/15)";
	
	Net()
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