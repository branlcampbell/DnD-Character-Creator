package dndcharactercreator.armor;

public class StuddedLeather implements Wearable
{
	private int armorClass = 12;
	private int strengthRequirement = 0;
	private String stealth = null;
	private int weight = 13;
	
	StuddedLeather()
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
