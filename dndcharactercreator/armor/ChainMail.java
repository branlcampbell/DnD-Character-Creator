package dndcharactercreator.armor;

public class ChainMail implements Wearable
{
	private int armorClass = 16;
	private int strengthRequirement = 13;
	private String stealth = "Disadvantage";
	private int weight = 55;
	
	public ChainMail()
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