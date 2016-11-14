/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

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
}