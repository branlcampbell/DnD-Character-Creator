/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Dwarf, which extends from superclass NoClass. */
public class MountainDwarf extends Dwarf
{
	/** Class variables. */
	private String[] racialBonus = {"Dwarven Armor Training"};
	
	public MountainDwarf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 strength bonus from racial modifier. */
		super(name, strength + 2, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the subrace's racial bonus.
	 * @return racialBonus
	 */
	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}
