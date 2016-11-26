/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

import java.util.ArrayList;
import java.util.Arrays;

public class Human extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Additional Language"};
	
	public Human(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +1 to all attributes bonus from racial modifier. */
		super(name, strength + 1, dexterity + 1, constitution + 1, intelligence + 1, wisdom + 1, charisma + 1);
	}

	public int getSpeed()
	{
		return speed;
	}

	public String[] getLanguages()
	{
		return languages;
	}

	public String[] getRacialBonus()
	{
		return null;
	}
	
	public String[] getSubRacialBonus()
	{
		return null;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public ArrayList<String> getAllAttributes()
	{
		ArrayList<String> attributes = new ArrayList<String>();
		attributes.add(getName());
		attributes.add(String.valueOf(getStrength()));
		attributes.add(String.valueOf(getDexterity()));
		attributes.add(String.valueOf(getConstitution()));
		attributes.add(String.valueOf(getIntelligence()));
		attributes.add(String.valueOf(getWisdom()));
		attributes.add(String.valueOf(getCharisma()));
		attributes.add(String.valueOf(getSpeed()));
		attributes.add(Arrays.toString(getRacialBonus()));
		attributes.add(Arrays.toString(getSubRacialBonus()));
		attributes.add(Arrays.toString(getLanguages()));
		attributes.add(String.valueOf(getSize()));
		return attributes;
	}
}