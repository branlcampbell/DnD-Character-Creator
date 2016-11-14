package dndcharactercreator.armor;

public interface Wearable 
{
	/**
	 * Gets the armor class of the piece of armor.
	 * @return armorClass
	 */
	int getArmorClass();
	
	/**
	 * Gets the strength requirement if one is needed.
	 * @return strengthRequirement
	 */
	int getStrengthRequirement();
	
	/**
	 * Gets any modifications to stealth if there are any on the armor.
	 * @return stealth
	 */
	String getStealth();
	
	/**
	 * Gets the weight of the armor in lbs
	 * @return weight
	 */
	int getWeight();
}