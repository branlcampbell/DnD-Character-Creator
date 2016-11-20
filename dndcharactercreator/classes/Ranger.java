/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranger implements Class
{
	private String hitDice = "1d10";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Strength", "Dexterity"};
	private String[] skills = {"Animal Handling", "Athletics", "Insight", "Investigation",
			"Nature", "Perception", "Stealth", "Survival"};
	private String[] features = {"Favored Enemy", "Natural Explorer"};
	private String[] proficiencies = {"Light Armor", "Medium Armor", "Shields", "Simple Weapons",
			"Martial Weapons"};
	private String[] firstEquipmentChoice = {"Scale Mail", "Leather Armor"};
	private String[] secondEquipmentChoice = {"Two Shortswords", "Two Simple Melee Weapons"};
	private String[] thirdEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Longbow", "Quiver of 20 Arrows"};
	
	public Ranger()
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