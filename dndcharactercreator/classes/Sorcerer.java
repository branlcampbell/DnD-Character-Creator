/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorcerer implements Class
{
	private int numHitDie = 1;
	private String hitDice = "1d6";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Constitution", "Charisma"};
	private String[] skills = {"Arcana", "Deception", "Insight", "Intimidation", "Persuasion", "Religion"};
	private String[] features = {"Spellcasting", "Sorcerous Origin"};
	private String[] proficiencies = {"Daggers", "Darts", "Slings", "Quarterstaffs", "Light Crossbows"};
	private String[] firstEquipmentChoice = {"Light Crossbow and 20 Bolts", "Any Simple Weapon"};
	private String[] secondEquipmentChoice = {"Component Pouch", "Arcane Focus"};
	private String[] thirdEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Two Daggers"};

	public Sorcerer()
	{
		
	}

	public int getNumHitDie()
	{
		return numHitDie;
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
	
	public ArrayList<String> getAllFeatures(int constitution)
	{
		ArrayList<String> features = new ArrayList<String>();
		features.add(String.valueOf(getNumHitDie()));
		features.add(getHitDice());
		features.add(String.valueOf(getHitPoints(constitution)));
		features.add(String.valueOf(getProficiencyBonus()));
		features.add(Arrays.toString(getSavingThrows()));
		features.add(Arrays.toString(getSkills()));
		features.add(Arrays.toString(getFeatures()));
		features.add(Arrays.toString(getProficiencies()));
		features.add(Arrays.toString(getGuaranteedEquipment()));
		return features;
	}
}