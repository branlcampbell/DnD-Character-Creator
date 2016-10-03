/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Rogue 
{
	/** Class variables. */
	private String hitDie = "1d8 per Rogue Level";
	private String armor = "Light Armor";
	private String weapons = "Simple Weapons, Hand Crossbows, Longswords, Rapiers, Shortswords";
	private String tools = "Thieves' Tools";
	private String savingThrows = "Dexterity, Intelligence";
	private String skills = "Pick 4: Acrobatics, Athletics, Deception, Insight, Intimidation,"
			+ "Investigation, Perception, Performance, Persuasion, Sleight of Hand, Stealth";
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Rogue()
	{
		
	}
	
	/**
	 * Returns the hit die amount.
	 * @return hitDie
	 */
	public String getHitDie()
	{
		return hitDie;
	}
	
	/**
	 * Returns total hit points from class and constitution modifier.
	 * @return hitPoints
	 */
	public int getHitPoints()
	{
		return 8 + character.getConstitution();
	}
	
	/**
	 * Returns the armor types the class is proficient with.
	 * @return armor
	 */
	public String getArmor() 
	{
		return armor;
	}

	/**
	 * Returns the weapons the class can is proficient with.
	 * @return weapons
	 */
	public String getWeapons() 
	{
		return weapons;
	}

	/**
	 * Returns the tools the class is proficient with.
	 * @return tools
	 */
	public String getTools() 
	{
		return tools;
	}

	/**
	 * Returns the types of saving throws that can be made by the class.
	 * @return savingThrows
	 */
	public String getSavingThrows() 
	{
		return savingThrows;
	}

	/**
	 * Returns the skills the class can choose from.
	 * @return skills
	 */
	public String getSkills() {
		return skills;
	}
}
