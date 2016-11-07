package dndcharactercreator.armor;

public class HalfPlate implements Wearable
{
	int armorClass = 15;
	int strengthRequirement = 0;
	String stealth = "Disadvantage";
	int weight = 40;
	
	HalfPlate()
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