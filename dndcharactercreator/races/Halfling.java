/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class Halfling extends NoRace
{
	private int speed = 25;
	private String size = "Medium";
	private String languages = "Common, Halfling";
	private String[] racialBonus = {"Lucky", "Brave", "Halfling Nimbleness"};
	
	public Halfling(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the speed of a halfling.
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
	public String getLanguages()
	{
		return languages;
	}
	
	/**
	 * Returns the size of a halfling.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
	
	/**
	 * Returns the racially modified dexterity.
	 * @return dexterity + 2
	 */
	public int modifyDexterity()
	{
		return getDexterity() + 2;
	}	
}
