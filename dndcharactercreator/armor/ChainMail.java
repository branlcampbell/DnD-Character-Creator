package dndcharactercreator.armor;

public class ChainMail implements Wearable
{
	int armorClass = 16;
	int strengthRequirement = 13;
	String stealth = "Disadvantage";
	int weight = 55;
	
	ChainMail()
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