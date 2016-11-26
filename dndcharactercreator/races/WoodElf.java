/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class WoodElf extends Elf
{
	private String[] subRacialBonus = {"Elf Weapon Training, Fleet of Foot, Mask of the Wild"};
	
	public WoodElf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +1 wisdom bonus from racial modifier.
		super(name, strength, dexterity, constitution, intelligence, wisdom + 1, charisma);
	}
	
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}