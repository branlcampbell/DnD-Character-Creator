package dndcharactercreator.weapons;

public class Dagger implements Wieldable
{
	private String damageDie = "1d4";
	private String damageType = "Piercing";
	private int weight = 2;
	private String properties = "Finesse, light, thrown (range 20/60)";
	
	public Dagger()
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