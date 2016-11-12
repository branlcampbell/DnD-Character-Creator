package dndcharactercreator.armor;

public class Plate implements Wearable
{
	private int armorClass = 18;
	private int strengthRequirement = 15;
	private String stealth = "Disadvantage";
	private int weight = 65;
	
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