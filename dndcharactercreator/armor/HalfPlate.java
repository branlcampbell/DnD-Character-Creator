package dndcharactercreator.armor;

public class HalfPlate implements Wearable
{
	private int armorClass = 15;
	private int strengthRequirement = 0;
	private String stealth = "Disadvantage";
	private int weight = 40;
	
	public HalfPlate()
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