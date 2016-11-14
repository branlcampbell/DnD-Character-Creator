/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

public class Wizard implements Class
{
	/** Class variables. */
	private String hitDice = "1d6";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Intelligence", "Wisdom"};
	private String[] skills = {"Arcana", "History", "Insight", "Investigation", "Medicine", "Religion"};
	private String[] features = {"Spellcasting", "Arcane Recovery"};
	private String[] proficiencies = {"Daggers", "Darts", "Slings", "Quarterstaffs", "Light Crossbows"};
	private String[] firstEquipmentChoice = {"Quarterstaff", "Dagger"};
	private String[] secondEquipmentChoice = {"Component Pouch", "Arcane Focus"};
	private String[] thirdEquipmentChoice = {"Scholar's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Spellbook"};

	public Wizard()
	{
		
	}

	public String getHitDice()
	{
		return hitDice;
	}

	public int getHitPoints(int constitution)
	{
		return 6 + constitution;
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