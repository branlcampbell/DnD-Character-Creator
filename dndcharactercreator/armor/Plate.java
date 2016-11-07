package dndcharactercreator.armor;

public class Plate implements Wearable
{
	int armorClass = 18;
	int strengthRequirement = 15;
	String stealth = "Disadvantage";
	int weight = 65;
	
	Plate()
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