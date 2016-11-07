/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class Dragonborn extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Draconic"};
	private String[] racialBonus = {"Breath Weapon", "Damage Resistance Based on Draconic Ancestry"};
	
	public Dragonborn(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 strength and +1 charisma bonus from racial modifier. */
		super(name, strength + 2, dexterity, constitution, intelligence, wisdom, charisma + 1);
	}
	
	/**
	 * Returns the speed of a dragonborn.
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
	 * Returns the size of a dragonborn.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
}