/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Halfling, which extends from superclass NoClass. */
public class LightFoot extends Halfling
{
	/** Class variables. */
	private String subRacialBonus = "Naturally Stealthy";
	
	public LightFoot(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the subracial bonus.
	 * @return subRacialBonus
	 */
	public String getSubRacialBonus()
	{
		return subRacialBonus;
	}
	
	/**
	 * Returns the subracially modified charisma.
	 * @return charisma + 1
	 */
	public int modifyCharisma()
	{
		return getCharisma() + 1;
	}
}