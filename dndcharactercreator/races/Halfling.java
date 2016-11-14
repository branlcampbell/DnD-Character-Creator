/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class Halfling extends NoRace
{
	private int speed = 25;
	private String size = "Medium";
	private String[] languages = {"Common", "Halfling"};
	private String[] racialBonus = {"Lucky", "Brave", "Halfling Nimbleness"};
	
	public Halfling(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 dexterity bonus from racial modifier. */
		super(name, strength, dexterity + 2, constitution, intelligence, wisdom, charisma);
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