/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Dwarf, which extends from superclass NoClass. */
public class ForestGnome extends Gnome
{
	/** Class variables. */
	private String racialBonus[] = {"Natural Illusionist", "Speak with Small Beasts"};
	
	public ForestGnome(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +1 dexterity bonus from racial modifier. */
		super(name, strength, dexterity + 1, constitution, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the subrace's racial bonus.
	 * @return racialBonus
	 */
	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}
