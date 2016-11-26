/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class LightFoot extends Halfling
{
	private String[] subRacialBonus = {"Naturally Stealthy"};
	
	public LightFoot(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 charisma bonus from racial modifier.
		super(name, strength, dexterity, constitution, intelligence, wisdom, charisma + 1);
	}
	
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}