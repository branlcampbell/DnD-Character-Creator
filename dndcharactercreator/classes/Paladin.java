/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Paladin implements Class
{
	private int numHitDie = 1;
	private String hitDice = "d10";
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