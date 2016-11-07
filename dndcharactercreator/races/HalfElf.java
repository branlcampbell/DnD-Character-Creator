/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class HalfElf extends NoRace
{
	/** Class variables. */
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
	
	/**
	 * Returns the speed of a dwarf.
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Returns an array of each racial bonus.
	 * @return racialBonus
	 */
	public String[] getRacialBonus()
	{
		return racialBonus;
	}
	
	/**
	 * Returns naturally known languages.
	 * @return languages
	 */
	public String[] getLanguages()
	{
		return languages;
	}
	
	/**
	 * Returns the size of a half elf.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
}