/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class Tiefling extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Infernal"};
	private String[] racialBonus = {"Darkvision", "Hellish Resistance", "Infernal Legacy"};
	
	public Tiefling(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 charisma and +1 intelligence bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence + 1, wisdom, charisma + 2);
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