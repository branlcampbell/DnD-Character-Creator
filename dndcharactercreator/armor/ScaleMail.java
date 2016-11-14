package dndcharactercreator.armor;

public class ScaleMail implements Wearable
{
	private int armorClass = 14;
	private int strengthRequirement = 0;
	private String stealth = "Disadvantage";
	private int weight = 45;
	
	public ScaleMail()
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