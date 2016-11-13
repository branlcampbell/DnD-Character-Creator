package dndcharactercreator.races;

public interface Racial 
{
	public String getName();
	
	public int getStrength();
	
	public int getDexterity();
	
	public int getConstitution();
	
	public int getIntelligence();
	
	public int getWisdom();
	
	public int getCharisma();
	
	public int getSpeed();
	
	public String[] getRacialBonus();
	
	public String[] getLanguages();

	public int getSize();
}