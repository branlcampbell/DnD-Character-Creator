/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Rogue implements Class
{
	private String hitDice = "1d8";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Dexterity", "Intelligence"};
	private String[] skills = {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation",
			"Investigation", "Perception", "Performance", "Persuasion", "Sleight of Hand", "Stealth"};
	private String[] features = {"Expertise", "Sneak Attack", "Thieves' Cant"};
	private String[] proficiencies = {"Light Armor", "Simple Weapons", "Hand Crossbows", "Longswords",
			"Rapiers", "Shortswords", "Thieves' Tools"};
	private String[] firstEquipmentChoice = {"Rapier", "Shortsword"};
	private String[] secondEquipmentChoice = {"Shortbow and Quiver of 20 Arrows", "Shortsword"};
	private String[] thirdEquipmentChoice = {"Burglar's Pack", "Dungeoneer's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Leather Armor, Two Daggers, Thieves' Tools"};
	
	public Rogue()
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
	
	public ArrayList<String> getAllFeatures(int constitution)
	{
		ArrayList<String> features = new ArrayList<String>();
		
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