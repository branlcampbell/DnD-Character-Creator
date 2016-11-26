/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Wizard implements Class
{
	private int numHitDie = 1;
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