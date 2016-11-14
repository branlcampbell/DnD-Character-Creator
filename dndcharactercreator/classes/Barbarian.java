/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

public class Barbarian implements Class
{
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
	
	public Barbarian()
	{
		
	}

	public String getHitDice()
	{
		return hitDice;
	}

	public int getHitPoints(int constitution)
	{
		return 12 + constitution;
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
		return null;
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