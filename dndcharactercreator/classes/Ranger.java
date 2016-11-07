/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Ranger 
{
	/** Class variables. */
	private String hitDice = "1d10";
	private int proficiencyBonus = 2;
	private String savingThrows = "Strength, Dexterity";
	private String[] skills = {"Animal Handling", "Athletics", "Insight", "Investigation",
			"Nature", "Perception", "Stealth", "Survival"};
	private String[] features = {"Favored Enemy", "Natural Explorer"};
	private String[] proficiencies = {"Light Armor", "Medium Armor", "Shields", "Simple Weapons",
			"Martial Weapons"};
	private String[] firstEquipmentChoice = {"Scale Mail", "Leather Armor"};
	private String[] secondEquipmentChoice = {"Two Shortswords", "Two Simple Melee Weapons"};
	private String[] thirdEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Longbow", "Quiver of 20 Arrows"};
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Ranger()
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
		return 6 + character.getConstitution();
	}
	
	/**
	 * Returns the proficiency bonus of the class.
	 * @return proficiencyBonus
	 */
	public int proficiencyBonus()
	{
		return proficiencyBonus;
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