/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class MountainDwarf extends Dwarf
{
	private String[] racialBonus = {"Dwarven Armor Training"};
	
	public MountainDwarf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +2 strength bonus from racial modifier.
		super(name, strength + 2, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}