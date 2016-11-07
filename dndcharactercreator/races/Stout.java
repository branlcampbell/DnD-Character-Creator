/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Halfling, which extends from superclass NoClass. */
public class Stout extends Halfling
{
	/** Class variables. */
	private String[] subRacialBonus = {"Stout Resilience"};
	
	public Stout(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +1 intelligence bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence + 1, wisdom, charisma);
	}
	
	/**
	 * Returns the subracial bonus
	 * @return subRacialBonus
	 */
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}