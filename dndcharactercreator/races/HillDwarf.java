/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Dwarf, which extends from superclass NoClass. */
public class HillDwarf extends Dwarf
{
	/** Class variables. */
	private String racialBonus = "Dwarven Toughness";
	
	public HillDwarf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the subrace's racial bonus.
	 * @return racialBonus
	 */
	public String getSubRacialBonus()
	{
		return racialBonus;
	}
	
	/**
	 * Returns the racially modified wisdom.
	 * @return wisdom + 1
	 */
	public int modifyWisdom()
	{
		return getWisdom() + 1;
	}
}
