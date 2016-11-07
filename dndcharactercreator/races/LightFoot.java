/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Halfling, which extends from superclass NoClass. */
public class LightFoot extends Halfling
{
	/** Class variables. */
	private String[] subRacialBonus = {"Naturally Stealthy"};
	
	public LightFoot(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +1 charisma bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma + 1);
	}
	
	/**
	 * Returns the subracial bonus.
	 * @return subRacialBonus
	 */
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}