/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class Gnome extends NoRace
{
	private int speed = 25;
	private String size = "Small";
	private String[] languages = {"Common", "Gnomish"};
	private String[] racialBonus = {"Darkvision", "Gnome Cunning"};
	
	public Gnome(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 intelligence bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence + 2, wisdom, charisma);
	}
	
	public int getSpeed()
	{
		return speed;
	}

	public String[] getRacialBonus()
	{
		return racialBonus;
	}
	
	public String[] getSubRacialBonus()
	{
		return null;
	}

	public String[] getLanguages()
	{
		return languages;
	}

	public String getSize()
	{
		return size;
	}
}