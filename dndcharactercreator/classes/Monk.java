/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Monk implements Class
{
	/** Class variables. */
	private String hitDice = "1d8";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Strength", "Dexterity"};
	private String[] skills = {"Acrobatics", "Athletics", "History", "Insight", "Religion", "Stealth"};
	private String[] features = {"Unarmored Defense", "Martial Arts"};
	private String[] proficiencies = {"Simple Weapons", "Shortswords", "One Type of Artisan's Tool or "
			+ "Musical Instrument"};
	private String[] firstEquipmentChoice = {"Shortsword", "Any Simple Weapon"};
	private String[] secondEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"10 Darts"};
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Monk()
	{
		
	}
	
	/**
	 * Returns the hit dice amount.
	 * @return hitDice
	 */
	public String getHitDice()
	{
		return hitDice;
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
	 * Returns the proficiency bonus of the class.
	 * @return proficiencyBonus
	 */
	public int getProficiencyBonus()
	{
		return proficiencyBonus;
	}

	/**
	 * Returns the types of saving throws that can be made by the class.
	 * @return savingThrows
	 */
	public String[] getSavingThrows() 
	{
		return savingThrows;
	}

	/**
	 * Returns the skills the class can choose from.
	 * @return skills
	 */
	public String[] getSkills() {
		return skills;
	}
	
	/**
	 * Returns features of class.
	 * @return features
	 */
	public String[] getFeatures()
	{
		return features;
	}
	
	/**
	 * Returns proficiencies of class.
	 * @return proficiencies
	 */
	public String[] getProficiencies()
	{
		return proficiencies;
	}
	
	/**
	 * Returns first equipment choice the class has.
	 * @return firstEquipmentChoice
	 */
	public String[] getFirstEquipmentChoice()
	{
		return firstEquipmentChoice;
	}
	
	/**
	 * Returns second equipment choice the class has.
	 * @return secondEquipmentChoice
	 */
	public String[] getSecondEquipmentChoice()
	{
		return secondEquipmentChoice;
	}
	
	/**
	 * Returns the equipment the class is guaranteed to start with.
	 * @return guaranteedEquipment
	 */
	public String[] getGuaranteedEquipment()
	{
		return guaranteedEquipment;
	}
}