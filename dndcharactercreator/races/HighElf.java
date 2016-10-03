/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Elf, which extends from superclass NoClass. */
public class HighElf extends Elf
{
	/** Class variables. */
	private String subRacialBonus = "Elf Weapon Training, Cantrip, Extra Language";
	
	public HighElf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns a string stating all subracial bonuses.
	 * @return subRacialBonus
	 */
	public String getSubRacialBonus()
	{
		return subRacialBonus;
	}
	
	/**
	 * Returns the subracially modified intelligence.
	 * @return intelligence + 1
	 */
	public int modifyIntelligence()
	{
		return getIntelligence() + 1;
	}
}