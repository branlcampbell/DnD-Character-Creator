/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class Elf extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Elvish"};
	private String[] racialBonus = {"Darkvision", "Keen Senses", "Fey Ancestry",
			"Trance"};
	
	public Elf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 dexterity bonus from racial modifier. */
		super(name, strength, dexterity + 2, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the speed of an elf.
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
	 * Returns the size of an elf.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
}