/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class HillDwarf extends Dwarf
{
	private String[] racialBonus = {"Dwarven Toughness"};
	
	public HillDwarf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +1 wisdom bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence, wisdom + 1, charisma);
	}

	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}