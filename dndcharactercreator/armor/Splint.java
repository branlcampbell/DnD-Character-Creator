package dndcharactercreator.armor;

public class Splint implements Wearable
{
	private int armorClass = 17;
	private int strengthRequirement = 15;
	private String stealth = "Disadvantage";
	private int weight = 60;
	
	public Splint()
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