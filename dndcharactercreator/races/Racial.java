package dndcharactercreator.races;

import java.util.List;

public interface Racial 
{	
	/**
	 * Returns the character's name.
	 * @return name
	 */
	public String getName();
	
	/**
	 * Returns the strength value of the character.
	 * @return strength
	 */
	public int getStrength();
	
	/**
	 * Returns the dexterity value of the character.
	 * @return dexterity
	 */
	public int getDexterity();
	
	/**
	 * Returns the constitution value of the character.
	 * @return constitution
	 */
	public int getConstitution();
	
	/**
	 * Returns the intelligence value of the character.
	 * @return intelligence
	 */
	public int getIntelligence();
	
	/**
	 * Returns the wisdom value of the character.
	 * @return wisdom
	 */
	public int getWisdom();
	
	/**
	 * Returns the charisma value of the character.
	 * @return charisma
	 */
	public int getCharisma();
	
	/**
	 * Returns the speed of a dwarf.
	 * @return speed
	 */
	public int getSpeed();
	
	/**
	 * Returns an array of each racial bonus.
	 * @return racialBonus
	 */
	public String[] getRacialBonus();
	
	/**
	 * Returns an array of each subracial bonus. (If applicable)
	 * @return racialBonus
	 */
	public String[] getSubRacialBonus();
	
	/**
	 * Returns naturally known languages.
	 * @return languages
	 */
	public String[] getLanguages();

	/**
	 * Returns the size of the race.
	 * @return size
	 */
	public String getSize();
	
	/**
	 * Returns all of the racial attributes in an ArrayList.
	 * @return attributes
	 */
	public List<String> getAllAttributes();
}