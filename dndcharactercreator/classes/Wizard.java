/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Wizard 
{
	/** Class variables. */
	private String hitDie = "1d6 per Wizard Level";
	private String armor = "None";
	private String weapons = "Daggers, Darts, Slings, Quarterstaffs, Light Crossbows";
	private String tools = "None";
	private String savingThrows = "Intelligence, Wisdom";
	private String skills = "Pick 2: Arcana, History, Insight, Investigation, Medicine, Religion";
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Wizard()
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
		return 6 + character.getConstitution();
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
