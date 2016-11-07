/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Elf, which extends from superclass NoClass. */
public class DarkElf extends Elf
{
	/** Class variables. */
	private String[] subRacialBonus = {"Elf Weapon Training, Cantrip, Extra Language"};
	
	public DarkElf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns a string stating all subracial bonuses.
	 * @return subRacialBonus
	 */
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}