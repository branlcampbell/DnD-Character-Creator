/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Barbarian 
{
	/** Class variables. */
	private String hitDice = "1d12";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Strength", "Constitution"};
	private String[] skills = {"Animal Handling", "Athletics", "Intimidation", "Nature",
			"Perception", "Survival"};
	private String[] features = {"Rage", "Unarmored Defense"};
	private String[] proficiencies = {"Light Armor", "Medium Armor", "Shields", "Simple Weapons",
			"Martial Weapons"};
	private String[] firstEquipmentChoice = {"Greataxe", "Martial Melee Weapon"};
	private String[] secondEquipmentChoice = {"Two Handaxes", "Any Simple Weapon"};
	private String [] guaranteedEquipment = {"Explorer's Pack", "Four Javelins"};
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Barbarian()
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
		return 12 + character.getConstitution();
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