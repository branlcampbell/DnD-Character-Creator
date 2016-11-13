package dndcharactercreator.backgrounds;

public interface Background 
{
	String[] getSkillProficiencies();
	
	String[] getEquipment();
	
	String[] getFeatures();
	
	String[] getPersonalityTraits();
	
	String[] getIdeals();
	
	String[] getBonds();
	
	String[] getFlaws();
	
	String getBackgroundName();
}