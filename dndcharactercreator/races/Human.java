/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class Human extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String languages = "Common, +1 Additional Language";
	
	public Human(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the speed of a human.
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
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
	 * Returns the size of a human.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}

	/**
	 * Returns the racially modified strength.
	 * @return strength + 1
	 */
	public int incrementStrength()
	{
		return getStrength() + 1;
	}
	
	/**
	 * Returns the racially modified dexterity.
	 * @return dexterity + 1
	 */
	public int incrementDexterity()
	{
		return getDexterity() + 1;
	}
	
	/**
	 * Returns the racially modified constitution.
	 * @return constitution + 1
	 */
	public int incrementConstitution()
	{
		return getConstitution() + 1;
	}
	
	/**
	 * Returns the racially modified intelligence.
	 * @return intelligence + 1
	 */
	public int incrementIntelligence()
	{
		return getIntelligence() + 1;
	}
	
	/**
	 * Returns the racially modified wisdom.
	 * @return wisdom + 1
	 */
	public int incrementWisdom()
	{
		return getWisdom() + 1;
	}
	
	/**
	 * Returns the racially modified charisma.
	 * @return charisma + 1
	 */
	public int incrementCharisma()
	{
		return getCharisma() + 1;
	}
}
