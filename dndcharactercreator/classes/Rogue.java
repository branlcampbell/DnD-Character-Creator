/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Rogue 
{
	/** Class variables. */
	private String hitDice = "1d8";
	private int proficiencyBonus = 2;
	private String savingThrows = "Dexterity, Intelligence";
	private String[] skills = {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation",
			"Investigation", "Perception", "Performance", "Persuasion", "Sleight of Hand", "Stealth"};
	private String[] features = {"Expertise", "Sneak Attack", "Thieves' Cant"};
	private String[] proficiencies = {"Light Armor", "Simple Weapons", "Hand Crossbows", "Longswords",
			"Rapiers", "Shortswords", "Thieves' Tools"};
	private String[] firstEquipmentChoice = {"Rapier", "Shortsword"};
	private String[] secondEquipmentChoice = {"Shortbow and Quiver of 20 Arrows", "Shortsword"};
	private String[] thirdEquipmentChoice = {"Burglar's Pack", "Dungeoneer's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Leather Armor, Two Daggers, Thieves' Tools"};
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Rogue()
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