/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class Dragonborn extends NoRace
{
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Draconic"};
	private String[] racialBonus = {"Breath Weapon", "Damage Resistance Based on Draconic Ancestry"};
	
	public Dragonborn(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 strength and +1 charisma bonus from racial modifier. */
		super(name, strength + 2, dexterity, constitution, intelligence, wisdom, charisma + 1);
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