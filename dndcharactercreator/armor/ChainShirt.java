package dndcharactercreator.armor;

public class ChainShirt implements Wearable
{
	int armorClass = 13;
	int strengthRequirement = 0;
	String stealth = null;
	int weight = 20;
	
	ChainShirt()
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