/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Dwarf, which extends from superclass NoClass. */
public class HillDwarf extends Dwarf
{
	/** Class variables. */
	private String[] racialBonus = {"Dwarven Toughness"};
	
	public HillDwarf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +1 wisdom bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence, wisdom + 1, charisma);
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
