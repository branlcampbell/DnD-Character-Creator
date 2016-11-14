/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

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
	
	public Warlock()
	{
		
	}

	public String getHitDice()
	{
		return hitDice;
	}

	public int getHitPoints(int constitution)
	{
		return 8 + constitution;
	}

	public int getProficiencyBonus()
	{
		return proficiencyBonus;
	}

	public String[] getSavingThrows() 
	{
		return savingThrows;
	}

	public String[] getSkills() {
		return skills;
	}

	public String[] getFeatures()
	{
		return features;
	}

	public String[] getProficiencies()
	{
		return proficiencies;
	}

	public String[] getFirstEquipmentChoice()
	{
		return firstEquipmentChoice;
	}

	public String[] getSecondEquipmentChoice()
	{
		return secondEquipmentChoice;
	}

	public String[] getThirdEquipmentChoice()
	{
		return thirdEquipmentChoice;
	}

	public String[] getFourthEquipmentChoice()
	{
		return null;
	}
	
	public String[] getGuaranteedEquipment()
	{
		return guaranteedEquipment;
	}
}