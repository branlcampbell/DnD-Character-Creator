package dndcharactercreator.armor;

public class Padded implements Wearable
{
	private int armorClass = 11;
	private int strengthRequirement = 0;
	private String stealth = "Disadvantage";
	private int weight = 8;
	
	public Padded()
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
