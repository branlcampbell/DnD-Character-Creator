/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

public class Bard implements Class
{
	private String hitDice = "1d8";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Dexterity", "Charisma"};
	private String[] skills = {"Acrobatics", "Animal Handling", "Arcana", "Athletics", "Deception", 
			"History", "Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception",
			"Performance", "Persuasion", "Religion", "Sleight of Hand", "Stealth", "Survival"};
	private String[] features = {"Spellcasting", "Bardic Inspiration"};
	private String[] proficiencies = {"Light Armor", "Simple Weapons", "Hand Crossbows",
			"Longswords", "Rapiers", "Shortswords", "Three Musical Instruments of Your Choice"};
	private String[] firstEquipmentChoice = {"Rapier", "Longsword", "Any Simple Weapon"};
	private String[] secondEquipmentChoice = {"Diplomat's Pack", "Entertainer's Pack"};
	private String[] thirdEquipmentChoice = {"Lute", "Any Other Musical Instrument"};
	private String[] guaranteedEquipment = {"Leather Armor", "Dagger"};
	
	public Bard()
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