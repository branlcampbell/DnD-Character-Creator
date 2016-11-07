/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class HalfOrc extends NoRace
{
	/** Class variables. */
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Orc"};
	private String[] racialBonus = {"Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks"};
	
	public HalfOrc(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 strength and +1 constitution bonus from racial modifier. */
		super(name, strength + 2, dexterity, constitution + 1, intelligence, wisdom, charisma);
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
	 * Returns the size of a half orc.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
}