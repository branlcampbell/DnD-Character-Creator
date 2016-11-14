package dndcharactercreator.weapons;

public interface Wieldable 
{
	/**
	 * Gets the die used to determine how much damage is dealt.
	 * @return damageDie
	 */
	String getDamageDie();
	
	/**
	 * Gets the type of damage that is inflicted upon the target.
	 * @return damageType
	 */
	String getDamageType();
	
	/**
	 * Gets the weight of the weapon.
	 * @return weight
	 */
	int getWeight();

	/**
	 * Gets properties unique to the weapon.
	 * @return properties
	 */
	String getProperties();
}