/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class RockGnome extends Dwarf
{
	private String[] racialBonus = {"Artificer's Lore", "Tinker"};
	
	public RockGnome(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 constitution bonus from racial modifier.
		super(name, strength, dexterity, constitution + 1, intelligence, wisdom, charisma);
	}

	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}