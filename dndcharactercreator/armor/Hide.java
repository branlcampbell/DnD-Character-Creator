package dndcharactercreator.armor;

public class Hide implements Wearable
{
	int armorClass = 12;
	int strengthRequirement = 0;
	String stealth = null;
	int weight = 12;
	
	Hide()
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
