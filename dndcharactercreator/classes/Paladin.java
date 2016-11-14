/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

public class Paladin implements Class
{
	private String hitDice = "1d10";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Wisdom", "Charisma"};
	private String[] skills = {"Athletics", "Insight", "Intimidation", "Medicine", "Persuasion", "Religion"};
	private String[] features = {"Divine Sense", "Lay on Hands"};
	private String[] proficiencies = {"All Armor", "Shields", "Simple Weapons", "Martial Weapons"};
	private String[] firstEquipmentChoice = {"Martial Weapon and a Shield", "Two Martial Weapons"};
	private String[] secondEquipmentChoice = {"5 Javelins", "Any Simple Melee Weapon"};
	private String[] thirdEquipmentChoice = {"Priest's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Chain Mail", "Holy Symbol"};

	public Paladin()
	{
		
	}
	
	public String getHitDice()
	{
		return hitDice;
	}
	
	public int getHitPoints(int constitution)
	{
		return 10 + constitution;
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