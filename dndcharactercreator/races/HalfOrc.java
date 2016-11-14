/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class HalfOrc extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Orc"};
	private String[] racialBonus = {"Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks"};
	
	public HalfOrc(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 strength and +1 constitution bonus from racial modifier. */
		super(name, strength + 2, dexterity, constitution + 1, intelligence, wisdom, charisma);
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