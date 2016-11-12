/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;
import dndcharactercreator.races.*;

public class Fighter implements Class
{
	/** Class variables. */
	private String hitDice = "1d10";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Strength", "Constitution"};
	private String[] skills = {"Acrobatics", "Animal Handling", "Athletics", "History", "Insight",
			"Intimidation", "Perception", "Survival"};
	private String[] features = {"Fighting Style", "Second Wind"};
	private String[] proficiencies = {"All Armor", "Shields", "Simple Weapons", "Martial Weapons"};
	private String[] firstEquipmentChoice = {"Chain Mail", "Leather, Longbow, and 20 Arrows"};
	private String[] secondEquipmentChoice = {"Martial Weapon and a Shield", "Two Martial Weapons"};
	private String[] thirdEquipmentChoice = {"Light Crossbow and 20 Bolts", "Two Handaxes"};
	private String[] fourthEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};
	
	/** Allows for constitution to be retrieved. */
	NoRace character;
	
	Fighter()
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
		return 10 + character.getConstitution();
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
	 * Returns fourth equipment choice the class has.
	 * @return fourthEquipmentChoice
	 */
	public String[] getFourthEquipmentChoice()
	{
		return fourthEquipmentChoice;
	}
}