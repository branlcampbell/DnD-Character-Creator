package dndcharactercreator.armor;

public class Leather implements Wearable
{
	int armorClass = 11;
	int strengthRequirement = 0;
	String stealth = null;
	int weight = 10;
	
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
