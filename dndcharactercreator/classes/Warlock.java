/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Warlock implements Class
{
	/** Class variables. */
	private String hitDice = "1d8";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Wisdom", "Charisma"};
	private String[] skills = {"Arcana", "Deception", "History", "Intimidation", "Investigation",
			"Nature", "Religion"};
	private String[] features = {"Otherworldly Patron", "Pact Magic"};
	private String[] proficiencies = {"Light Armor", "Simple Weapons"};
	private String[] firstEquipmentChoice = {"Light Crossbow and 20 Bolts", "Any Simple Weapon"};
	private String[] secondEquipmentChoice = {"Component Pouch", "Arcane Focus"};
	private String[] thirdEquipmentChoice = {"Scholar's Pack", "Dungeoneer's Pack"};
	private String[] guaranteedEquipment = {"Leather Armor", "Any Simple Weapon", "Two Daggers"};
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Warlock()
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
	 * Returns third equipment choice the class has.
	 * @return thirdEquipmentChoice
	 */
	public String[] getThirdEquipmentChoice()
	{
		return thirdEquipmentChoice;
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