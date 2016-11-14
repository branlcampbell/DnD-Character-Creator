/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class HalfElf extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Elvish", "Additional Language"};
	private String[] racialBonus = {"Choose +1 for two ability scores", "Darkvision", "Fey Ancestry",
			"Skill Versatility"};
	
	public HalfElf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 constitution bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma + 2);
	}

	public int getSpeed()
	{
		return speed;
	}

	public String[] getRacialBonus()
	{
		return racialBonus;
	}
	
	public String[] getSubRacialBonus()
	{
		return null;
	}

	public String[] getLanguages()
	{
		return languages;
	}

	public String getSize()
	{
		return size;
	}
}