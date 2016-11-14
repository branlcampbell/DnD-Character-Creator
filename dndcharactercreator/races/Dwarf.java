/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class Dwarf extends NoRace
{
	private int speed = 25;
	private String size = "Medium";
	private String[] languages = {"Common", "Dwarven"};
	private String[] racialBonus = {"Speed is unaffected when wearing heavy armor",
			"Darkvision", "Dwarven Resilience", "Dwarven Combat Training", "Tool Proficiency",
			"Stonecunning"};
	
	public Dwarf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 constitution bonus from racial modifier. */
		super(name, strength, dexterity, constitution + 2, intelligence, wisdom, charisma);
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