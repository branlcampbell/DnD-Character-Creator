package dndcharactercreator.armor;

public class ScaleMail implements Wearable
{
	int armorClass = 14;
	int strengthRequirement = 0;
	String stealth = "Disadvantage";
	int weight = 45;
	
	ScaleMail()
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