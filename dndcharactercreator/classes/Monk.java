/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Monk implements Class
{
	private int numHitDie = 1;
	private String hitDice = "d8";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Strength", "Dexterity"};
	private String[] skills = {"Acrobatics", "Athletics", "History", "Insight", "Religion", "Stealth"};
	private String[] features = {"Unarmored Defense", "Martial Arts"};
	private String[] proficiencies = {"Simple Weapons", "Shortswords", "One Type of Artisan's Tool or "
			+ "Musical Instrument"};
	private String[] firstEquipmentChoice = {"Shortsword", "Any Simple Weapon"};
	private String[] secondEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"10 Darts"};
	
	public Monk()
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