/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class Stout extends Halfling
{
	private String[] subRacialBonus = {"Stout Resilience"};
	
	public Stout(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 intelligence bonus from racial modifier.
		super(name, strength, dexterity, constitution, intelligence + 1, wisdom, charisma);
	}
	
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}