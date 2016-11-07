/**
 * @author Brandon Campbell
 * @version 1.0
 * The default constructor for each new character created.
 * Each race inherits from this class so racial modifiers can be added
 * when calculating all stats.
 */
package dndcharactercreator.races;

// Default racial superclass.
public abstract class NoRace 
{
	// Class variables
	private String name;
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	// Default constructor.
	public NoRace()
	{
		
	}
	
	/**
	 * @param name Name given to character
	 * All following parameters are rolled by and input by the user.
	 * @param strength
	 * @param dexterity
	 * @param constitution
	 * @param intelligence
	 * @param wisdom
	 * @param charisma
	 */
	public NoRace(String name, int strength, int dexterity, int constitution, int intelligence,
			int wisdom, int charisma)
	{
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}
	
	/**
	 * Returns the character's name.
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the strength value of the character.
	 * @return strength
	 */
	public int getStrength()
	{
		return strength;
	}

	/**
	 * Returns the dexterity value of the character.
	 * @return dexterity
	 */
	public int getDexterity()
	{
		return dexterity;
	}
	
	/**
	 * Returns the constitution value of the character.
	 * @return constitution
	 */
	public int getConstitution()
	{
		return constitution;
	}
	
	/**
	 * Returns the intelligence value of the character.
	 * @return intelligence
	 */
	public int getIntelligence()
	{
		return intelligence;
	}
	
	/**
	 * Returns the wisdom value of the character.
	 * @return wisdom
	 */
	public int getWisdom()
	{
		return wisdom;
	}
	
	/**
	 * Returns the charisma value of the character.
	 * @return charisma
	 */
	public int getCharisma()
	{
		return charisma;
	}
}