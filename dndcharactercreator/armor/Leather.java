package dndcharactercreator.armor;

public class Leather implements Wearable
{
	private int armorClass = 11;
	private int strengthRequirement = 0;
	private String stealth = null;
	private int weight = 10;
	
	Leather()
	{
		
	}
	
	public int getArmorClass()
	{
		return this.armorClass;
	}
	
	public int getStrengthRequirement()
	{
		return this.strengthRequirement;
	}
	
	public String getStealth()
	{
		return this.stealth;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
}