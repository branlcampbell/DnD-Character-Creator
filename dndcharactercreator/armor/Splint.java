package dndcharactercreator.armor;

public class Splint implements Wearable
{
	int armorClass = 17;
	int strengthRequirement = 15;
	String stealth = "Disadvantage";
	int weight = 60;
	
	Splint()
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