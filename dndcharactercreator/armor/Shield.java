package dndcharactercreator.armor;

public class Shield implements Wearable
{
	private int armorClass = 2;
	private int strengthRequirement = 0;
	private String stealth = null;
	private int weight = 6;
	
	Shield()
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