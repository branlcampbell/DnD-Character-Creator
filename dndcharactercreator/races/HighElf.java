/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

public class HighElf extends Elf
{
	private String[] subRacialBonus = {"Elf Weapon Training, Cantrip, Extra Language"};
	
	public HighElf(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		//+1 intelligence bonus from racial modifier.
		super(name, strength, dexterity, constitution, intelligence + 1, wisdom, charisma);
	}
	
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}
}