/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Halfling, which extends from superclass NoClass. */
public class Stout extends Halfling
{
	/** Class variables. */
	private String subRacialBonus = "Stout Resilience";
	
	public Stout(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the subracial bonus
	 * @return subRacialBonus
	 */
	public String getSubRacialBonus()
	{
		return subRacialBonus;
	}
	
	/**
	 * Returns the subracially modified constitution.
	 * @return constitution + 1
	 */
	public int modifyIntelligence()
	{
		return getIntelligence() + 1;
	}
}