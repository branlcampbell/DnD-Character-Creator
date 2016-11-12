package dndcharactercreator.classes;

public interface Class 
{
	String getHitDice();
	
	int getHitPoints();
	
	int getProficiencyBonus();
	
	String[] getSavingThrows();
	
	String[] getSkills();
	
	String[] getFeatures();
	
	String[] getProficiencies();
	
	String[] getFirstEquipmentChoice();
	
	String[] getSecondEquipmentChoice();
}
