package dndcharactercreator.classes;

import java.util.ArrayList;

public interface Class 
{
	/**
	 * Returns the hit dice amount.
	 * @return hitDice
	 */
	String getHitDice();
	
	/**
	 * Returns total hit points from class and constitution modifier.
	 * @return hitPoints
	 */
	int getHitPoints(int constitution);
	
	/**
	 * Returns the proficiency bonus of the class.
	 * @return proficiencyBonus
	 */
	int getProficiencyBonus();
	
	/**
	 * Returns the types of saving throws the class specializes in.
	 * @return savingThrows
	 */
	String[] getSavingThrows();
	
	/**
	 * Returns skills the class can choose from.
	 * @return skills
	 */
	String[] getSkills();
	
	/**
	 * Returns features of the class.
	 * @return features
	 */
	String[] getFeatures();
	
	/**
	 * Returns proficiencies of the class.
	 * @return proficiencies
	 */
	String[] getProficiencies();
	
	/**
	 * Returns first equipment choice the class has.
	 * @return firstEquipmentChoice
	 */
	String[] getFirstEquipmentChoice();
	
	/**
	 * Returns second equipment choice the class has.
	 * @return secondEquipmentChoice
	 */
	String[] getSecondEquipmentChoice();
	
	/**
	 * Returns third equipment choice the class has.
	 * @return thirdEquipmentChoice
	 */
	String[] getThirdEquipmentChoice();
	
	/**
	 * Returns fourth equipment choice the class has.
	 */
	String[] getFourthEquipmentChoice();
	
	/**
	 * Returns the equipment the class is guaranteed to start with.
	 * @return guaranteedEquipment
	 */
	String[] getGuaranteedEquipment();
	
	/**
	 * Returns all features of the class in an ArrayList. Constitution is needed
	 * in order to determine hit points.
	 * @param constitution
	 * @return features
	 */
	ArrayList<String> getAllFeatures(int constitution);
}