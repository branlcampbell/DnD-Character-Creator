package dndcharactercreator.armor;

public class Padded implements Wearable
{
	int armorClass = 11;
	int strengthRequirement = 0;
	String stealth = "Disadvantage";
	int weight = 8;
	
	Padded()
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
