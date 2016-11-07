/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class Tiefling extends NoRace
{
	/** Class variables. */
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Infernal"};
	private String[] racialBonus = {"Darkvision", "Hellish Resistance", "Infernal Legacy"};
	
	public Tiefling(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 charisma and +1 intelligence bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence + 1, wisdom, charisma + 2);
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
	 * Returns the size of a tiefling.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
}