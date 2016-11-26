/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Bard implements Class
{
	private int numHitDie = 1;
	private String hitDice = "d8";
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